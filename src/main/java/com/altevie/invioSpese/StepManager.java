package com.altevie.invioSpese;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.tools.ant.DirectoryScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.altevie.invioSpese.jaxb.fileAllegato.Precompilata;
import com.altevie.invioSpese.jaxb.fileAllegato.Precompilata.DocumentoSpesa;

@Component
public class StepManager {
	
	private static final Logger logger = LoggerFactory.getLogger(StepManager.class);
	
	@Autowired
	private ConfigPropertiesInvioSpese configPropertiesIvioSpese;
	
	@Autowired
	private Encrypt  encrypt;
	
	private static final String FORMAT_DATE_CSV = "dd/MM/yyyy";
	
	private String outputPath ;	
    private JAXBContext contextCrea;
    private JAXBContext contextModifica;
    private JAXBContext contextAnnulla;
	
	private boolean isContinue = true;
	
	public void doSteps() {		
		configPropertiesIvioSpese.getOutputpath();
		
		checkFile();
		if(isContinue) {
			try {
				readFile();
			} catch (Exception e) {
				logger.error("Error in parse csv:", e);
			}
		}
		if(isContinue) {
			checkOutputFolder();
		}
		if(isContinue) {
			try {
				doEncrypt();
			} catch (Exception e) {
				logger.error("Error in jaxb:", e);
			}
		}
	}
	
	public void checkOutputFolder() {
		Date timestamp = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String format = formatter.format(timestamp);
		outputPath = "";
		outputPath = outputPath + "_" + format; 
		
		File f = new File(outputPath);
		logger.info("Check exists output folders:"+ outputPath); 
		if(!f.exists()) { 
			f.mkdir();
		}
		
		if(true) {
			f = new File(outputPath+"");
			logger.info("Check exists output folders:"+ outputPath+""); 
			if(!f.exists()) { 
				f.mkdir();
			}			
		}
	}
	
	public void checkFile() {
		
		File f = new File("");
		logger.info("Check exists file:"+""); 
		if(!(f.exists() && !f.isDirectory())) { 
			logger.info("Please check file in :"+"");
			isContinue=false;
		}
	}

	public void readFile() throws Exception {
		Reader reader = null;
		try {           
			reader = new FileReader("");

			reader.close();
		} catch (IOException e) {
			logger.error("Error: " + e.getMessage());
		}
	}
	
	public void writeXml() throws JAXBException {
		/*
		if(!CollectionUtils.isEmpty(creaList)) {			
			contextCrea = JAXBContext.newInstance(CreaComunicazioneInput.class);			
			Marshaller marshallerCrea = contextCrea.createMarshaller();
			creaList.forEach((key, value) -> {
				try {
					for (CreaComunicazioneInput each : value) {
						marshallerCrea.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
						marshallerCrea.marshal(each, new File(outputPath+ConfigPropertiesSmart.invioPath + "/" + key + "/" + key 
								+ "-" + each.getSezioneLavoratore().getCodiceFiscaleLavoratore() + ".xml"));
					}
				} catch (Exception e) {
					logger.error("ERROR: ", e);
				}
			});
		}
		*/
	}
	
	private Calendar getCalendarByCsv(String valueString) {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATE_CSV);
		Date date;
		Calendar cal = null;
		try {
			date = sdf.parse(valueString);
			cal = Calendar.getInstance();
			cal.setTime(date);
		} catch (ParseException e) {
			logger.error("Cannot convert string date : " + valueString);
		}
		return cal;
	}
	
    public String doEncrypt() {
    	logger.info("*** Start Invio Spese Mediche Coni ***");    	
    	File fileInput = new File("");
    	JAXBContext jaxbContext = null;
		try {
			jaxbContext = JAXBContext.newInstance (Precompilata.class);
		} catch (JAXBException e) {
			logger.error(e.getMessage());
		}
    	
    	Unmarshaller jaxbUnmarshaller = null;
		try {
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			logger.error(e.getMessage());
		}
		Precompilata precompilata = null;
    	try {
    		precompilata = (Precompilata) jaxbUnmarshaller.unmarshal(fileInput);
		} catch (JAXBException e) {
			logger.error(e.getMessage());
		}
    	
    	if(precompilata.getProprietario()!=null) {
    		if(StringUtils.hasText(precompilata.getProprietario().getCfProprietario())) {
    			String cf = precompilata.getProprietario().getCfProprietario();
    			String cfEnc = encrypt.getEncryptStringBase64(cf);
    			precompilata.getProprietario().setCfProprietario(cfEnc);
    		}
    	}
    	for(DocumentoSpesa ds : precompilata.getDocumentoSpesa()) {
    		if(StringUtils.hasText(ds.getCfCittadino())) {
    			String cfcitt = ds.getCfCittadino();
    			String cfcittEnc = encrypt.getEncryptStringBase64(cfcitt);
    			ds.setCfCittadino(cfcittEnc);
    		}
    	}
    	
    	Marshaller jaxbMarshaller = null;
    	
    	try {
			jaxbMarshaller = jaxbContext.createMarshaller();
		} catch (JAXBException e) {
			logger.error(e.getMessage());
		}
    	Date timestamp = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String format = formatter.format(timestamp);
    	File fileOutput = new File("./output/sportsalute_ts.xml");
    	
    	try {
			jaxbMarshaller.marshal(precompilata, fileOutput);
		} catch (JAXBException e) {
			logger.error(e.getMessage());
		}
    	
    	logger.debug(fileOutput.getAbsolutePath());

    	logger.info("*** Fine Invio Spese Mediche Coni ***");
       
        return "createxmlenc";
    }

	public void performs() throws Exception {
		Date timestamp = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String format = formatter.format(timestamp);
		String outputPathDir = configPropertiesIvioSpese.getOutputpath();
		outputPathDir = outputPathDir + "/" + format;		
		File f = new File(outputPathDir);
		if(!f.exists()) { 
			f.mkdir();
		}
		
		logger.info("Perform Coni:");
		performsConi(outputPathDir);		
		logger.info("Perform S&S:");
		performsSportSalute(outputPathDir);		
	}

	private void performsSportSalute(String outputPathDir) throws JAXBException, IOException {
    	JAXBContext jaxbContext = JAXBContext.newInstance (Precompilata.class);    	
    	Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    	Marshaller jaxbMarshaller = jaxbContext.createMarshaller();	
    	
		DirectoryScanner scanner = new DirectoryScanner();
		scanner.setIncludes(new String[]{"**/*.xml"});
		scanner.setBasedir(configPropertiesIvioSpese.getSourceSportSalute());
		scanner.setCaseSensitive(false);
		scanner.scan();
		String[] files = scanner.getIncludedFiles();
		if(!CollectionUtils.isEmpty(Arrays.asList(files))) {
			for (String each : files) {
				logger.info(each);
				File fileInput = new File(configPropertiesIvioSpese.getSourceSportSalute()+"/"+each);
				Precompilata precompilata = (Precompilata) jaxbUnmarshaller.unmarshal(fileInput);
		    	if(precompilata.getProprietario()!=null) {
		    		if(StringUtils.hasText(precompilata.getProprietario().getCfProprietario())) {
		    			String cf = precompilata.getProprietario().getCfProprietario();
		    			String cfEnc = encrypt.getEncryptStringBase64(cf);
		    			precompilata.getProprietario().setCfProprietario(cfEnc);
		    		}
		    	}
		    	for(DocumentoSpesa ds : precompilata.getDocumentoSpesa()) {
		    		if(StringUtils.hasText(ds.getCfCittadino())) {
		    			String cfcitt = ds.getCfCittadino();
		    			String cfcittEnc = encrypt.getEncryptStringBase64(cfcitt);
		    			ds.setCfCittadino(cfcittEnc);
		    		}
		    		/*
		    		ds.setPagamentoTracciato("SI");
		    		ds.setTipoDocumento("F");
		    		ds.setFlagOpposizione("0");
		    		if(!CollectionUtils.isEmpty(ds.getVoceSpesa())) {
		        		for (Precompilata.DocumentoSpesa.VoceSpesa eachVoce : ds.getVoceSpesa()) {
		        			eachVoce.setAliquotaIVA(null);
		        			eachVoce.setNaturaIVA("N4");
		    			}
		    		}
		    		*/
		    	}		    	
	    	
		    	File directory = new File(outputPathDir+"/sport_salute");
				if(!directory.exists()) { 
					directory.mkdir();
				}
		    	File fileOutput = new File(outputPathDir+"/sport_salute/Encrypt_"+each);
		    	fileOutput.createNewFile();
		    	FileOutputStream oFile = new FileOutputStream(fileOutput, false); 
				jaxbMarshaller.marshal(precompilata, fileOutput);		    	
		    	logger.debug(fileOutput.getAbsolutePath());
			}
	    	File fileOutput = new File(outputPathDir+"/sport_salute/info.txt");
	    	fileOutput.createNewFile();
	    	FileOutputStream oFile = new FileOutputStream(fileOutput, false);
	    	oFile.write(("pincode:" + encrypt.getEncryptStringBase64("")).getBytes());
	    	oFile.flush();
	    	oFile.close();
		}

	}

	private void performsConi(String outputPathDir) throws Exception {
    	JAXBContext jaxbContext = JAXBContext.newInstance (Precompilata.class);    	
    	Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    	Marshaller jaxbMarshaller = jaxbContext.createMarshaller();	
    	
		DirectoryScanner scanner = new DirectoryScanner();
		scanner.setIncludes(new String[]{"**/*.xml"});
		scanner.setBasedir(configPropertiesIvioSpese.getSourceConi());
		scanner.setCaseSensitive(false);
		scanner.scan();
		String[] files = scanner.getIncludedFiles();
		if(!CollectionUtils.isEmpty(Arrays.asList(files))) {
			for (String each : files) {
				logger.info(each);
				File fileInput = new File(configPropertiesIvioSpese.getSourceConi()+"/"+each);
				Precompilata precompilata = (Precompilata) jaxbUnmarshaller.unmarshal(fileInput);
		    	if(precompilata.getProprietario()!=null) {
		    		if(StringUtils.hasText(precompilata.getProprietario().getCfProprietario())) {
		    			String cf = precompilata.getProprietario().getCfProprietario();
		    			String cfEnc = encrypt.getEncryptStringBase64(cf);
		    			precompilata.getProprietario().setCfProprietario(cfEnc);
		    		}
		    	}
		    	for(DocumentoSpesa ds : precompilata.getDocumentoSpesa()) {
		    		if(StringUtils.hasText(ds.getCfCittadino())) {
		    			String cfcitt = ds.getCfCittadino();
		    			String cfcittEnc = encrypt.getEncryptStringBase64(cfcitt);
		    			ds.setCfCittadino(cfcittEnc);
		    		}
		    		/*
		    		ds.setPagamentoTracciato("SI");
		    		ds.setTipoDocumento("F");
		    		ds.setFlagOpposizione("0");
		    		if(!CollectionUtils.isEmpty(ds.getVoceSpesa())) {
		        		for (Precompilata.DocumentoSpesa.VoceSpesa eachVoce : ds.getVoceSpesa()) {
		        			eachVoce.setAliquotaIVA(null);
		        			eachVoce.setNaturaIVA("N4");
		    			}
		    		}
		    		*/
		    	}		    	
	    	
		    	File directory = new File(outputPathDir+"/coni");
				if(!directory.exists()) { 
					directory.mkdir();
				}
		    	File fileOutput = new File(outputPathDir+"/coni/Encrypt_"+each);
		    	fileOutput.createNewFile();
		    	FileOutputStream oFile = new FileOutputStream(fileOutput, false); 
				jaxbMarshaller.marshal(precompilata, fileOutput);		    	
		    	logger.debug(fileOutput.getAbsolutePath());
			}
	    	File fileOutput = new File(outputPathDir+"/coni/info.txt");
	    	fileOutput.createNewFile();
	    	FileOutputStream oFile = new FileOutputStream(fileOutput, false);
	    	oFile.write(("pincode:" + encrypt.getEncryptStringBase64("")).getBytes());
	    	oFile.flush();
	    	oFile.close();
		}

	}

	
}

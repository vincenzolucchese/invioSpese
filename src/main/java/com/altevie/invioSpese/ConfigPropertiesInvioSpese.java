package com.altevie.invioSpese;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "inviospese")
public class ConfigPropertiesInvioSpese {

	private String outputpath;
	private String sourceConi;
	private String sourceSportSalute;
	private String certificate;
	
	public String getOutputpath() {
		return outputpath;
	}
	public void setOutputpath(String outputpath) {
		this.outputpath = outputpath;
	}
	public String getSourceConi() {
		return sourceConi;
	}
	public void setSourceConi(String sourceConi) {
		this.sourceConi = sourceConi;
	}
	public String getSourceSportSalute() {
		return sourceSportSalute;
	}
	public void setSourceSportSalute(String sourceSportSalute) {
		this.sourceSportSalute = sourceSportSalute;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

}

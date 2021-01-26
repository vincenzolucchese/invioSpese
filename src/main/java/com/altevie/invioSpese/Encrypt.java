package com.altevie.invioSpese;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.Base64;

import javax.crypto.Cipher;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Encrypt {
	
	private static final Logger logger = LoggerFactory.getLogger(Encrypt.class);
	
	@Autowired
	private ConfigPropertiesInvioSpese configPropertiesIvioSpese;
	
	
	public String getEncryptStringBase64(String message) {
        byte[] messageBytes;
        byte [] tempPub = null;
        String sPub = null;
        byte[] ciphertextBytes = null;
        byte[] textBytes = null;

        try {
        	Security.addProvider(new BouncyCastleProvider());
            // The source of randomness
            SecureRandom secureRandom = new SecureRandom();

            // Obtain a RSA Cipher Object
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding","BC");

            // Loading certificate file
            String certFile = configPropertiesIvioSpese.getCertificate();
            InputStream inStream = new FileInputStream(certFile);
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            X509Certificate cert =(X509Certificate)cf.generateCertificate(inStream);
            inStream.close();

            // Read the public key from certificate file
            RSAPublicKey pubkey = (RSAPublicKey) cert.getPublicKey();
            tempPub = pubkey.getEncoded();
            sPub = new String( tempPub );
            logger.debug("Public Key Algorithm = " + cert.getPublicKey().getAlgorithm() + "\n" );

            // Set plain message
            //message = "1510168065";
            messageBytes = message.getBytes();
            logger.debug("Plain message:\n" + message + "\n" );

            // Initialize the cipher for encryption
            cipher.init(Cipher.ENCRYPT_MODE, pubkey, secureRandom);

            // Encrypt the message
            ciphertextBytes = cipher.doFinal(messageBytes);
            String b64encodedText=Base64.getEncoder().encodeToString(ciphertextBytes);
            logger.debug("Message encrypted with certificate file public key:\n" + b64encodedText + "\n");
            
            return b64encodedText;
            
        }catch( IOException e ){
        	logger.error( "IOException:" + e );
        }catch( CertificateException e ){
        	logger.error( "CertificateException:" + e );
        }catch( NoSuchAlgorithmException e ){
        	logger.error( "NoSuchAlgorithmException:" + e );
        } catch (Exception e) {
        	logger.error( "Exception:" + e );
        }
        return null;
	}

}

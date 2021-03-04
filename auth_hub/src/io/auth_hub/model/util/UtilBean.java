package io.auth_hub.model.util;


import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UtilBean {
	public static String getHashFromString(String dataToHash, String hashType)
	{
	    
	    StringBuffer buffer = new StringBuffer();
	    try
	    {
	    	MessageDigest digest = MessageDigest.getInstance(hashType);
			byte[] bytes = digest.digest(dataToHash.getBytes(StandardCharsets.UTF_8));
			for (byte b : bytes) {
		        buffer.append(String.format("%02x", b));
		    }
			
	    }
	    catch(NoSuchAlgorithmException e)
	    {
	        e.printStackTrace();
	    }
	  
	    return buffer.toString();
	}

	
}

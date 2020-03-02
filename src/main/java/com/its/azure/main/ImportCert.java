package com.its.azure.main;

public class ImportCert {
	public static void main(String[] args) {
		String importCert = " -import  -alias itshare  -file  azure.cer  -keystore truststore  -trustcacerts  -storepass its@123 -noprompt ";
		
		try {
			sun.security.tools.keytool.Main.main(importCert.trim().split("\\s+"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

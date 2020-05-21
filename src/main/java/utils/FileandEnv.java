package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileandEnv {
	
	public static Map<String, String> fileandenv = new HashMap<String, String>();
	public static Properties propMain = new Properties();
	public static Properties propPreSet = new Properties();
	
	
	public static Map<String, String> envAndFile(){
		
		String environment = System.getProperty("env");
		
		try {
			if(environment.equalsIgnoreCase("dev")) {
				FileInputStream fileDev = new FileInputStream(System.getProperty("user.dir") + "/inputs/dev.properties"); 
				propMain.load(fileDev);
				fileandenv.put("ServerUrl", System.getProperty("ServerUrl"));
				fileandenv.put("portNo", System.getProperty("portNo"));
				fileandenv.put("username", System.getProperty("username"));
				fileandenv.put("password", System.getProperty("password"));
				
			}else if(environment.equalsIgnoreCase("qa")) {
				
				FileInputStream fileQA = new FileInputStream(System.getProperty("user.dir") + "/inputs/qa.properties"); 
				propMain.load(fileQA);
				fileandenv.put("ServerUrl", System.getProperty("ServerUrl"));
				fileandenv.put("portNo", System.getProperty("portNo"));
				fileandenv.put("username", System.getProperty("username"));
				fileandenv.put("password", System.getProperty("password"));
				
			}else if(environment.equalsIgnoreCase("staging")) {
				
				FileInputStream fileStaging = new FileInputStream(System.getProperty("user.dir") + "/inputs/staging.properties"); 
				propMain.load(fileStaging);
				fileandenv.put("ServerUrl", System.getProperty("ServerUrl"));
				fileandenv.put("portNo", System.getProperty("portNo"));
				fileandenv.put("username", System.getProperty("username"));
				fileandenv.put("password", System.getProperty("password"));
			}
			
		} catch (Exception e) {
			System.out.println("=========== Error Message ============");
			System.out.println(e.getMessage());
			System.out.println("=========== Error Message Ends ============");

		}
	
		return fileandenv;
	}
	
	
	
	public static Map<String, String> getConfigReader(){
		if(fileandenv == null) {
			fileandenv = envAndFile();
		}
		return fileandenv;
	}

}

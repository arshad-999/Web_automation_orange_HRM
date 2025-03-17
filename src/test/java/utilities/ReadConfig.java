package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class ReadConfig {

	Properties properties;
	String path="Resources\\config.properties";
	public ReadConfig() {
		try {
			properties = new Properties();

			
			//to open config .properties file in input mode and load the file
			FileInputStream  fis = new FileInputStream(path);
			properties.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	
	
	public String getBrowser() {
	    String value = properties.getProperty("browser");

	    if (value != null && !value.trim().isEmpty()) {
	        return value;
	    } else {
	        throw new RuntimeException("Browser not specified in config file.");
	    }
	}




	


}

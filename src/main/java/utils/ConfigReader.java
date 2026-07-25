package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public ConfigReader() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ConfigReader configReader = new ConfigReader();

	}

}

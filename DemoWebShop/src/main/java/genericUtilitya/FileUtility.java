package genericUtilitya;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String getDataFromProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/Data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		

		String url = prop.getProperty("url");
		String email = prop.getProperty("email");
		String pass = prop.getProperty("password");
		String lowToHigh = prop.getProperty("lowToHigh");
		String country = prop.getProperty("country");
		return prop.getProperty(key);
		
	}
}

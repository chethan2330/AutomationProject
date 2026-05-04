package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertyFile {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./TestData/Data.properties");
	
	Properties prop=new Properties();
	prop.load(fis);
	
	String url = prop.getProperty("url");
	String email = prop.getProperty("email");
	String pass = prop.getProperty("password");
	
	System.out.println(url+" "+email+" "+pass);
}
}

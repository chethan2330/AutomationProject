package pom;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestscriptLogin {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	FileInputStream fis=new FileInputStream("./TestData/Data.properties");
	Properties prop=new Properties();
	prop.load(fis);
	
	String url = prop.getProperty("url");
	String email = prop.getProperty("email");
	String password = prop.getProperty("password");
	
	driver.get(url);
	
	//accessing elements from pom page
	
	HomePage hm=new HomePage(driver);
	hm.getLoginLink().click();
	
	LoginPage lp=new LoginPage(driver);
	lp.getEmailTextField().sendKeys(email);
	lp.getPasswordTextFiled().sendKeys(password);
	lp.getSubmitButton().click();
	
	
	
	
	
	
}
	
	
}

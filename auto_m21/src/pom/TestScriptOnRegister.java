package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptOnRegister {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fis=new FileInputStream("./TestData/Data.properties");
		Properties pro=new Properties();
		pro.load(fis);
		
		String url = pro.getProperty("url");
		String fn = pro.getProperty("firstName");
		String ln = pro.getProperty("lastName");
		String email = pro.getProperty("email");
		String password = pro.getProperty("password");
		String confirmpass = pro.getProperty("conPassword");
		
		driver.get(url);
		
		HomePage hp=new HomePage(driver);
		hp.getRegisterLink().click();
		
		RegisterPage rg=new RegisterPage(driver);
		rg.getMaleRadioButton().click();
		rg.getFirstNameTextField().sendKeys(fn);
		rg.getLastNameTextField().sendKeys(ln);
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys(email);
		lp.getPasswordTextFiled().sendKeys(password);
		
		rg.getConfirmPassword().sendKeys(confirmpass);
		rg.getRegisterButton().click();
		
}
}
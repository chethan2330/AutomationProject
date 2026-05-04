package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterDemowebShopUsingProperties {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fis=new FileInputStream("./TestData/Data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("url");
		String fn = prop.getProperty("firstName");
		String ln = prop.getProperty("lastName");
		String cp = prop.getProperty("conPassword");
		String email = prop.getProperty("email");
		String pass = prop.getProperty("password");
		
		driver.get(url);
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(fn);
		driver.findElement(By.id("LastName")).sendKeys(ln);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cp);
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
}
}

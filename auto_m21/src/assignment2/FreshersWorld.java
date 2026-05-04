package assignment2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FreshersWorld {
public static void main(String[] args) throws IOException {
	
	FileInputStream fis=new FileInputStream("./TestData/FreshersWorldData.properties");
	Properties prop=new Properties();
	prop.load(fis);
	
	String url = prop.getProperty("url");
	String name = prop.getProperty("name");
	String email = prop.getProperty("email");
	String phone = prop.getProperty("phoneno");
	String dob = prop.getProperty("dob");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
	
	driver.findElement(By.id("reg_new_btn")).click();
	
	driver.findElement(By.id("firstname")).sendKeys(name);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("mobile")).sendKeys(phone);
	driver.findElement(By.id("datepicker")).sendKeys(dob);
	
	WebElement qualification = driver.findElement(By.id("course"));
	Select s=new Select(qualification);
	s.selectByVisibleText("BE/B.Tech");
	
	driver.findElement(By.xpath("//label[text()='I am a Fresher']")).click();
	
	File f=new File("C:\\Users\\Chethan\\OneDrive\\Desktop\\resume\\SQL.pdf");
	String abs = f.getAbsolutePath();
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys(abs);
	driver.findElement(By.xpath("//div[text()=' Allow Freshersworld to send notifications ']/..//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//input[@name='submitRegister']")).click();
	
	String timestamp = LocalDateTime.now().toString().replace(":", "-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File per = new File("./Screenshots/"+timestamp+".png");
	org.openqa.selenium.io.FileHandler.copy(temp, per);
	
	driver.quit();
}
}

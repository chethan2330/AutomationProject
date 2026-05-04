package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Execution1 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	driver.findElement(By.xpath("//a[text()='Twitter']")).click();
	
	Set<String> winIds = driver.getWindowHandles();
	for(String id:winIds) {
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.equals("https://x.com/nopCommerce")){
			driver.findElement(By.xpath("//span[text()='New to X?']/../../../..//span[text()='Create account']")).click();
			driver.findElement(By.xpath("//input[@autocomplete='name']")).sendKeys("chethan");
			driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys("chethans20032007@gmail.com");
			
			WebElement month = driver.findElement(By.xpath("(//select[@aria-invalid='false'])[1]"));
			Select s=new Select(month);
			s.selectByVisibleText("April");
			
			WebElement date = driver.findElement(By.xpath("(//select[@aria-invalid='false'])[2]"));
			Select s2=new Select(date);
			s2.selectByVisibleText("30");
			
			WebElement year = driver.findElement(By.xpath("(//select[@aria-invalid='false'])[3]"));
			Select s3=new Select(year);
			s3.selectByVisibleText("2003");
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			 
			File perm=new File("./Screenshots/X.png");
			FileHandler.copy(temp, perm);
			
			
		
		}
	}
	
}
}

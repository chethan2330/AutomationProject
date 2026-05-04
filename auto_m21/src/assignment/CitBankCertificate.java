package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CitBankCertificate {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
	
	WebElement ele = driver.findElement(By.xpath("(//span[@aria-hidden='true'])[1]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",ele);
	
	driver.findElement(By.xpath("//input[@formcontrolname='cdAmount']")).clear();
	driver.findElement(By.xpath("//input[@formcontrolname='cdAmount']")).sendKeys("20000");
    driver.findElement(By.xpath("//input[@formcontrolname='cdLength']")).clear();
	driver.findElement(By.xpath("//input[@formcontrolname='cdLength']")).sendKeys("35");
	driver.findElement(By.xpath("//input[@formcontrolname='cdRate']")).clear();
	driver.findElement(By.xpath("//input[@formcontrolname='cdRate']")).sendKeys("55.2");
	driver.findElement(By.xpath("//div[@class='mat-mdc-select-arrow']")).click();
	
	List<WebElement> options = driver.findElements(By.xpath("//mat-option[@role='option']"));
	for(WebElement op:options) {
		System.out.println(op.getText());
	}
	
	driver.findElement(By.xpath("//span[text()=' Compounded Semi-Annually ']")).click();
	driver.findElement(By.id("CIT-chart-submit")).click();

	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm = new File("./Screenshots/cit.png");
	org.openqa.selenium.io.FileHandler.copy(temp, perm);
	
}
}

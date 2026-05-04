package iframe;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitingIntoTheFrame {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.rediff.com/");
	  
	
	WebElement nf = driver.findElement(By.xpath("//iframe[@name='moneyiframe']"));
	driver.switchTo().frame(nf);
	driver.findElement(By.xpath("//span[text()='NSE']")).click();
	driver.switchTo().defaultContent();
	
	driver.findElement(By.linkText("Create Account")).click();
	
	
	
	
	
	
	
}
}

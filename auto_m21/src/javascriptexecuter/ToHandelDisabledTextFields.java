package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandelDisabledTextFields {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
	WebElement t1 = driver.findElement(By.id("name"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].removeAttribute('disabled')",t1);
	t1.sendKeys("chethan");
	Thread.sleep(5000);
	WebElement t2 = driver.findElement(By.id("email"));
	js.executeScript("arguments[0].value='chethans2003@gmail.com'",t2);
	WebElement t3 = driver.findElement(By.id("password"));
	js.executeScript("arguments[0].value='password'",t3);
	
}
}

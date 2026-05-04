package javascriptexecuter;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandelDisabledElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/checkbox/disabled?sublist=2");
		 
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ele:checkbox) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].removeAttribute('disabled')",ele);
			ele.click();
			
		}
}
}
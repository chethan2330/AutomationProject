package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnExplicitWait
{
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/52");
		
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("560105");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement check = driver.findElement(By.id("Check"));
		wait.until(ExpectedConditions.elementToBeClickable(check));
		driver.findElement(By.xpath("//button[@id='Check']")).click();
		/*we need to use the implicit wait for disabled buttons,when we enter the data and the button is changed to enable 
		then we should use implicit wait and then perform the operations */
}
}
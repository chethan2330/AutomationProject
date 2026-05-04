package assignment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 17");
		driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
		List<WebElement> phones = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/..//span[text()='Apple']"));
//		List<WebElement> description = driver.findElements(By.xpath("//span[text()='Apple']/../../../..//span[contains(text(),'iPhone')]"));
//		List<WebElement> price = driver.findElements(By.xpath("//span[text()='Apple']/../../../../..//span[text()='₹']/..//span[@class='a-price-whole']"));
//		List<WebElement> delivery = driver.findElements(By.xpath("//span[text()='Apple']/../../..//../..//div[text()='FREE delivery ']"));
//		
//		int i=0;
//		for(WebElement ph:phones) {
//			System.out.println(ph.getText());
//			System.out.println(description.get(i).getText());
//				System.out.println(price.get(i).getText());
//					System.out.println(delivery.get(i).getText());
//					i++;
//				}
		for(WebElement ph:phones) {
			String description = driver.findElement(By.xpath("//span[text()='Apple']/../../../..//span[contains(text(),'iPhone')]")).getText();
			String price = driver.findElement(By.xpath("//span[text()='Apple']/../../../../..//span[text()='₹']/..//span[@class='a-price-whole']")).getText();
			String delivery = driver.findElement(By.xpath("//span[text()='Apple']/../../..//../..//div[text()='FREE delivery ']")).getText();
			
			System.out.println(ph.getText());
			System.out.println(description);
			System.out.println(price);
			System.out.println(delivery);
		}
		driver.quit();
}
}
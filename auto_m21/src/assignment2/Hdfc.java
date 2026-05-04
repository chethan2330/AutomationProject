package assignment2;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hdfc.bank.in/");
		
		driver.findElement(By.xpath("//button[@aria-label='Login']")).click();
		driver.findElement(By.xpath("(//a[@title='NetBanking'])[1]")).click();
		
		
		Set<String> winids = driver.getWindowHandles();
		for(String id:winids) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.contains("https://now.hdfc.bank.in/auth/realms/retail/protocol/openid-connect/auth?")) {
				
				WebElement ele = driver.findElement(By.xpath("//div[@id='login-background-div']"));
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
				
			}
		}
		
}
}
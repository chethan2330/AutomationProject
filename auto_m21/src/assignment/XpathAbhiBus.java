package assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAbhiBus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		Thread.sleep(3000);		
		List<WebElement> routs = driver.findElements(By.xpath("//div[contains(@id,'bus-routes-')]//div[@class=' col auto s12 m12']"));
		   for(WebElement ro:routs) {
			   String rou = ro.getText();
			   System.out.println(rou);
			   driver.findElement(By.xpath("//a[text()='View Buses']")).click();
			   List<WebElement> busname = driver.findElements(By.xpath("//h5[contains(@class,'title')]"));
			   List<WebElement> fare = driver.findElements(By.xpath("//span[contains(@class,'fare text-')]"));
			   
			   
			   for(WebElement bu:busname) {
				   for(WebElement pr:fare) {
				   String bus = bu.getText();
				   String price =pr.getText();
			   System.out.println("bus name is "+bus+" and its price is "+price);
			   }
			 //  driver.navigate().back();
			   
			}
		}
}
}

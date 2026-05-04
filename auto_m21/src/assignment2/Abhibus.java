package assignment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Abhibus {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.abhibus.com/");
	
	WebElement view = driver.findElement(By.xpath("//img[@alt='Bangalore to Hyderabad']"));
	Actions act=new Actions(driver);
	act.scrollToElement(view);
	
	driver.findElement(By.xpath("//img[@alt='Bangalore to Hyderabad']/../..//a[text()='View Buses']")).click();
	
	WebElement buspatner = driver.findElement(By.xpath("//span[text()='Bus Partner']"));
	act.scrollToElement(buspatner);
	buspatner.click();
	
	driver.findElement(By.xpath("//label[text()='CMR Express']/..//input[@type='checkbox']")).click();
	Thread.sleep(5000);
	List<WebElement> details = driver.findElements(By.xpath("//div[@class='container service-info-left-section ']"));
//	List<WebElement> busName = driver.findElements(By.xpath("//h5[@class='title']"));
//	List<WebElement> departure =driver.findElements(By.xpath("//span[contains(@class,'departure-time')]"));
//	List<WebElement> arival =driver.findElements(By.xpath("//span[contains(@class,'arrival-time text')]"));
//	List<WebElement> seats =driver.findElements(By.xpath("//div[contains(@id,'service-operator-select-')]/..//div[contains(@style,'text-align: center; font-size: ')]"));
//	List<WebElement> price = driver.findElements(By.xpath("//span[text()='From']/..//span[text()='₹']"));
//	
//	for(int i=0;i<busName.size();i++) {
//		String bu = busName.get(i).getText();
//		System.out.println(bu);
//		String de = departure.get(i).getText();
//		String ar = arival.get(i).getText();
//		String se = seats.get(i).getText();
//		String pr = price.get(i).getText();
//		System.out.println("Departure_time"+":"+de+" "+"arival_time"+":"+ar+" "+"seats_are_availabel"+":"+se+" ,"+"price of the seats"+pr);
//						
//					}
	for(WebElement info:details) {
		 String busName = driver.findElement(By.xpath("//h5[@class='title']")).getText();
		String departure = driver.findElement(By.xpath("//span[contains(@class,'departure-time')]")).getText();
		String arival = driver.findElement(By.xpath("//span[contains(@class,'arrival-time text')]")).getText();
		String seats = driver.findElement(By.xpath("//div[contains(@id,'service-operator-select-')]/..//div[contains(@style,'text-align: center; font-size: ')]")).getText();
		String price = driver.findElement(By.xpath("//span[text()='From']/..//span[text()='₹']")).getText();
		
		
		System.out.println("bus Name="+busName);
		System.out.println("Departure Time:"+departure);
		System.out.println("Arival Time:"+arival);
		System.out.println("Seats Lesft:"+seats);
		System.out.println("Price:"+price);
	}
		
	
	driver.quit();
}
}

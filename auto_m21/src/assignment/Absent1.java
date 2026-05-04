package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Absent1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
	
	WebElement mul = driver.findElement(By.id("select-multiple-native"));
	Select s=new Select(mul);
	s.selectByVisibleText("Fjallraven - Foldsac...");
	s.selectByVisibleText("Mens Cotton Jacket...");
	
	s.deselectAll();
	 
	 
	List<WebElement> el = s.getAllSelectedOptions();
	Thread.sleep(5000);
	System.out.println("the selected options are");
	for(WebElement ref : el) {
		System.out.println(ref.getText());
		}
	
	System.out.println();
	
	List<WebElement> opt = s.getOptions();
	 System.out.println("the options are");
	 for(WebElement op:opt) {
		 System.out.println(op.getText());
		 }
	 driver.findElement(By.xpath("//button[text()='Add']")).click();
	 
	
	 
	
}
}

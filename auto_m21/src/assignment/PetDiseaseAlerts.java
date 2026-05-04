package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetDiseaseAlerts {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://petdiseasealerts.org/");
	 
	driver.findElement(By.xpath("//a[text()='Forecast Maps']")).click();
	driver.findElement(By.xpath("(//a[text()='Go to map'])[1]")).click();
	
	WebElement man = driver.findElement(By.xpath("//iframe[contains(@src,'https://api-prod.capcvet.org/api/embed/pda/')]"));
	driver.switchTo().frame(man);
	driver.findElement(By.id("montana")).click();
}
}

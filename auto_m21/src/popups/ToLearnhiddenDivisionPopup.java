package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnhiddenDivisionPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/hidden");
		 
		driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.xpath("//button[text()='X']")).click();
}
}
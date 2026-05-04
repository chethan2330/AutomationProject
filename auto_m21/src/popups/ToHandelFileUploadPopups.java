package popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandelFileUploadPopups {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		driver.findElement(By.id("fullName")).sendKeys("chethan");
		driver.findElement(By.id("emailId")).sendKeys("chethans@gmail.com");
		driver.findElement(By.id("password")).sendKeys("chethan");
		driver.findElement(By.id("mobile")).sendKeys("9876543210");
		
		WebElement drop = driver.findElement(By.id("city"));
		Select s=new Select(drop);
		s.selectByVisibleText("Bangalore");
		Thread.sleep(5000);
		//if its working
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Chethan\\OneDrive\\Desktop\\java and sql");

	//if not working
		File f = new File("C:\\Users\\Chethan\\OneDrive\\Desktop\\java and sql");
		  String absolute = f.getAbsolutePath();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(absolute);
	
	}
}
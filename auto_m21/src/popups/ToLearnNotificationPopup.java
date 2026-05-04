package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToLearnNotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		//create chromeoptions object
		ChromeOptions opt=new ChromeOptions();
		//call the method
		opt.addArguments("--disable-notifications ");//peter Beverlo chromium commands
		//chrome browser setting
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.rediff.com/");
		
		
		
		
}
}
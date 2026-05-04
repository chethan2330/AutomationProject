package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement fra = driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[1]"));
		driver.switchTo().frame(fra);
		
		
		
		WebElement source = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement target = driver.findElement(By.id("trash"));
		Actions act=new Actions(driver);
		//using dargAndDrop()
		//act.dragAndDrop(source, target).perform();
		//without using dragAndDdrop()
		
		//act.clickAndHold(source).moveToElement(target).release().release().perform();
		act.click(source).pause(Duration.ofSeconds(2)).moveToElement(target).release().perform();
}
}
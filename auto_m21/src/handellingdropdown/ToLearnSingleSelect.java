package handellingdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	
	WebElement drop = driver.findElement(By.id("select3"));
    Select s=new Select(drop);
    s.selectByIndex(2);
    s.selectByValue("Poland");
    s.selectByVisibleText("China");
    List<WebElement> options = s.getOptions();
    for(WebElement op:options) {
    System.out.println(op.getText()+" - "+s.isMultiple());
    
    }
    
    
}
}
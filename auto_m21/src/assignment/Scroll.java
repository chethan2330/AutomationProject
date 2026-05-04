package assignment;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		WebElement drop = driver.findElement(By.id("select3"));
	    Select s=new Select(drop);
	    s.selectByIndex(2);
	    s.selectByValue("Poland");
	    s.selectByVisibleText("India");
	    List<WebElement> options = s.getOptions();
	    for(WebElement op:options) {
	    System.out.println(op.getText()+" - "+s.isMultiple());
	    
	    WebElement mul= driver.findElement(By.id("select5"));
	    Select s1=new Select(mul);
	    s1.selectByVisibleText("Karnataka");
	    List<WebElement> opt = s1.getOptions();
	    for(WebElement op2:opt) {
	    	System.out.println(op2.getText()+" - "+s.isMultiple());
	    	
	    	WebElement cit = driver.findElement(By.xpath("//label[text()='City']"));
	    	Select s2=new Select(cit);
	    	s2.selectByVisibleText("Bangalore Urban");
	    	s2.selectByVisibleText("Mysore");
	    	//List<WebElement> opt2 = s2.getOptions();
	    	/*for(WebElement op3:opt2) {
	    		System.out.println(op3.getText());
	    	}*/
	    }
	    
	    }
}
}

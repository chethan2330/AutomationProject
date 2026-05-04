package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Chethan/OneDrive/Desktop/table.html");
	
	List<WebElement> text = driver.findElements(By.xpath("//td[text()='United States']/following-sibling::td"));
	List<WebElement> name = driver.findElements(By.xpath("//th[text()='COUNTRY/TERRITORY']/following-sibling::th"));
	for(int i =1 ; i<text.size();i++) {
		String t = text.get(i).getText();
		String n = name.get(i).getText();
		System.out.println(n+" "+t);
	}
	driver.quit();
}
}

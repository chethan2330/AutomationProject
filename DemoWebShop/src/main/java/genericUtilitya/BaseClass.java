package genericUtilitya;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.WelcomePage;
 
public class BaseClass {
public static WebDriver driver ;
  
public JavaUtility jutil=new JavaUtility();
public WebDriverUtility wutil=new WebDriverUtility();
public FileUtility futil=new FileUtility();
public ExcelUtility eutil=new ExcelUtility();


@BeforeClass
public void openBrowser() throws IOException {
	driver=new ChromeDriver();
	wutil.maximize(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(futil.getDataFromProperty("url"));
}
	
@BeforeMethod
public void login() throws IOException {
WelcomePage wp=new WelcomePage(driver);
wp.getLoginLink().click();


LoginPage lp=new LoginPage(driver);
lp.getEmailTextField().sendKeys(futil.getDataFromProperty("email"));
lp.getPasswordTextFiled().sendKeys(futil.getDataFromProperty("password"));
lp.getSubmitButton().click();
}
//
//@AfterMethod
//public void logout() {
//	HomePage hm=new HomePage(driver);
//	hm.getLogOutLink().click();
//}

//@AfterClass
//public void closeBrowser() {
//	driver.quit();
}

//}


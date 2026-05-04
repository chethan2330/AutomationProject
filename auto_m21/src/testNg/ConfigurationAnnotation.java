package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("before suite is executesd",true);
	}
	
	@AfterSuite
	public void aftersuite() {
		Reporter.log("after suite is executesd",true);
	}
	
	@BeforeTest
	public void beforetest() {
		Reporter.log("before test is executesd",true);
	}
	
	@AfterTest
	public void aftertest() {
		Reporter.log("after test is executesd",true);
	}
	
	@BeforeClass
	public void beforeclass() {
		Reporter.log("before class is executesd",true);
	}
	
	@AfterClass
	public void afterclass() {
		Reporter.log("after class is executesd",true);
	}
	
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("before method is executesd",true);
	}
	
	@AfterMethod
	public void aftermethod() {
		Reporter.log("after method is executesd",true);
	}
	
	@Test
	public void mm() {
 Reporter.log("executed successfully",true);
	
	}
	
}

//package books;
//
//import java.io.IOException;
//import java.util.List;
//
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import objectRepository.HomePage;
//import objectRepository.ShoppingCart;
//
//public class Dws_TC_02Test extends Dws_TC_01Test {
//@Test
//public void shoppingCsrt() throws IOException {
//	
//	HomePage hp=new HomePage(driver);
//	hp.getShoppingCart().click();
//	
//	List<WebElement> opt = wutil.multi(driver,"//td[@class='product-picture']/..//input[@type='checkbox']");
//	for(WebElement options:opt) {
//		options.click();
//	}
//	ShoppingCart scr=new ShoppingCart(driver);
//	wutil.selectDropdown(futil.getDataFromProperty("country"),scr.getCountrySelection());
//	wutil.selectDropdown(futil.getDataFromProperty("state"),scr.getStateSelection());
//	scr.getZipcode().sendKeys("zipcode");
//	scr.getEstimationShipping().click();
//	scr.getiAgreeChekbox().click();
//	scr.getCheckout().click();
//}
//}

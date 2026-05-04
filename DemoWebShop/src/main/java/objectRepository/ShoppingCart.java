package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {

	@FindBy(id = "CountryId")
	private WebElement countrySelection;
	
	@FindBy(id = "StateProvinceId")
	private WebElement stateSelection;
	
	@FindBy(id = "ZipPostalCode")
	private WebElement zipcode;
	
	@FindBy(name = "estimateshipping")
	private WebElement EstimationShipping;
	
	@FindBy(xpath = "//span[contains(text(),'Sub-Total')]/../../../../../..//input[@type='checkbox']")
	private WebElement iAgreeChekbox;
	
	@FindBy(id = "checkout")
	private WebElement checkout;
	
	public ShoppingCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCountrySelection() {
		return countrySelection;
	}

	public WebElement getStateSelection() {
		return stateSelection;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getEstimationShipping() {
		return EstimationShipping;
	}

	public WebElement getiAgreeChekbox() {
		return iAgreeChekbox;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	
}

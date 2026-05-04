package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderDetailsPAge {
@FindBy(partialLinkText = "Click here for order details.")
private WebElement orderDetails;

public OrderDetailsPAge(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getOrderDetails() {
	return orderDetails;
}

}

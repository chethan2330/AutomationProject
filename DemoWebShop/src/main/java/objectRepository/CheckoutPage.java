package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
@FindBy(xpath = "(//input[@title='Continue'])[1]")
private WebElement billingAddresContinue;

@FindBy(xpath = "(//input[@title='Continue'])[2]")
private WebElement shippingAddressContinue;

@FindBy(id = "PickUpInStore")
private WebElement shippingAddresscheckbox;

@FindBy(xpath = "(//input[@value='Continue'])[4]")
private WebElement paymentMethodContinue;

@FindBy(xpath = "(//input[@value='Continue'])[5]")
private WebElement paymentInformationContinue;

@FindBy(xpath = "//input[@value='Confirm']")
private WebElement confirmOrderconfirmButton;

public CheckoutPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getBillingAddresContinue() {
	return billingAddresContinue;
}

public WebElement getShippingAddressContinue() {
	return shippingAddressContinue;
}

public WebElement getShippingAddresscheckbox() {
	return shippingAddresscheckbox;
}

public WebElement getPaymentMethodContinue() {
	return paymentMethodContinue;
}

public WebElement getPaymentInformationContinue() {
	return paymentInformationContinue;
}

public WebElement getConfirmOrderconfirmButton() {
	return confirmOrderconfirmButton;
}

}

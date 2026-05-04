package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText  = "Log out")
	private WebElement LogOutLink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement BOOKSLink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement ComputerLink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement Electronicslink;
	
	@FindBy(partialLinkText = "GIFT CARD")
	private WebElement GiftCardslinks;
	
	@FindBy(id = "topcartlink")
	private WebElement shoppingCart;
	


public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getLogOutLink() {
	return LogOutLink;
}

public WebElement getBOOKSLink() {
	return BOOKSLink;
}

public WebElement getComputerLink() {
	return ComputerLink;
}

public WebElement getElectronicslink() {
	return Electronicslink;
}

public WebElement getGiftCardslinks() {
	return GiftCardslinks;
}
	
public WebElement getShoppingCart() {
	return shoppingCart;
}
	
}

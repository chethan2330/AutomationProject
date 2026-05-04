package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextFiled;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement LoginButton;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getEmailTextField() {
		return emailTextField;
	}


	public WebElement getPasswordTextFiled() {
		return passwordTextFiled;
	}


	public WebElement getSubmitButton() {
		return LoginButton;
	}
	
	
}

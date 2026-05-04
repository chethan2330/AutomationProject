package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id = "LastName")
	private WebElement lastNameTextField;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}


	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	
	
	
	
}

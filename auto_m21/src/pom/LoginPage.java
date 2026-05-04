package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextFiled;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement submitButton;
	
	
	//Initialization
	public LoginPage(WebDriver driver) {
	    PageFactory.initElements(driver,this);
	}

	//getterMethods
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public void setEmailTextField(WebElement emailTextField) {
		this.emailTextField = emailTextField;
	}

	public WebElement getPasswordTextFiled() {
		return passwordTextFiled;
	}

	public void setPasswordTextFiled(WebElement passwordTextFiled) {
		this.passwordTextFiled = passwordTextFiled;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}
	
	
	
	
	
	
	
}

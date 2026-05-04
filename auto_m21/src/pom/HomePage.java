package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//Declaration
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchTextField;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchButton;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Call gettermethods
	public WebElement getRegisterLink() {
		return registerLink;
	}


	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}


	public WebElement getLoginLink() {
		return loginLink;
	}


	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}


	public WebElement getSearchTextField() {
		return searchTextField;
	}


	public void setSearchTextField(WebElement searchTextField) {
		this.searchTextField = searchTextField;
	}


	public WebElement getSearchButton() {
		return searchButton;
	}


	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}
	
	
	
	
}

package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {

	@FindBy(id = "products-orderby")
	private WebElement SortBy;
	
	@FindBy(xpath = "//span[@class='price actual-price']")
	private WebElement price;
	
	@FindBy(xpath = "//div[@class='item-box']")
	private WebElement product;
	
	@FindBy(xpath = "//div[@class='product-item']/..//input[@value='Add to cart']")
	private WebElement AddToCart;
	
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSortBy() {
		return SortBy;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}
	

	
}

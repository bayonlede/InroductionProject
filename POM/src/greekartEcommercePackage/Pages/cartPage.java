package greekartEcommercePackage.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {
	
	WebDriver driver;
	
	public cartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="img[alt='Cart']")
	WebElement cartIcon;
	@FindBy(css="div[class='cart-preview active'] button[type='button']")
	WebElement proceed;
	@FindBy(xpath="//button[normalize-space()='Place Order']")
	WebElement placeOrder;
	
	public void proceedToCart() {
		cartIcon.click();
		proceed.click();
		placeOrder.click();
	}
	
}

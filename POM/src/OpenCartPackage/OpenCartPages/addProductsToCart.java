package OpenCartPackage.OpenCartPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addProductsToCart {

	WebDriver driver;

	public addProductsToCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Desktops']")
	WebElement desktopTab;
	@FindBy(xpath = "//a[normalize-space()='Mac (1)']")
	WebElement macPC;
	@FindBy(css = "button[aria-label='Add to Cart']")
	WebElement item;
	@FindBy(css = ".alert.alert-success.alert-dismissible")
	WebElement conFmsg;
	@FindBy(css = ".btn.btn-inverse.btn-block.dropdown-toggle")
	WebElement cartBttn;
	@FindBy(css = "//strong[normalize-space()='Checkout']")
	WebElement Checkout;

	public void buyProduct() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(desktopTab).click().build().perform();
		macPC.click();
		JavascriptExecutor downScroll2 = (JavascriptExecutor) driver;
		downScroll2.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		int i = 0;
		while (i < 5) {
			item.click();
			i++;
		}
		System.out.println(conFmsg.getText());
		JavascriptExecutor upScroll = (JavascriptExecutor) driver;
		upScroll.executeScript("window.scrollBy(700,0)");
		Thread.sleep(1000); // scroll up
		cartBttn.click();
		Checkout.click();
	}

	
}

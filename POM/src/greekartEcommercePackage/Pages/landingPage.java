package greekartEcommercePackage.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {

	WebDriver driver;

	public landingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goToURL() {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	// LANDING PAGE
	@FindBy(css = ".search-keyword")
	WebElement productName;
	@FindBy(xpath = "//div[@class='product']/div/a[@class='increment']")
	WebElement inCrement;
	@FindBy(css = "div[class='product-action'] button[type='button']")
	WebElement addTocart;

	public void addPRoduct(String proDuct) {
		productName.sendKeys(proDuct);
		int i = 1;
		while (i < 10) {
			inCrement.click();
			i++;
		}
		addTocart.click();
		
	}




}

package greekartEcommercePackage.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class orderPage {
	
	WebDriver driver;
	
	public orderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div[class='wrapperTwo'] div select")
	WebElement countryDropdown;
	@FindBy(css=".chkAgree")
	WebElement agreement;
	@FindBy(css="div[class='wrapperTwo'] button")
	WebElement proceed;
	@FindBy(xpath="//span[contains(text(),'Thank you, your order has been placed successfully')]")
	WebElement confMessage;
	
	public void plaCeOrder() {
		Select country=new Select(countryDropdown);
		country.selectByValue("United Kingdom");
		agreement.click();
		proceed.click();
		System.out.println(confMessage.getText());
	}
	
}

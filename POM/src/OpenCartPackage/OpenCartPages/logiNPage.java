package OpenCartPackage.OpenCartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logiNPage {
	
	WebDriver driver;
	public logiNPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement tabAccount;
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Login']")
	WebElement loginLink;
	@FindBy(id="input-email")
	WebElement emaIl;
	@FindBy(id="input-password")
	WebElement pasSword;
	@FindBy(css="button[type='submit']")
	WebElement suBMit;
	
	public void pageLogin(String emailAdd, String passwrd) {
		tabAccount.click();
		loginLink.click();
		emaIl.sendKeys(emailAdd);
		pasSword.sendKeys(passwrd);
		suBMit.click();
	}
		
}

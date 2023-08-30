package OpenCartPackage.OpenCartPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class regPage {
	
	WebDriver driver;
	
	public regPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
			//OPENCART REGISTRATION PAGE
			@FindBy(id="input-firstname")
			WebElement firstName;
			@FindBy(id="input-lastname")
			WebElement lastName;
			@FindBy(id="input-email")
			WebElement eMail;
			@FindBy(id="input-password")
			WebElement passWord;
			@FindBy(id="input-newsletter-yes")
			WebElement newsletter;
			@FindBy(css="input[name='agree']")
			WebElement terms;
			@FindBy(css="button[type='submit']")
			WebElement suBmit;
			
			public void goToURL() {
				driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
			}
			
			public void RegisterUser(String fName, String lName, String emaiL, String passwOrd) throws InterruptedException {
				firstName.sendKeys(fName);
				lastName.sendKeys(lName);
				eMail.sendKeys(emaiL);
				passWord.sendKeys(passwOrd);
				JavascriptExecutor downScroll= (JavascriptExecutor)driver;
				downScroll.executeScript("window.scrollBy(0,700)");
				Thread.sleep(1000);
				newsletter.click();
				terms.click();
				suBmit.click();
				
								
			}
						
}

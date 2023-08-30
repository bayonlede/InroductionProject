package OpenCartPackage.OpenCartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgotPassword {
	
	WebDriver driver;
	public forgotPassword(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div[class='mb-3'] a")
	WebElement forgotLink;
	@FindBy(id="input-email")
	WebElement email;
	@FindBy(css="button[type='submit']")
	WebElement subMit;
	
	public void resetPassword(String eMail) {
		forgotLink.click();
		email.sendKeys(eMail);
		subMit.click();
	}

	//OPENCART FORGOT PASSWORD TEST
//			driver.findElement(By.cssSelector("div[class='mb-3'] a")).click();
//			driver.findElement(By.id("input-email")).sendKeys("bayonle.de@gmail.com");
//			driver.findElement(By.cssSelector("button[type='submit']")).click();
	
}

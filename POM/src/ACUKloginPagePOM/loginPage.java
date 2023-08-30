package ACUKloginPagePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

//	WebElement Email = driver.findElement(By.id("email"));
//	WebElement Password = driver.findElement(By.id("password"));
//	WebElement SubmitBtn = driver.findElement(By.cssSelector("button[type='submit']"));
//	WebElement profile = driver.findElement(By.id("navbarDropdown"));
//	WebElement logoutBtn = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
	
	
	@FindBy(id="email")   //pagefactory format
	WebElement Email;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(css="button[type='submit']")
	WebElement SubmitBtn;
	
	@FindBy(id="navbarDropdown")
	WebElement profile;

	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logoutBtn;
	
	public void goToURL() {
		driver.get("https://qa.advancecareersuk.com/login");
	}
	public void userLogin(String emailAdd, String PassWord) {
		Email.sendKeys(emailAdd);
		Password.sendKeys(PassWord);
		SubmitBtn.click();
		profile.click();
		logoutBtn.click();

	}


}

package registrationPagePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	}

//	WebElement fullName = driver.findElement(By.cssSelector("input[name='name']"));
//	WebElement eMail = driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid"));
//	WebElement passWord = driver.findElement(By.id("exampleInputPassword1"));
//	WebElement checkBox = driver.findElement(By.id("exampleCheck1"));
//	WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
//	WebElement female = driver.findElement(By.cssSelector("#exampleFormControlSelect1 > option:nth-child(2)"));
//	WebElement radioBttn = driver.findElement(By.id("inlineRadio2"));
//	WebElement subMit = driver.findElement(By.cssSelector(".btn.btn-success"));
//	WebElement message = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible"));

	
	@FindBy(css="input[name='name']")
	WebElement fullName;
	@FindBy(css=".form-control.ng-untouched.ng-pristine.ng-invalid")
	WebElement eMail;
	@FindBy(id="exampleInputPassword1")
	WebElement passWord;
	@FindBy(id="exampleCheck1")
	WebElement checkBox;
	@FindBy(id="exampleFormControlSelect1")
	WebElement gender;
	@FindBy(css="#exampleFormControlSelect1 > option:nth-child(2)")
	WebElement female;
	@FindBy(id="inlineRadio2")
	WebElement radioBttn;
	@FindBy(css=".btn.btn-success")
	WebElement subMit;
	@FindBy(css=".alert.alert-success.alert-dismissible")
	WebElement message;
	

	public void register(String name, String emailAddress, String passwOrd) {
		fullName.sendKeys(name);
		eMail.sendKeys(emailAddress);
		passWord.sendKeys(passwOrd);
		checkBox.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		gender.click();
		female.click();
		radioBttn.click();
		subMit.click();
		System.out.println(message.getText());
	}

	}
	
	
	
	



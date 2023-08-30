import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TC023 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		
		//Validate Account Registration without filling the Course  & Start Date
		//Test data
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
		String Firstname= "Samuel";
		String Lastname= "Peters";
		String Email= "bayonled.de@gmail.com";
		String confirmEmail= "bayonled.de@gmail.com";
		String Password= "Password@123";
		String confirmPassword= "Password@123";
		String phoneNumber= "7812345678";
		String currentJob= "IT Administrator";
		
		
		
		driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(Firstname); //enter firstname
		driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(Lastname);  //enter lastname
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys(Email);  //enter email
		driver.findElement(By.cssSelector("input[id='comfirmemail']")).sendKeys(confirmEmail);  //enter confirmEmail
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);  //enter password
		driver.findElement(By.cssSelector("input[id='password_confirmation']")).sendKeys(confirmPassword);  //enter confirmPassword
		driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
		//driver.findElement(By.cssSelector("select[id='course']")).click();  //clicl coursefield
		//driver.findElement(By.cssSelector("option[value='7']")).click(); //select Manual testing
		//driver.findElement(By.cssSelector("select[id='all_start_data']")).click();  //click on date field
		driver.findElement(By.cssSelector("div[class='iti__selected-dial-code']")).click();  //click country code
		driver.findElement(By.xpath("//*[@id=\"iti-0__item-gb\"]/span[1]")).click();  //select UK
		driver.findElement(By.cssSelector("input[id='phone']")).sendKeys(phoneNumber);  //enter phoneNumber
		driver.findElement(By.cssSelector("select[id='country']")).click();  //click country field
		driver.findElement(By.cssSelector("option[value='United Kingdom']")).click();  //select UK
		driver.findElement(By.cssSelector("select[id='location']")).click();  //click county field
		driver.findElement(By.cssSelector("option[value='Hounslow']")).click();  //select Hounslow
		driver.findElement(By.cssSelector("input[id='current_job']")).sendKeys(currentJob);  //enter currentJob title
		driver.findElement(By.cssSelector("select[id='target_income']")).click(); //click target income
		driver.findElement(By.xpath("//*[@id=\"target_income\"]/option[5]")).click();  //select option 4
		driver.findElement(By.cssSelector("input[id='privacy']")).click();  // tick privacy box
		driver.findElement(By.cssSelector("button[type='submit']")).click();  //click submit button
		
		

	}
}


	

	



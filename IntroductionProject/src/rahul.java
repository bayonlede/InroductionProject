import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class rahul {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
		driver.findElement(By.cssSelector("a[class='text-acuk-red']")).click();
		
		//test data
		var firstName = "Samuel";
		var lastName = "Peters";
		var emailAdd = "bayo.da@yahoo.com";
		var confirmEmail= "bayo.da@yahoo.com";
		var Password = "Pass12345";
		var confirmPassword = "Pass12345";
		var phoneNo = "07812345678";
		var currentJob = "Data Analyst";
		
		driver.findElement(By.id("first_name")).sendKeys(firstName);
		driver.findElement(By.id("last_name")).sendKeys(lastName);
		driver.findElement(By.id("email")).sendKeys(emailAdd);
		driver.findElement(By.id("comfirmemail")).sendKeys(confirmEmail);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("password_confirmation")).sendKeys(confirmPassword);
		driver.findElement(By.id("nextBtn")).click();
		WebElement courseDropdown = driver.findElement(By.id("course"));
		Select dropdown = new Select(courseDropdown);
		dropdown.selectByIndex(5);
		WebElement startDateDropdown = driver.findElement(By.id("all_start_data"));
		Select date = new Select(startDateDropdown);
		date.selectByIndex(1);
		driver.findElement(By.cssSelector("div[class='iti__selected-flag']")).click();
		driver.findElement(By.xpath("//ul[@id='iti-0__country-listbox'] //li[@id='iti-0__item-gb']")).click();
		driver.findElement(By.id("phone")).sendKeys(phoneNo);
		WebElement countryDropdown = driver.findElement(By.id("country"));
		Select country = new Select(countryDropdown);
		country.selectByVisibleText("United Kingdom");
		WebElement stateDropdown = driver.findElement(By.id("location"));
		Select state = new Select(stateDropdown);
		state.selectByVisibleText("Hounslow");
		driver.findElement(By.id("current_job")).sendKeys(currentJob);
		WebElement targetIncomeDropdown = driver.findElement(By.id("target_income"));
		Select targetIncome = new Select(targetIncomeDropdown);
		targetIncome.selectByIndex(4);
		driver.findElement(By.id("privacy")).click();
		//to perform Scroll on application using Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.id("nextBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".mt-2.text-danger")).getText());
		driver.close();
		
		
	}

}

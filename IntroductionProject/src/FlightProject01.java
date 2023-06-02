import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightProject01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// variables declarations and types
		var autoSuggest = "usa";

		driver.findElement(By.cssSelector("#autosuggest")).sendKeys(autoSuggest);
		
		/* List <WebElement> listedOptions = driver.findElements(By.cssSelector("#ui-id-1"));
		 Thread.sleep(1000);
		 for(WebElement targetOption:listedOptions) {
		 if(targetOption.getText().equals("United States (USA)")) {
			 targetOption.click();
		 break;
		 
		 } } */
		 Thread.sleep(1000);

		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_2")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#MultiCityModelAlert")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(1000);;
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='PNQ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='SXR']"))
				.click();
		driver.findElement(By.cssSelector(".ui-datepicker-today")).click();
		driver.findElement(By.cssSelector("#divpaxinfo")).click();

		int adult = 1;
		while (adult < 5) {
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			adult++;
		}

		int child = 0;
		while (child < 4) {
			driver.findElement(By.cssSelector("#hrefIncChd")).click();
			child++;
		}

		for (int infant = 0; infant < 4; infant++) {
			driver.findElement(By.cssSelector("#hrefIncInf")).click();
			infant++;
		}

		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		WebElement currencyOptions = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select currency = new Select(currencyOptions);
		currency.selectByIndex(3);
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		driver.manage().deleteAllCookies();
		driver.close();
	}

}

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class searchFlight {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.wakanow.co.uk/en-gb"); // URL launch
		driver.findElement(By.xpath("//span[normalize-space()='Find Hotels']")).click();  //navigate to Hotel tab
		driver.findElement(By.xpath("//span[normalize-space()='Book Flights']")).click();  //navigate back to flight tab
		driver.findElement(By.cssSelector(".way-select.select-md.mr-2")).click();    //click round-trip tab

		//Total number of passenger
		driver.findElement(By.cssSelector(".dropdown-toggle.btn.btn-secondary.passenger-btn")).click();
		
		int adult = 1;
		while (adult < 2) {
			driver.findElement(By.xpath("(//div[@class='row align-items-center'])[1] //button[@class='btn plus-btn']"))
					.click();
			adult++; //2 adults selected
		}

		int child = 0;
		while (child < 3) {
			driver.findElement(By.xpath("(//div[@class='row align-items-center'])[2] //button[@class='btn plus-btn']"))
					.click();
			child++;  //3 children selected
		}

		for (int infant = 0; infant < 2; infant++) {
			driver.findElement(By.xpath("(//div[@class='row align-items-center'])[3] //button[@class='btn plus-btn']"))
					.click();
			infant++;  //1 infant selected
		}
		driver.findElement(By.xpath("//div[@class='dropdown-item text-right'] //button[@class='btn btn-primary']"))
				.click();   // Done button is clicked
		driver.findElement(By.cssSelector(".mt-sm-0.select-md")).click();    //click to select classType
		driver.findElement(By.xpath("//span[contains(text(),'Business')]")).click();   //Business classType selected
		
		//City where the passengers are travelling from
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("#itinerary_0_departure"))).click().sendKeys("lagos").build()
				.perform();
		List<WebElement> originatedCity = driver
				.findElements(By.cssSelector(".dropdown-menu.p-0.show.ng-star-inserted"));
		System.out.println(originatedCity.size());

		for (WebElement i : originatedCity) {
			if (i.getText().contains("Lagos, Nigeria")) {
				i.click();
				break;
			}
		}
		Thread.sleep(500);

		//City where the passengers are travelling to
		a.moveToElement(driver.findElement(By.cssSelector("#itinerary_0_destination"))).click().sendKeys("heathrow")
				.build().perform();
		List<WebElement> destinationCity = driver
				.findElements(By.cssSelector(".dropdown-menu.p-0.show.ng-star-inserted"));
		System.out.println(destinationCity.size());

		for (WebElement i : destinationCity) {
			if (i.getText().contains("(LHR)")) {
				i.click();
				break;
			}
		}

		driver.findElement(By.cssSelector(".form-group.hero-custom-input.w-100.icon-input.mb-0")).click();
		driver.findElement(By.cssSelector("div[aria-label='Tuesday, August 8, 2023']")).click();
		driver.findElement(By.cssSelector("div[aria-label='Sunday, August 20, 2023']")).click();
		driver.findElement(By.cssSelector("label[for$='flexibledatepickerCheck']")).click();
		driver.findElement(By.cssSelector(".btn.btn-primary.hero-submit-btn.mt-3.mt-sm-0.py-sm-3")).click();
		Thread.sleep(60);
		
		a.clickAndHold(driver.findElement(By.cssSelector(".ng5-slider-span.ng5-slider-pointer.ng5-slider-pointer-max"))).moveByOffset(0, 50).click().build().perform();
		driver.findElement(By.cssSelector(".d-none.d-lg-inline-block")).click();
		WebElement dropDwn= driver.findElement(By.xpath("//span[normalize-space()='Business']"));
		Select dropdown = new Select(dropDwn);
		dropdown.selectByIndex(3);


		
	}

}

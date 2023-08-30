package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class classWork02stepDefinitions {

	public WebDriver driver;
	public String productName;
	public String productName2;
	@Given("user search a product with short word on Greencart page")
	public void productOnGgreencart() throws InterruptedException {
	   System.setProperty("webdriver,chrome,driver", "C:\\drivers\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
	   driver=new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	   driver.findElement(By.cssSelector(".search-keyword")).sendKeys("tom");
	   Thread.sleep(1500);
	   productName =driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	   System.out.println(productName);
	}

	@And("user search with the same short word on Top deal page")
	public void topDealPage() throws InterruptedException {
		driver.findElement(By.cssSelector(".cart-header-navlink:nth-child(2)")).click();
		Set<String> tabs= driver.getWindowHandles();
		Iterator<String> itrTab=tabs.iterator();
		String parentWindow = itrTab.next();
		String childWindow = itrTab.next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.cssSelector("#search-field")).sendKeys("tom");
		Thread.sleep(1500);
		productName2= driver.findElement(By.cssSelector("tbody tr td:nth-child(1)")).getText();
		System.out.println(productName2);
	   
	}

	@Then("user verifies the names displayed")
	public void verifyDisplayName() {
		assertEquals(productName, productName2);
	   
	}
}

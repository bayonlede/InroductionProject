import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class searchFlighto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.opodo.co.uk/flights/"); // URL launch
		//driver.switchTo().alert().accept();
		WebElement oneWay = driver.findElement(By.xpath("//span[contains(text(),'One way')]"));
		driver.findElement(with(By.tagName("span")).toLeftOf(oneWay)).click();   //one way is selected
		driver.findElement(By.xpath("//span[contains(text(),'Return')]")).click();   //return is selected
		
		
//		driver.findElement(By.cssSelector(".nf-form-radio-label.m--checked")).click(); //Round trip selected
//		var autoSuggest1 = "lagos";
//		Actions a= new Actions(driver);
//		a.moveToElement(driver.findElement(By.cssSelector(".nf-search-input--first"))).click().sendKeys(autoSuggest1).build().perform();
//		List<WebElement> departingCity = driver
//				.findElements(By.cssSelector(".dropdown-menu.p-0.show.ng-star-inserted"));
//		System.out.println(departingCity.size());
//
//		for (WebElement i : departingCity) {
//			if (i.getText().contains("Lagos [LOS]")) {
//				i.click();
//				break;
//			}
//		}

		//departure airport --- .nf-search-input--first
		

	}

}

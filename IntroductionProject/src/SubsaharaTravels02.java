import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SubsaharaTravels02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://subsaharatravels.advancecareersuk.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector(".btn.btn-primary.js-scroll-trigger")).click();
		WebElement fromDropdown = driver.findElement(By.cssSelector("#from"));
		Select origin = new Select(fromDropdown);
		origin.selectByIndex(7);
		WebElement toDropdown = driver.findElement(By.cssSelector("#to"));
		Select destination = new Select(toDropdown);
		destination.selectByIndex(1);
		driver.findElement(By.cssSelector("#datepicker")).click();
		driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		driver.findElement(By.cssSelector("a[data-date='3']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		// Assert.assertEquals(ExpectedTitle, ActualTitle);
		WebElement message = driver.findElement(By.cssSelector(".logo"));
		System.out.println(message.getText());
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.close();

	}

}

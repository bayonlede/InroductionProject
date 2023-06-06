import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClssworkOnTableWithinWebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("windown.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);

		js.executeScript("document.querySelector(\"div[class='tableFixHead']\").scrollTop=5000");

		List<WebElement> values = driver.findElements(By.cssSelector("#product:nth-child(2) tbody tr td:nth-child(3)"));
		/* System.out.println(values.size()); */

		int sum = 0;

		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i).getText());
			Integer.parseInt(values.get(i).getText());
			sum = sum + Integer.parseInt(values.get(i).getText());
		}

		System.out.println("Total is:" + sum);

		driver.close();
	}

}

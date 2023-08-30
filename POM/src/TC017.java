import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TC017 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://qa.advancecareersuk.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		
		//Validate Account Registration without providing data into any of the fields
		//Test data
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-acuk-red font-weight-bold px-3 rounded-0']")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
		
		
		
		
		
		driver.findElement(By.cssSelector("button[id='nextBtn']")).click();  //clk next button
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();  //click submit button
		
		

	}
}


	

	



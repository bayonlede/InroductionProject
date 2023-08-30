package ACUKloginPagePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://qa.advancecareersuk.com/login");
		loginPage LoginPage = new loginPage(driver);
		LoginPage.goToURL();
		LoginPage.userLogin("bayonle.dauda05@gmail.com", "password@123");
		
//		driver.findElement(By.id("email")).sendKeys("bayonle.dauda05@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("password@123");
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		driver.findElement(By.id("navbarDropdown")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}

}

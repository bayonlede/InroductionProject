

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenCart {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Desktops"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("Laptops & Notebooks"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("Components"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("Tablets"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("Software"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("Phones & PDAs"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("Cameras"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("MP3 Players"))).build().perform();
		driver.findElement(By.linkText("test 9 (0)")).click();
		driver.findElement(By.linkText("Desktops (13)")).click();
		driver.findElement(By.partialLinkText("- Mac (")).click();
		driver.findElement(By.cssSelector("img[class='img-fluid']")).click();
		driver.findElement(By.cssSelector("div[xpath='2']")).click();
		driver.findElement(By.id("input-quantity")).sendKeys("10");
		driver.findElement(By.cssSelector("button[class='btn btn-primary btn-lg btn-block']")).click();
		driver.close();
		
		
		
		/*driver.findElement(By.cssSelector("button[class='btn btn-light btn-lg']")).click();
		a.moveToElement(driver.findElement(By.cssSelector("input[placeholder='Keywords']"))).click().sendKeys("monitors");
		driver.findElement(By.cssSelector("select[class='form-select mb-1']")).click();
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();*/
		
		
		
		
		
	
		

	}

}

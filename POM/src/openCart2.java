import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class openCart2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
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
		
		
		
		
		
		/*iver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("span[xpath='1']"))).click();
		driver.findElement(By.linkText("Register")).click();*/
		
		//driver.findElement(By.id("input-quantity")).sendKeys("10");
		//driver.findElement(By.cssSelector("button[class='btn btn-primary btn-lg btn-block']")).click();

	}
	
	

}

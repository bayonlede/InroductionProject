import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class code02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("bayonle");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Password')]")).sendKeys("rahulshettyacademy");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1500);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

	}

}

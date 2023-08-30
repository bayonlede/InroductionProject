package registrationPagePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class userReg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.33.0-win-aarch64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
		landingPage homePage=new landingPage(driver);
		homePage.goToURL();
		homePage.register("musa bayo dauda", "bayo@gmail.com", "12345");
		
//		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("musa bayo dauda");
//		driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid")).sendKeys("bayo@gmail.com");
//		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
//		driver.findElement(By.id("exampleCheck1")).click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
//		driver.findElement(By.id("exampleFormControlSelect1")).click();
//		driver.findElement(By.cssSelector("#exampleFormControlSelect1 > option:nth-child(2)")).click();
//		driver.findElement(By.id("inlineRadio2")).click();
//		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.cssSelector("input[name='bday']"))).click().sendKeys("02081985").build().perform();
//		driver.findElement(By.cssSelector(".btn.btn-success")).click();
//		WebElement message= driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible"));
//		System.out.println(message.getText());
		
		

	}

}

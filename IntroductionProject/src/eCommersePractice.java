import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class eCommersePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		var searchWord = "br";
		var productName = "Brocolli";
		driver.findElement(By.cssSelector(".search-keyword")).sendKeys(searchWord);
		List <WebElement> allProducts = driver.findElements(By.cssSelector(".products"));
		
		for(int i=0; i<allProducts.size(); i++)
		{
		
			
		}
	}


}

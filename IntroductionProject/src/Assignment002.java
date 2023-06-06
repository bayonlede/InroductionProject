import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment002 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		
		
		List<WebElement> column = driver.findElements(By.cssSelector("#product:nth-child(2) th"));
		System.out.println("The number of Column is " + column.size());
		
		List<WebElement> header= driver.findElements(By.cssSelector("#product:nth-child(2) tr th:nth-child(1)"));
		header.size();
		List<WebElement> row= driver.findElements(By.cssSelector("#product:nth-child(2) tr td:nth-child(1)"));
		/* System.out.println(row.size()); */
		row.size();
		
		int sum = header.size() +  row.size();
		System.out.println("The total number of row is " +sum);
		
		List<WebElement>thirdColumn = driver.findElements(By.cssSelector("div[class='left-align'] tr:nth-child(3)"));
		thirdColumn.size();
		
		for(int i = 0; i<thirdColumn.size(); i++)
		{
			System.out.println(thirdColumn.get(i).getText());
		}
		
		driver.close();

	}

}

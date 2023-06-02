import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class spiceJetPractice01 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'])[1]")).click();
		WebElement origin = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']"));
		origin.click();
		driver.findElement(By.xpath("//div[contains(text(),'Amritsar')]")).click();
		WebElement destination = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']"));
		destination.click();
		driver.findElement(By.xpath("//div[contains(text(),'Kanpur')]")).click();
		driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")).click();
		WebElement travellersBox = driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']"));
		travellersBox.click();
		WebElement adult = driver.findElement(By.cssSelector("div[data-testid$='Adult-testID-plus-one-cta']"));
		//while loop
		int adlt = 1;
		while(adlt<3)
		{
			adult.click();
			adlt++;
		}
		WebElement child = driver.findElement(By.cssSelector("div[data-testid$='Children-testID-plus-one-cta']"));
		
		//for loop
		for(int chi=0; chi<4; chi++)
		{
			child.click();
		}
		
		WebElement infant = driver.findElement(By.cssSelector("div[data-testid$='Infant-testID-plus-one-cta']"));
		
		for(int inf=0; inf<3; inf++)
		{
			infant.click();
		}
		
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.cssSelector("div[data-testid$='home-page-travellers-done-cta']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		driver.close();

	}

}

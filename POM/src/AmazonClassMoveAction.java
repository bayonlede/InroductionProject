import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.interactions.Actions;

public class AmazonClassMoveAction {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\geckodriver-v0.32.0-win64\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Actions a = new Actions(driver);
		driver.findElement(By.cssSelector("div[id='nav-search-dropdown-card']")).click();
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).click();
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("ipod");
		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		//driver.findElement(By.cssSelector("span[id='a-autoid-4-announce']")).click();
		//driver.findElement(By.cssSelector("a[id='quantity_4']")).click();
		driver.findElement(By.cssSelector("input[id='add-to-cart-button']")).click();
		driver.findElement(By.cssSelector("input[value='Proceed to checkout']")).click();
		driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys("07831887450");
		driver.findElement(By.cssSelector("input[id='continue']")).click();
		

	}

}

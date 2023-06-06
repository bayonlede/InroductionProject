import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions a = new Actions(driver);
		
		WebElement accountList = driver.findElement(By.cssSelector("#nav-link-accountList"));
		WebElement languageList = driver.findElement(By.cssSelector("#icp-nav-flyout"));
		WebElement searchItems = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		var item = "laptop bag";
		
		a.moveToElement(accountList).build().perform();
		a.moveToElement(languageList).build().perform();
		a.moveToElement(searchItems).click().keyDown(Keys.SHIFT).sendKeys("laptop").build().perform();
		List <WebElement> productList = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		System.out.println(productList.size());
		int i=0;
		while(i<productList.size()) 
		{
		
			var name = productList.get(i).getText();
			if(name.equals(item)) 
			{
				productList.get(i).click();
			}
			i++;
			break;
				
		}

	}

}

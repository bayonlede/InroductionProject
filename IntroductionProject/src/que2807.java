import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class que2807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.microsoft.com/en-gb/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();

	}

}

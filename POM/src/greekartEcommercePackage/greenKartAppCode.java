package greekartEcommercePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import greekartEcommercePackage.Pages.cartPage;
import greekartEcommercePackage.Pages.landingPage;
import greekartEcommercePackage.Pages.orderPage;

public class greenKartAppCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//LANDING PAGE
		landingPage LandingPage=new landingPage(driver);
		LandingPage.goToURL();
		LandingPage.addPRoduct("tom");
		
		//GOTO CART PAGE
		cartPage CartPAge= new cartPage(driver);
		CartPAge.proceedToCart();
				
		//TERMS AND AGREEMENT PAGE
		orderPage OrderPage = new orderPage(driver);
		OrderPage.plaCeOrder();
		
	}

}

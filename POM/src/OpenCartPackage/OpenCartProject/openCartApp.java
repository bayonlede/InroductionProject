package OpenCartPackage.OpenCartProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import OpenCartPackage.OpenCartPages.addProductsToCart;
import OpenCartPackage.OpenCartPages.forgotPassword;
import OpenCartPackage.OpenCartPages.logiNPage;
import OpenCartPackage.OpenCartPages.regPage;

public class openCartApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//REGISTRATION PAGE
		regPage RegPage= new regPage(driver);
		RegPage.goToURL();
		RegPage.RegisterUser("bayo", "dauda", "bayonle.de@gmail.com", "Password@123");
		
		//LOGIN PAGE
		logiNPage LoginPage =new logiNPage(driver);
		LoginPage.pageLogin("bayonle.de@gmail.com", "Password@123");
		
		//FORGOT PASSWORD TEST
		forgotPassword ForgotPassword = new forgotPassword(driver);
		ForgotPassword.resetPassword("bayonle.de@gmail.com");
		
		//ADDING PRODUCTS TO CART
		addProductsToCart productsToCart= new addProductsToCart(driver);
		productsToCart.buyProduct();
		
	}

}

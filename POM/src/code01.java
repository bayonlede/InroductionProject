import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class code01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//C:\drivers\geckodriver-v0.32.0-win64
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//C:\drivers\edgedriver_win64
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();

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
		//driver.close();
		
		driver.get("https://www.reed.co.uk/career-advice/personal-statement-examples/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1500);
		//driver.manage().deleteAllCookies();
		//Thread.sleep(1000);
		driver.manage().window().maximize();
		String what= "software tester";
		String where= "London";
		driver.findElement(By.xpath("((//input[contains(@placeholder,\"e.g. 'office assistant'\")])[1]")).sendKeys(what);
		driver.findElement(By.xpath("((//input[contains(@placeholder,\"e.g. 'office assistant'\")])[1]")).sendKeys(where);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(button[class='button small-wide search-forms__submit']")).click();
			
		
		/*
		 * System.out.println(driver.findElement(By.xpath("//p[@class='error']")).
		 * getText()); Thread.sleep(1500);
		 * driver.findElement(By.linkText("Forgot your password?")).click();
		 * driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys(
		 * "Tosin"); Thread.sleep(1500);
		 * driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys(
		 * "bayonled.de@gmail.com"); Thread.sleep(1500);
		 * driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys
		 * ("07831997400"); Thread.sleep(1500);
		 * driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();
		 * Thread.sleep(1500);
		 * driver.findElement(By.xpath("//form/input[3]")).sendKeys("07831997400");
		 * Thread.sleep(1500);
		 * driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		 * Thread.sleep(1500);
		 * System.out.println(driver.findElement(By.className("infoMsg")).getText());
		 */
		// driver.close();

	}

}

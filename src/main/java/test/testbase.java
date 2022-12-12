package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase {

	public static WebDriver driver;

	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/Amrit/Selenium/CucumberP/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		//driver.get("https://techfios.com/test/101/");
		
	}

}

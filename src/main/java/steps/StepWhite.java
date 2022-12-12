package steps;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import PageObject.LoginPage1;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.testbase;

public class StepWhite   {
	public WebDriver driver;
	public LoginPage1 lp1;
	
	
			
	@Given("^\"([^\"]*)\" button exists$")
	public void button_exists(String arg1) throws InterruptedException  {
	    System.setProperty("webdriver.chrome.driver","/Users/Amrit/Selenium/CucumberP/Drivers/chromedriver");
		driver=new ChromeDriver();
	    lp1 = new LoginPage1(driver);
	    driver.get("https://techfios.com/test/101/");
	    Thread.sleep(3000);
	   System.out.println("White background button exists");
	    
	}

	@When("^i click on the button$")
	public void i_click_on_the_button() throws InterruptedException  {
	   lp1.clickblue();
	   Thread.sleep(3000);
		lp1.Clickbut();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue()  {
		WebElement next =driver.findElement(By.cssSelector("button[onclick='myFunctionWhite()']"));
	    String s = next.getCssValue("background-color");
		System.out.println(s);
		
		//System.out.println("Background color  is "	+ lp.getCssValue("background-color");

		
	
	   
	}
	@After
	public void teardown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
		driver.quit();		
	}
}



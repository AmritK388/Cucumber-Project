package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		public WebDriver ldriver;
		
		public LoginPage(WebDriver rdriver) {
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
		@FindBy(css = "button[onclick='myFunctionSky()']")
		@CacheLookup
		WebElement button;
		@FindBy(css = "button[onclick='myFunctionSky()']")
		@CacheLookup
		WebElement Skybackground;
		
		
		
		public void Clickbut() {
			button.click();
		}

		public void bluecheck() {
			Skybackground.isDisplayed();
		}
		
	}


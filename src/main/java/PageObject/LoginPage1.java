package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	public WebDriver ldriver;
	
	public LoginPage1(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(css = "button[onclick='myFunctionWhite()']")
	@CacheLookup
	WebElement button;
	
	@FindBy(css = "button[onclick='myFunctionWhite()']")
	@CacheLookup
	WebElement Whitebackground;
	
	@FindBy(css = "button[onclick='myFunctionSky()']")
	@CacheLookup
	WebElement button1;
	
	public void clickblue() {
		button1.click();
	}
	
	
	
	
	public void Clickbut() {
		button.click();
		
	}


	public void whitecheck() {
		Whitebackground.isDisplayed();
	}
		
	}



	




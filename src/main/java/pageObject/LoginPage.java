package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver Idriver;
	
	public LoginPage(WebDriver rDriver) {
		Idriver=rDriver;
		
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	public void enterUserName(String userName) {
		username.sendKeys(userName);
	}
	public void enterPassword(String password) {
		pass.sendKeys(password);
	}
	public void ClickOnLogin() {
		login.click();
	}
	
	
}

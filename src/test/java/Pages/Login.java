package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BaseClass{

private WebDriver driver;
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement userName;
	
	

}

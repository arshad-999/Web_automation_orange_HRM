package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
WebDriver driver=null;

public void browser_open() {
	System.setProperty("webdriver.chrome.driver", "//selenium//chromedriver.exe");

driver=new ChromeDriver();



}
}

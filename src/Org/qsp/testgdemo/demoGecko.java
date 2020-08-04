package Org.qsp.testgdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demoGecko 
{	@Test
	public void m()
	{
	System.setProperty("webdriver.gecko.driver", ".\\software\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	}
	
}

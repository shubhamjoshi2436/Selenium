package Org.qsp.testgdemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoTestng {
	@Test
	public void m1() 
	{

		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Reporter.log("hey.....!", true);
	}
	@Test
	public void m2()
	{
		System.out.println("Hiiiiii");
	}
}

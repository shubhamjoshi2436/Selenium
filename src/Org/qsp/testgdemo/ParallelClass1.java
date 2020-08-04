package Org.qsp.testgdemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClass1 
{
		@Test
		public void m1()
		{
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.close();
			System.out.println("one");
		}
}

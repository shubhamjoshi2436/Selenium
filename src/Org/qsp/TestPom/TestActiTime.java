package Org.qsp.TestPom;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import Org.qsp.Pom.ActiTimeHome;

public class TestActiTime {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ActiTimeHome ah=new ActiTimeHome(driver);
		ah.sendUname("admin");
		ah.sendPassword("manager");
		ah.clickLogin();
		Thread.sleep(2000);
		ah.clickLogout();
	}

}

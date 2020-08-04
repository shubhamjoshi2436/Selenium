package Org.qsp.TestPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import Org.qsp.Pom.SelenumHome;

public class TestSeleniumHomme {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SelenumHome sh=new SelenumHome(driver);
		sh.sendText("java");
		Thread.sleep(2000);
		driver.navigate().back();
		sh.sendText("testNG");
		Thread.sleep(2000);
		driver.navigate().back();
	}

}

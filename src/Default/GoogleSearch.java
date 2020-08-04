package Default;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String name = null;
		TakeScreens.take(name, driver);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Allu arjun",Keys.ENTER);
	}

}

package FlipkartScreenshot;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipscreen 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		String name = null;
		getscreen.take(name, driver);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		//driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone",Keys.ENTER);
		WebElement Ele = driver.findElement(By.xpath("//span[contains(.,'Electronics')]"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(Ele).build().perform();
		driver.findElement(By.xpath("//a[@title='Realme']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(.,'Realme Narzo 10 (That Green, 128 GB)')]/parent::div[@class='col col-7-12']")).click();
		Thread.sleep(2000);
		Set<String> thatgreen = driver.getWindowHandles();
		for (String green : thatgreen) 
		{
			driver.switchTo().window(green);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _3-iCOr wvj5kH']")).click();
	}

}

	



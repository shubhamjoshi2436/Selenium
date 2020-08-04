package Default;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		WebElement ALlJewellary = driver.findElement(By.xpath("//a[contains(.,'All Jewellery ')]"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(ALlJewellary).build().perform();
		driver.findElement(By.xpath("//span[@data-p='mens-jewellery-kadas,m']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']/parent::a[@id='pid_5675']")).click();
		Thread.sleep(2000);
		Set<String> tab = driver.getWindowHandles();
		for (String tabs : tab) 
		{
			driver.switchTo().window(tabs);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@name='chainselect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'2-2(2 2/16\")']/parent::li")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		
	}

}

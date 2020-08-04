package Default;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartMi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		WebElement Ele = driver.findElement(By.xpath("//span[contains(.,'Electronics')]"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(Ele).build().perform();
		driver.findElement(By.xpath("//span[contains(.,'Electronics')]/parent::li/descendant::a[@title='Mi']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(.,'Redmi K20 Pro (Flame Red, 128 GB)')]/parent::div[@class='col col-7-12']")).click();
		Thread.sleep(2000);
		Set<String> mi = driver.getWindowHandles();
		for (String mobile : mi) 
		{
			driver.switchTo().window(mobile);
		}
		Thread.sleep(2000);
		System.out.println("Title of 2nd tab = "+driver.getTitle());
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")).click();		
	}

}

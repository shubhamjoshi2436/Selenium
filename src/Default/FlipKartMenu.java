package Default;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		List<WebElement> MainMenu = driver.findElements(By.xpath("//ul[@class='_114Zhd']"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		for (WebElement main : MainMenu) 
		{
			System.out.println(main.getText());
			Thread.sleep(2000);
			a.moveToElement(main).build().perform();
		}
	}

}

package Default;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneMouse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		List<WebElement> menu = driver.findElementsByXPath("//ul[@class='wh-main-menu']/li");
		Thread.sleep(2000);
		System.out.println(menu.getClass());
		System.out.println("================");
		Actions a=new Actions(driver);
		for (WebElement list : menu) 
		{
			System.out.println(list.getText());
			Thread.sleep(2000);
			a.moveToElement(list).build().perform();
		}
	}

}

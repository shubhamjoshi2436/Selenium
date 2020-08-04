package Default;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLagger2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		Thread.sleep(2000);
		List<WebElement> menu = driver.findElementsByXPath("//ul[@class='topnav bodytext']/li");
		System.out.println(menu.getClass());
		System.out.println("====================");
		Actions a=new Actions(driver);
		for (WebElement menuList : menu) 
		{
			String name=menuList.getText();
			System.err.println(name);
			Thread.sleep(2000);
			a.moveToElement(menuList).perform();
			Thread.sleep(2000);
			TakeScreens.take(name, driver);
			Thread.sleep(2000);
			List<WebElement> subMenu = driver.findElements(By.xpath("//span[contains(.,'" + name + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			a.moveToElement(menuList).build().perform();
			for (WebElement sublist : subMenu) 
			{
				System.out.println(sublist.getText());
				
			}
		}
	}
}

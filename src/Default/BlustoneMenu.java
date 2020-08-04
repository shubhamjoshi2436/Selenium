package Default;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlustoneMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		WebElement rings = driver.findElement(By.xpath("//a[@title='Rings']/parent::li[@class='menuparent repb']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(rings);
		List<WebElement> main = driver.findElements(By.xpath("//ul[@class='wh-main-menu']"));
		for (WebElement mainmenu : main) 
		{
			System.out.println(mainmenu.getText());
		}
	}

}

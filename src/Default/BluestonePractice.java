package Default;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluestonePractice {

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
		driver.findElement(By.xpath("//ul[@class='two-col']/li/a[@title='Diamond Rings']")).click();
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']/parent::a[@id='pid_41483']")).click();
		Set<String> tab = driver.getWindowHandles();
		for (String tabs : tab) 
		{
			driver.switchTo().window(tabs);
		}
		WebElement buynow = driver.findElement(By.xpath("//input[@id='buy-now']"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(buynow));
		buynow.click();
	}

}

package Default;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneScenario6 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		WebElement rings = driver.findElement(By.xpath("//a[contains(.,'Rings ')]"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(rings);
		driver.findElement(By.xpath("//li[1]/a[@title='Diamond Rings']")).click();
		WebElement price = driver.findElement(By.xpath("//span[@class='title style-fill i-right']/parent::section[@id='Price-form']"));
		a.moveToElement(price);
		List<WebElement> pricelist = driver.findElements(By.xpath("//form[@id='price']"));
		for (WebElement text : pricelist) 
		{
				System.out.println(text.getText());
		}
		WebElement popular = driver.findElement(By.xpath("//span[contains(.,'Popular')]/parent::span"));
		a.moveToElement(popular);
		driver.findElement(By.xpath("//a[contains(.,'Price Low to High ')]")).click();
		WebElement newPrice = driver.findElement(By.xpath("//span[@class='title style-fill i-right']/parent::section[@id='Price-form']"));
		a.moveToElement(newPrice);
		List<WebElement> newpricelist = driver.findElements(By.xpath("//div[@class='form-items']/parent::form[@id='price']"));	
	}

}

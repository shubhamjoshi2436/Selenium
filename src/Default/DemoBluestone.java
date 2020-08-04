package Default;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBluestone {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bluestone.com");
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("Ring",Keys.ENTER);
		driver.findElement(By.xpath("//a[@id='pid_41483']/img[@class='hc img-responsive center-block']")).click();
		Set<String> tabs = driver.getWindowHandles();
		for (String tab : tabs) {
			driver.switchTo().window(tab);
		}
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		WebElement text = driver.findElement(By.xpath("//div[@class='formErrorContent']"));
		System.out.println("Text is :"+text.getText());
	}

}

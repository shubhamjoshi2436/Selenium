package Default;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneScenario8 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement AllJewellary = driver.findElement(By.xpath("//a[contains(.,'All Jewellery')]"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(AllJewellary);
		driver.findElement(By.xpath("//span[contains(.,'Kadas')]")).click();
		Thread.sleep(2000);
		Set<String> kadas = driver.getWindowHandles();
		for (String kada : kadas) {
			driver.switchTo().window(kada);
		}
		driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();
		driver.findElement(By.xpath("//span[contains(.,'2-6(2 6/16\")')]/parent::li")).click();
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		WebElement size = driver.findElement(By.xpath("//span[contains(.,'2-6(2 6/16\")')]/parent::div"));
		
	}

}

package Default;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dress = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']"));
		Actions a=new Actions(driver);
		a.moveToElement(dress).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a[@title='Dresses']/parent::li/descendant::a[@title='Casual Dresses']")).click();
		driver.findElement(By.xpath("//div[@class='left-block']")).click();
		driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']/span[contains(.,'Proceed to checkout')]")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("abcdeffh");
		driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
		WebElement text = driver.findElement(By.xpath("//li[contains(.,'Invalid email address.')]"));
		System.out.println(text.getText());
	}

}

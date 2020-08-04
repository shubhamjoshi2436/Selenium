package Default;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body[@class='one-col ul_desktop body_home modal-open']")).click();
		//driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Bed",Keys.ENTER);
		//WebElement text = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']/span[contains(.,'Living')]"));
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys(text.getText(),Keys.ENTER);
		WebElement sale = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(sale).build().perform();
		driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/descendant::span[contains(.,'Wooden Sofa Sets')]")).click();
	}

}

package Default;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		String text=username.getText();
		System.out.println("user name="+text);
		WebElement password = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		System.out.println("Password = "+password.getText());
		driver.findElement(By.xpath("//b[contains(.,'manager')]")).sendKeys(text);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password.getText(),Keys.ENTER);
	}

}

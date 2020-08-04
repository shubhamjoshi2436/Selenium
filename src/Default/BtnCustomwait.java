package Default;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BtnCustomwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shubham/Desktop/HtmlDemo/ButtonClick.html");
		WebElement btn = driver.findElement(By.id("otherBtn"));
		new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() 
		{
			@Override
			public Boolean apply(WebDriver driver) {
				return(btn).isEnabled();
			}
		});
		btn.click();

	}

}

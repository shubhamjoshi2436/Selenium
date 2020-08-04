package Default;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(co);//constructor overloading
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	}

}

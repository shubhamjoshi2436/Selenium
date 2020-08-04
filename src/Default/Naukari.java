package Default;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		System.out.println("current url is====>>>>>"+driver.getCurrentUrl());
		String parent = driver.getWindowHandle();
		System.out.println("Parent window is ===>>"+parent);
		Set<String> windows = driver.getWindowHandles();
		windows.remove(parent);
		for (String win : windows) {
			System.out.println("All windows parent and childs ==>>>"+win);
			driver.switchTo().window(win);
			driver.close();
			}
		
	}

}

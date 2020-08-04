package Default;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;


public class CloseBrowserRev {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		System.out.println("Parent window is ===>>"+parent);
		Set<String> windows = driver.getWindowHandles();
		
		List <String> lst=new ArrayList<String>(windows);
			for (int i = lst.size()-1; i >= 0; i--) 
			{
					String win=lst.get(i);
					driver.switchTo().window(win);
					Thread.sleep(2000);
					driver.close();
			}
	}

}

package Web_driver_methods;

// get windowhandles()  
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class TO_Windows_Handles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.dell.com");
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());
		for (String window : allwindows) {
			System.out.println(window);
		}
		
		driver.close();
	}
}

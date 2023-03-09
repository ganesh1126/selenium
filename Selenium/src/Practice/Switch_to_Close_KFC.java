package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_Close_KFC {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/TYSS/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(4000);
		Set<String>allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());
		for(String windowId : allwindows) {
			driver.switchTo().window(windowId);
			if(driver.getTitle().contains("barbequenation")) {
				driver.close();
				break;
			}
		}
	
		
	}
}

package assigment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClose_the_childWindow {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/TYSS/Downloads/MultipleWindow.html");
	driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click(); 
	Thread.sleep(4000);
	String parentwindowid = driver.getWindowHandle();
	Set<String> allwindowid = driver.getWindowHandles();
	
	allwindowid.remove(parentwindowid);
	
	System.out.println(allwindowid.size());
	
	for(String windowid: allwindowid) {
		driver.switchTo().window(windowid);
		driver.close();
	}
}
}

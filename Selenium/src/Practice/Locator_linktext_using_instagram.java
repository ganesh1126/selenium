package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_linktext_using_instagram {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://about.instagram.com/");
	Thread.sleep(1000);
	String parentwindowid = driver.getWindowHandle();
	driver.findElement(By.linkText("Log in")).click();
	Set<String> allwindowid = driver.getWindowHandles();
	allwindowid.remove(parentwindowid);
	for(String window: allwindowid) {
		driver.switchTo().window(window);
	}
	driver.findElement(By.id("loginForm")).click();
	Thread.sleep(6000);
	
	driver.findElement(By.name("username")).sendKeys("guruprasad");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("Ganesh@98");
	Thread.sleep(1000);
	driver.findElement(By.partialLinkText("Log")).click();
	
}
}

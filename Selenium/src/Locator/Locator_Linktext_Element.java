package Locator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Linktext_Element {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		String parentwindowid = driver.getWindowHandle(); // set the driver to this particular window
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Set<String> allwindowids = driver.getWindowHandles();  // send  driver control to the next window
		allwindowids.remove(parentwindowid);
		for(String windowid: allwindowids) {
			driver.switchTo().window(windowid);
		}
		Thread.sleep(6000);
		driver.findElement(By.linkText("Try Free")).click();	
		
}
}

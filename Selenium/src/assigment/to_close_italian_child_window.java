package assigment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class to_close_italian_child_window {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/TYSS/Downloads/MultipleWindow.html");
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
	Thread.sleep(4000);
	Set<String> allwindows = driver.getWindowHandles();
	System.out.println(allwindows.size());
	for(String  window : allwindows) {
		System.out.println(window);
}
}
}

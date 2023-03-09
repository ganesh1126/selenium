package assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClose_Only_TheParent {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/TYSS/Downloads/MultipleWindow.html");
	driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click(); 
	Thread.sleep(4000);
	driver.close();
}
}

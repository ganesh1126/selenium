package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_using_Kalkifashion {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.kalkifashion.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("customer-menu")).click();
	driver.findElement(By.id("email_id")).sendKeys("guru98@gmail.com");
	driver.findElement(By.id("signinsubmit")).click();
	driver.findElement(By.id("userpassword")).sendKeys("Ganesh@98");
	driver.findElement(By.id("signinsubmit")).click();
	driver.close();
	
	
}
}

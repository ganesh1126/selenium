package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_ID_Name {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.findElement(By.id("email")).sendKeys("gurucrp1998@fgmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("pass")).sendKeys("Ganesh@98");
	Thread.sleep(1000);
	driver.findElement(By.name("login")).click();
	driver.close();
}
}

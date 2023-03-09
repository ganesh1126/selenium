package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_using_DWS {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("gurupprrasd");
	driver.findElement(By.id("LastName")).sendKeys("Naggg");
	driver.findElement(By.id("Email")).sendKeys("gaaaneshh@89gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Gannesh@98");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Gannesh@98");
	driver.findElement(By.id("register-button")).click();
	
}
}

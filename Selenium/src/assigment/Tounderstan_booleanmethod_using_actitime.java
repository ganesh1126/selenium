package assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tounderstan_booleanmethod_using_actitime {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	WebElement check = driver.findElement(By.id("keepLoggedInCheckBox"));
	System.out.println(check.isDisplayed());
	System.out.println(check.isSelected());
	check.click();
	Thread.sleep(2000);
	System.out.println(check.isSelected());
	driver.close();
}
}

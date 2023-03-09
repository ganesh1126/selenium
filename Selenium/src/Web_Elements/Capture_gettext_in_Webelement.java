package Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_gettext_in_Webelement {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(3000);
	WebElement errorMessage = driver.findElement(By.xpath("//span[@class='errormsg' and contains(text(), 'Username')]"));
	System.out.println(errorMessage.getText());
	driver.close();
}
}

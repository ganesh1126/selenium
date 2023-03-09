package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_using_dws {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	WebElement errmsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
	System.out.println(errmsg.getText());
	driver.close();
}
}

package Locator;
//using css selector
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_using_CSS_Selector {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.woodenstreet.com/");
	for(;;) {                                     // infinite loop for multiple times 
		try {
			driver.findElement(By.id("loginclose1")).click();  // until it  driver get the element  then later it will come out of the loop
			break;
		} catch (NoSuchElementException e) {  // if no element is not found it will show the error message like this
			Thread.sleep(2000);
		}
	}
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("img[title='Office Furniture Online']")).click();
	driver.close();
	
}
}

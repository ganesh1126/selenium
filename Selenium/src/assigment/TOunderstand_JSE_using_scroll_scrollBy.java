package assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOunderstand_JSE_using_scroll_scrollBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//open browser
		driver.get("https://www.google.com/doodles");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for(;;) {
			try {
			driver.findElement(By.linkText("Celebrating Bubble Tea")).click();
			}catch(NoSuchElementException e) {
				js.executeScript("window.scrollBy(0,100)");
			}
		}
		
	}

}

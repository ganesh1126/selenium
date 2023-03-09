package JavaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tounderstan_JSE_using_scrollBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//open browser
		driver.get("https://www.google.com/doodles");
		
		//type cast inorder to call the method of jse
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//find the element which is at very bottom 
			//->find the elment at the  bottom
			//if the element is found click on it 
			//if it is not found use JSE and scroll down 
		
		
		
		for(;;) {
			try {
				driver.findElement(By.linkText("Turkey National Day 2022")).click();
				break;
			} catch (Exception e) {
				js.executeScript("window.scrollBy(0,500)");
			}
		}
		driver.close();

	}

}

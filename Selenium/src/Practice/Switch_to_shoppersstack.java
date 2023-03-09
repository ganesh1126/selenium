package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_shoppersstack {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/11");
	Thread.sleep(8000);
	driver.findElement(By.id("fl_compare")).click();
	Thread.sleep(2000);
	
	  Set<String> allwindowid = driver.getWindowHandles();
	  
	  for(String window : allwindowid) {
		  driver.switchTo().window(window);
		  String titlePage = driver.getTitle();
		  if(titlePage.contains("ebay")) {
			  driver.close();
			  break;
		  }
	  }
	  
}
}



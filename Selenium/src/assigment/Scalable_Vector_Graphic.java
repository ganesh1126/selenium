package assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Scalable_Vector_Graphic {
 @Test 
  public void path() throws InterruptedException  {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://petdiseasealerts.org/forecast-map#/");
	 Thread.sleep(10000);
	 driver.findElement(By.xpath("//*[name()='svg' and @id='map-svg']//*[@id='colorado']")).click();
 }
}
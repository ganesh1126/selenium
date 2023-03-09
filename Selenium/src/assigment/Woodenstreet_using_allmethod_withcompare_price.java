package assigment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Woodenstreet_using_allmethod_withcompare_price {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.woodenstreet.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("loginclose1")).click();

//		driver.findElement(By.linkText("Dining")).click();
//		driver.findElement(By.xpath("//img[@alt='Dining Tables']")).click();
//		driver.findElement(By.xpath("//img[@alt='Buy Dining Table Online at WoodenStreet']")).click();
//		String parentwindowid = driver.getWindowHandle();
//		Set<String> allwindowids =
//				driver.getWindowHandles(); allwindowids.remove(parentwindowid); for(String
//						windowid : allwindowids) { driver.switchTo().window(windowid); }
//				driver.findElement(By.id("button-cart-buy-now")).click();
//				driver.switchTo().window(parentwindowid);
//
//				driver.findElement(By.linkText("Kids Room")).click();
//				driver.findElement(By.xpath("//img[@alt='Kids Beds | Kids Furniture']")).click();
//				driver.findElement(By.xpath("//img[@title='Blossom Bunk Bed (Honey Finish)']" )).click();
//				String parentwindowid1 = driver.getWindowHandle(); 
//				Set<String>  allwindowids1 = driver.getWindowHandles();
//				allwindowids.remove(parentwindowid1); 
//				for(String windowid : allwindowids1) {
//					driver.switchTo().window(windowid); }
//				driver.findElement(By.id("button-cart-buy-now")).click();
//				driver.switchTo().window(parentwindowid);


				driver.findElement(By.linkText("Living")).click();
				driver.findElement(By.xpath("//img[@alt='Nest Of Tables']")).click();
				driver.findElement(By.xpath("//img[@title='Flora Side End Tables - Set of 2']")).click();
				String parentwindowid2 = driver.getWindowHandle();
				Set<String> allwindowids2 = driver.getWindowHandles();
				allwindowids2.remove(parentwindowid2);
				for(String windowid : allwindowids2) {
					driver.switchTo().window(windowid);
				}
				driver.findElement(By.id("button-cart-buy-now")).click();
				driver.navigate().refresh();

				


	}
}


package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Woodenstreet_interview {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.woodenstreet.com/");
		int navBarIndex =5;
		String categoryIndex="3";
		String productIndex="4";
		for(;;) {                                     
			try {
				driver.findElement(By.id("loginclose1")).click();  
				break;
			} catch (NoSuchElementException e) {  
				Thread.sleep(2000);
			}
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//nav[@class='menu']/ul/li["+navBarIndex+"]/a")).click();
		driver.findElement(By.xpath("//div[@class='shop-category container-1200']/div/a["+categoryIndex+"]")).click();
		driver.findElement(By.xpath("//div[@class='load-product']/div/div["+productIndex+"]/a")).click();
		String parentwindowid = driver.getWindowHandle();
		Set<String> allwindowids = driver.getWindowHandles();
		allwindowids.remove(parentwindowid);
		for(String windowid : allwindowids) {
			driver.switchTo().window(windowid);
		}
		Thread.sleep(6000);
		 String  captureprice = driver.findElement(By.xpath("//span[@class='offerprice']")).getText();
		 String[] prices = captureprice.split("R");
		 String priceofTheProduct = prices[1].replace("s"," ").replace(",","").replace(" ", "");
		 int price = Integer.parseInt(priceofTheProduct);
		 if(price<50000) {
			 driver.findElement(By.id("button-cart-buy-now")).click();
		 }else {
			 System.out.println("product cost is too high!!!");
		 }	
		 driver.close();
	}
}

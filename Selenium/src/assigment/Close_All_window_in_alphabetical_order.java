package assigment;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Multiset.Entry;

public class Close_All_window_in_alphabetical_order {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='fl_compare']")).click();
		Thread.sleep(3000);
		
		Map<String, String> titleAndWindow =  new  TreeMap<String,String>();
		Set<String> allwindowid = driver.getWindowHandles();
		for(String windowid: allwindowid) {
			driver.switchTo().window(windowid);
			titleAndWindow.put(driver.getTitle().toLowerCase().replace("www","").replace("com"," "),windowid);
			
		}
		
		for(java.util.Map.Entry<String, String> data: titleAndWindow.entrySet()) {
			driver.switchTo().window(data.getValue());
			System.out.println("closing: "+data.getKey()+"titled Page");
			driver.close();
		}
		

	}

}

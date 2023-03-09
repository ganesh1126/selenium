package Flipkart;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jiomart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.xpath("//div[text()='Home Appliances']")).click();
		driver.findElement(By.xpath("//a[text()='Air Conditioners']")).click();
		driver.findElement(By.xpath("//img[@title='Window-AC-Shop-By-Type.jpg']")).click();
		driver.findElement(By.xpath("//*[@id=\"pl\"]/div[2]/ul/li[1]/div/a/div[1]/div[1]/div[2]/div/img")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parentwindow);
		for(String windowid : allwindow) {
			driver.switchTo().window(windowid);
		}
		 driver.findElement(By.xpath("//div[text()='Select your Pin Code']")).click();
		
		driver.findElement(By.xpath("//div[text()='Detect My Location']")).click();
		
		//driver.close();
	}

}

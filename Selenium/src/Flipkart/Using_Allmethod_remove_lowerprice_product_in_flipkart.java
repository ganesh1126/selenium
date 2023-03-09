package Flipkart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Allmethod_remove_lowerprice_product_in_flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		for(;;) {
			try {
				driver.findElement(By.xpath("//button[text()='✕']")).click();
				break;
			} catch (NoSuchElementException e) {
				Thread.sleep(3000);
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[5]/div/div[1]/a/div/img[2]")).click();
		driver.findElement(By.xpath("//div[text()='realme C33 (Sandy Gold, 32 GB)']")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parentwindow);
		for(String windowid : allwindow) {
			driver.switchTo().window(windowid);
	}
}
}

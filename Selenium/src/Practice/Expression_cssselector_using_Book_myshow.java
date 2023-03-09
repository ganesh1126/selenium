package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expression_cssselector_using_Book_myshow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("img[alt='BANG']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt='Kranti']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Sign in']")).click();

		driver.close();

	}
}

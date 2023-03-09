package assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wooden_street_living_room_using_webelement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.woodenstreet.com/");
		int navBar=5;
		String category = "4";
		String index = "2";
		for(;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			}catch(NoSuchElementException e) {
				Thread.sleep(4000);
			}
		}
		Thread.sleep(4000);
		driver.findElement(By.linkText("Dining")).click();
	}
}

package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_map_using_iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).click();
		driver.switchTo().frame("app");
		WebElement element = driver.findElement(By.xpath("//span[text()='Calendar']"));
		element.click();
	}

}

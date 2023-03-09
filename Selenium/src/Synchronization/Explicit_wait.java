package Synchronization;
/***
 * @author Ganesh
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		driver.get("https://www.shoppersstack.com/products_page/6");
		
		driver.findElement(By.xpath("//label[text()='Check Delivery']/../div/input")).sendKeys("560010");
		explicitwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Check']")));
		driver.findElement(By.xpath("//button[text()='Check']")).click();

	}

}

package assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/***
 * 
 * @author Ganesh
 *
 */
public class Shoppersstack_pop_using_swager_doc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(7000);
		Actions action  = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		for(;;) {
			try {
				WebElement shop = driver.findElement(By.xpath("//a[text()='Swagger documentation']"));
				shop.click();
				break;
			} catch (Exception e) {
				action.sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(4000);
				
			}
		}
		Alert Alerpopup = driver.switchTo().alert();
		System.out.println(Alerpopup.getText());
		Alerpopup.accept();
		Alerpopup.sendKeys("admin");
		System.out.println(Alerpopup.getText());
		Alerpopup.accept();
		Alerpopup.sendKeys("admin");
		System.out.println(Alerpopup.getText());
		Alerpopup.accept();
		//Alerpopup.accept();
		
		driver.close();
		 
		

	}

}

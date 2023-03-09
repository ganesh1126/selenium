package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kalkifashion_using_mousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.kalkifashion.com/");
		//Using action
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.partialLinkText("SALWAR KAMEEZ"));
		action.moveToElement(ele).perform();
		
		 WebElement item = driver.findElement(By.partialLinkText("Dupatta"));
		 action.moveToElement(item).click().perform();
		 driver.close();
		 
	}

}

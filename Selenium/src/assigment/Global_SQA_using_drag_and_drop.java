package assigment;
// start from frame to put it in trash
/***
 * @author Ganesh
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Global_SQA_using_drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		WebElement photoManager = driver.findElement(By.xpath("//iframe[contains(@data-src,'photo-manager')]"));
		driver.switchTo().frame(photoManager);
		WebElement bodyFrame1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement bodyFrame2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement bodyFrame3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement bodyFrame4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement targetFrame = driver.findElement(By.id("trash"));
		WebElement gallery = driver.findElement(By.id("gallery"));
		Actions action = new Actions(driver);
		action.dragAndDrop(bodyFrame1, targetFrame).perform();
		action.dragAndDrop(bodyFrame2, targetFrame).perform();
		action.dragAndDrop(bodyFrame3, targetFrame).perform();
		action.dragAndDrop(bodyFrame4, targetFrame).perform();
		Thread.sleep(2000);
		action.dragAndDrop(bodyFrame1, gallery).perform();
		action.dragAndDrop(bodyFrame2, gallery).perform();
		action.dragAndDrop(bodyFrame3, gallery).perform();
		action.dragAndDrop(bodyFrame4, gallery).perform();
		//driver.switchTo().defaultContent();

//		Thread.sleep(3000);
//		driver.switchTo().frame(3);
//		WebElement Frame = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
//		WebElement Frame1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
//		WebElement Frame2 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
//		WebElement Frame3 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
//		WebElement tarFrame = driver.findElement(By.xpath("//span[text()='Trash']"));
//		Actions action1 = new Actions(driver);
//		action1.dragAndDrop(targetFrame,Frame).perform();
//		action1.dragAndDrop( targetFrame,Frame1).perform();
//		action1.dragAndDrop(targetFrame,Frame2).perform();
//		action1.dragAndDrop(targetFrame,Frame3).perform();






	}

}

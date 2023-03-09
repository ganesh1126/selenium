package assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gobal_drop_and_drag_return_from_trash_using_action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0); // switch to frame if it is present
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))// this is pick up the element and move
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))) // this is for moving one palace to another
		.release().build().perform(); // after pick up it will goes to released the item
		
		WebElement src = driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement trg = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		action.dragAndDrop(src, trg).perform();
		
		//driver.close();


	}

}

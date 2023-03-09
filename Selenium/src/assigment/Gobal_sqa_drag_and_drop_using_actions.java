package assigment;
/***
 * @author Ganesh
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gobal_sqa_drag_and_drop_using_actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.switchTo().frame(3);
		WebElement src = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement src1 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		WebElement src2 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement src3 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		WebElement des = driver.findElement(By.xpath("//span[text()='Trash']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(src, des).perform();
		action.dragAndDrop(src1, des).perform();
		action.dragAndDrop(src2, des).perform();
		action.dragAndDrop(src3, des).perform();
		//WebElement sourceele = explicitwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Trash']")));
		WebElement source = driver.findElement(By.xpath("//span[text()='Trash']"));
		WebElement target = driver.findElement(By.xpath("//h5[text()='High Tatras']/../../../..//ul[@id='gallery']"));
		WebElement target1 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		WebElement target2 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement target3 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		WebElement gallery = driver.findElement(By.id("gallery"));
		action.dragAndDrop(source, target).perform();



	}

}

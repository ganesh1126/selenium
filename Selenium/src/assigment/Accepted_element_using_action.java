package assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * 
 * @author Ganesh
 *
 */
public class Accepted_element_using_action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebDriverWait explicitwait = new WebDriverWait(driver, 5);

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/ul/li[2]")).click();
		driver.switchTo().frame(4);
		WebElement sourceElement = explicitwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//p[text()='Drag me to my target']/../../../head//title[text()='Selenium Practice Droppable - Accept']"))));
		WebElement desElement = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p/../../../head//title[text()='Selenium Practice Droppable - Accept']"));
		Actions action = new Actions(driver);
		action.moveToElement(sourceElement).clickAndHold(desElement).release().perform();
		

	}

}

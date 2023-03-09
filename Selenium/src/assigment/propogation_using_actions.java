package assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class propogation_using_actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Propagation");
		driver.switchTo().frame(5);
		WebElement sourceele = driver.findElement(By.xpath("//*[@id=\"draggable\"]/../../head//title[text()='Selenium Practice Droppable - Prevent propagation']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='droppable2-inner']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceele, destination).perform();

	}

}

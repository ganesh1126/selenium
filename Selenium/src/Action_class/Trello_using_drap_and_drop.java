package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello_using_drap_and_drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		

		driver.get("https://trello.com/login");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		driver.findElement(By.id("user")).sendKeys("ganeshprasadcrp1998@gmail.com");
		driver.findElement(By.id("login")).click();
		 WebElement psw = explicitwait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		 psw.sendKeys("Ganesh@98");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//div[@title='Ganesh']")).click();
		WebElement sourceElement = driver.findElement(By.partialLinkText("Testing"));
		WebElement targetElement = driver.findElement(By.xpath("//h2[text()='ppt']/../..//span[text()='Add a card']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement).build().perform();
		driver.close();

	}

}

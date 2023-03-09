package assigment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello_using_contextclick_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		

		driver.get("https://trello.com/");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		driver.findElement(By.id("user")).sendKeys("ganeshprasadcrp1998@gmail.com");
		driver.findElement(By.id("login")).click();
		 WebElement psw = explicitwait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		 psw.sendKeys("Ganesh@98");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		

		driver.findElement(By.xpath("//div[@title='Ganesh']")).click();
		Actions action = new Actions(driver);
		WebElement gan = driver.findElement(By.xpath("//span[contains(text(),'Testing')]"));
		action.contextClick(gan).perform();
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='quick-card-editor-buttons fade-in']"));
		for(WebElement prod : items) {
			Thread.sleep(5000);
			System.out.println(prod.getText());
		}
		driver.close();
		

	}

}

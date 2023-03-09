package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class To_understand_drag_and_drop_using_global_QSA {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		WebElement photomanager = driver.findElement(By.xpath("//iframe[contains(@data-src,'photo-manager')]"));
		driver.switchTo().frame(photomanager);
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("On top of Kozi kopka"));
		WebElement trash = driver.findElement(By.id("trash"));
		WebElement gallery = driver.findElement(By.id("gallery"));
		Actions action = new Actions(driver);
		action.dragAndDrop(image1, trash).perform();
		action.dragAndDrop(image2, trash).perform();
		action.dragAndDrop(image3, trash).perform();
		action.dragAndDrop(image4, trash).perform();


	}

}

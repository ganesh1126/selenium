package assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tounderstand_disbaleelement_using_JSE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		driver.findElement(By.linkText("jdk-8u361-linux-aarch64.rpm")).click();
		WebElement disablebutton = driver.findElement(By.linkText("Download jdk-8u361-linux-aarch64.rpm"));
		JavascriptExecutor js  =  (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", disablebutton);
		
		driver.close();

	}

}

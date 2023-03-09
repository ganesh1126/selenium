package JavaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable_Element_using_JSE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		WebElement disabletextbox = driver.findElement(By.xpath("//input[@class='form-control']"));
		JavascriptExecutor js  =  (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='entering data into disbale text box'",disabletextbox);
		
		
	/*	driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		driver.findElement(By.linkText("jdk-8u361-linux-x64.tar.gz")).click();
		WebElement disbalebutton = driver.findElement(By.linkText("Download jdk-8u361-linux-x64.tar.gz"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", disbalebutton);*/
		
		driver.close();
		

	}

}

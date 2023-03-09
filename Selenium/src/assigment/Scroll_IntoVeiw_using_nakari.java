package assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_IntoVeiw_using_nakari {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/registration/createAccount");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement reg = driver.findElement(By.xpath("//button[text()='Register Now']"));
		js.executeScript("arguments[0].scrollIntoView(false);", reg);

	}

}

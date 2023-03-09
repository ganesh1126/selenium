package assigment;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class capture_screenshot_on_ebay {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='fl_compare']")).click();
		
		Set<String> cloth = driver.getWindowHandles();
		for(String cl : cloth) {
			driver.switchTo().window(cl);
			if(driver.getTitle().contains("ebay")) {
				Thread.sleep(2000);
				TakesScreenshot ts = (TakesScreenshot)driver;
				File screenshot = ts.getScreenshotAs(OutputType.FILE);
				System.out.println(screenshot);
				
				org.openqa.selenium.io.FileHandler.copy(screenshot, new File("./errorshot/image5.png"));
			}
			
		}
	
		driver.close();

	}

}

package pop_ups;
import java.io.IOException;
// still no mandatory  for upload file pop ups 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Toavoid_file_upload_popups {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click(); //.sendKeys("C:\\Users\\TYSS\\Documents\"Ganesh Prasad.pdf");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./autoit/fileupload.exe");
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}

package assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tounderstand_uploadpop_using_fresherworld {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		Actions action = new Actions(driver);
		WebElement fileupload = driver.findElement(By.id("file-upload"));
		action.moveToElement(fileupload).sendKeys("\"C:\\Users\\TYSS\\Documents\\Ganesh Prasad.pdf\"");
		
	}

}

package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class sbi_using_perform_actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		//login Button
		 WebElement loginButton = driver.findElement(By.xpath("//button[@id='login']"));
		 Actions action = new Actions(driver);
		 action.doubleClick(loginButton).perform();
		 driver.close();
		 
		
	}

}

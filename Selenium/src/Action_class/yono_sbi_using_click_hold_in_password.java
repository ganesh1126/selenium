package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class yono_sbi_using_click_hold_in_password {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		Actions action = new Actions(driver);
		WebElement passwordtextfeild = driver.findElement(By.id("password"));
		passwordtextfeild.sendKeys("Testing@123");
		WebElement iconeye = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		action.clickAndHold(iconeye).perform();
		action.release(iconeye).perform();
		driver.close();

	}

}

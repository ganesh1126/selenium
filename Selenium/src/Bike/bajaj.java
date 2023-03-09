package Bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class bajaj {

	@Test(dependsOnGroups  = "smoke")
	public void jajab() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bajajauto.com/");
		Reporter.log("opening  bajaj Bike", true);
		driver.quit();
	}
}

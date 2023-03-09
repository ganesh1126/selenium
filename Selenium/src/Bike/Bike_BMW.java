package Bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bike_BMW {

	@Test(dependsOnGroups = "smoke")
	public void WMB() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmw-motorrad.in/");
		Reporter.log("opening  BMW Bike", true);
		driver.quit();
	}
}

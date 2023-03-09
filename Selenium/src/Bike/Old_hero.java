package Bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Old_hero {

	@Test(dependsOnGroups = "integration")
	public void Hero() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.heromotocorp.com/");
		Reporter.log("opening  hero Bike", true);
		driver.quit();
	}
}

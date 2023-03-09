package assigment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class swiggy {

	@Test(groups="dosa", dependsOnGroups = "idle" )
	public void yggiws() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
	}
}

package Car;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class mercy_Benz {

	@Test(groups="smoke", dependsOnGroups = "integration")
	public void Benz() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercedes-benz.com/");
		Reporter.log("opening mercedes-benz", true);
		driver.quit();
	}
}

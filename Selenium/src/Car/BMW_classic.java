package Car;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BMW_classic {
	@Test( dependsOnGroups = {"smoke", "integration"})
	public void BMW() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmw.in");
		Reporter.log("opening BMW", true);
		driver.quit();
	}
}

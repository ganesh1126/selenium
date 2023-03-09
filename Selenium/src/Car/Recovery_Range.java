package Car;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Recovery_Range {

	@Test(groups = {"smoke","integration"}, invocationCount = 2)
	public void Range() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.landrover.in/");
		Reporter.log("opening Range", true);
		driver.quit();
	}
}

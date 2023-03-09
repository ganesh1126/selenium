package Car;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class himalaya_jeep {

	@Test(groups={"integration","smoke"})
	public void Jeep() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jeep-india.com/");
		Reporter.log("opening jeep", true);
		driver.quit();
	}
}

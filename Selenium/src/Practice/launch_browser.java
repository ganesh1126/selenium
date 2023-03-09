package Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_browser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	FirefoxDriver driver1 = new FirefoxDriver();
	
	System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	EdgeDriver driver2 = new EdgeDriver();
	
	
}
}

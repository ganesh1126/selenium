package Web_driver_methods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close_quit_page {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.zomato.com");
	
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	FirefoxDriver driver1 = new FirefoxDriver();
	driver1.get("https://twitter.com/");
	
	System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	EdgeDriver driver2 = new EdgeDriver();
	driver2.get("https://swiggy.com/");
	
	driver.quit(); // close all the page which is present in parent window
	driver1.close();// close  just the page window 
	driver2.quit();
	
}
}

package Web_driver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_URL {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.apple.com");
	 String URL = driver.getCurrentUrl();
	 System.out.println(URL);
}
}

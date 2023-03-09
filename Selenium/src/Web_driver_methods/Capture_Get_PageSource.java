package Web_driver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Get_PageSource {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.ducati.com");
	String pagesource = driver.getPageSource();
	System.out.println(pagesource);
}
}

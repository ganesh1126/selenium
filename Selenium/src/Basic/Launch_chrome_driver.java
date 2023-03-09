package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_chrome_driver {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
}
}

package Launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class CH {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
}
}

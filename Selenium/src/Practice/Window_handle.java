package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.dell.com");
	String window = driver.getWindowHandle();
	System.out.println(window);
}
}

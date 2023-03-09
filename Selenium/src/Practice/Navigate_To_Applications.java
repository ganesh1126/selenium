package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_To_Applications {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.gmail.com");// get method to open this particular page
}
}

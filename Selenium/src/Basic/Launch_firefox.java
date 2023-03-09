package Basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_firefox {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
}
}

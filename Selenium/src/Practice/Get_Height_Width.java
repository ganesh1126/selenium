package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Height_Width {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.skillrary.com");
	driver.manage().window().maximize();
	Dimension  maximize = driver.manage().window().getSize();
	System.out.println(maximize.getHeight());
	System.out.println(maximize.getWidth());
}
}

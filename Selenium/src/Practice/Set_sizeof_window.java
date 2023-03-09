package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_sizeof_window {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.skillrary.com");
	Point position = driver.manage().window().getPosition();
	System.out.println(position.getX());
	System.out.println(position.getY());
	
	driver.manage().window().setSize(new Dimension(300, 900)); // we will set the size of window
	Thread.sleep(2000);
	driver.manage().window().setPosition(new Point(100, 500)); // moving the web page
	
	Thread.sleep(2000);
	driver.manage().window().setPosition(new Point(0, 0)); // moving the web page
}
}

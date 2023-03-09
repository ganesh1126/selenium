package Web_driver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_SetSize_of_Window {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.skillrary.com");
	driver.manage().window().fullscreen(); // explore full screen 
	
	Point   positionofbrowser = driver.manage().window().getPosition();
	System.out.println(positionofbrowser.getX());// it manage the position of the particular page
	System.out.println(positionofbrowser.getY());// // it manage the position of the particular page
	
	driver.manage().window().setSize(new Dimension(500, 1000));// it display the height and width of the page
	Thread.sleep(2000);
	driver.manage().window().setPosition(new Point(0, 0));// it set the specific position of the web page
	
	
	
}
}

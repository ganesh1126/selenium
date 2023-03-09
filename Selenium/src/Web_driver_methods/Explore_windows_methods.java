package Web_driver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explore_windows_methods {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.skillrary.com");
	Thread.sleep(3000);
	Dimension beforemaximize = driver.manage().window().getSize(); // getting size of page
	System.out.println(beforemaximize.getHeight());// getting height of the page
	System.out.println(beforemaximize.getWidth()); // getting width of the page
	
	driver.manage().window().maximize();
	
	System.out.println("=========================================================");
	Dimension aftermaximize = driver.manage().window().getSize();
	System.out.println(aftermaximize.getHeight());// getting height of the page after it maximize page
	System.out.println(aftermaximize.getWidth());// getting width of the page after it maximize page
}
}

package Web_driver_methods;
// get windowhandle() //  getting only single page id
import org.openqa.selenium.chrome.ChromeDriver;

public class TO_Window_Handle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.dell.com/");
	
	 String  windows = driver.getWindowHandle();
	System.out.println(windows);
}
}

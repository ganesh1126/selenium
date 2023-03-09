package Web_driver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

// get title()
public class TO_capture_tittleofwebpage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hp.com/");
		String titlepage = driver.getTitle();
		System.out.println(titlepage);
	}
}

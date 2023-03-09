package assigment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Current_url {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hp.com/");
	 String currenturl = driver.getCurrentUrl();
	 System.out.println(currenturl);
	 driver.close();
	}

}

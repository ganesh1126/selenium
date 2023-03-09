package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Current_url {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.hp.com");
	String url = driver.getCurrentUrl(); // getting URL we will use this method
	System.out.println(url);               // What we  get we will print in the output page
}
}

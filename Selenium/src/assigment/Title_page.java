package assigment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title_page {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	String titlepage = driver.getTitle();
	System.out.println(titlepage);
	driver.close();
}
}
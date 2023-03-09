package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.kalkifashion.com");
	String titlepage = driver.getTitle(); // here we will use to get the title of the particular web page
	System.out.println(titlepage);        // here what we get that we will print in the output 
}
}

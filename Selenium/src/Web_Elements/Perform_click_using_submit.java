package Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Perform_click_using_submit {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.skillrary.com/");
	driver.findElement(By.linkText("SIGN IN")).click();
	driver.findElement(By.xpath("//button[contains(text( ), 'Submit')]")).submit();
}
}

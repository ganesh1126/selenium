package Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_getAttribute {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.actitime.com/login.do");
	String toolTiptext = driver.findElement(By.id("keepMeLoggedInCaptionContainer")).getAttribute("title");
	System.out.println(toolTiptext);
}
}

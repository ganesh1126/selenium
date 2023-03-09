package Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Css_value {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		System.out.println(loginbutton.getCssValue("border-radius"));
		System.out.println(loginbutton.getCssValue("font-family"));
		System.out.println(loginbutton.getCssValue("color"));
		driver.close();
		
		
}
}

package assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tounderstand_boolean_using_DWS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		WebElement option = driver.findElement(By.id("pollanswers-1"));
		System.out.println(option.isSelected());
		option.click();
		Thread.sleep(1500);
		System.out.println(option.isDisplayed());
		System.out.println(option.isEnabled());
		System.out.println(option.isSelected());
		driver.close();
		
		
		
		
}
}

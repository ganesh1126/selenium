package Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_enum_copy_usernameto_passwordtxtfeild {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		WebElement emailtextfeild = driver.findElement(By.id("Email"));
		emailtextfeild.sendKeys("guru");
		Thread.sleep(1000);
		emailtextfeild.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		 emailtextfeild.sendKeys(Keys.CONTROL+"c");
		 
		 WebElement passwordtextfeild = driver.findElement(By.id("Password"));
		 passwordtextfeild.sendKeys(Keys.CONTROL+"v");
		 
		 driver.findElement(By.xpath("//input[@value='Log in']")).sendKeys(Keys.ENTER);
		 
	}
}

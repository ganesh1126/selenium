package Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.jar.asm.Opcodes;

public class Tounderstand_Booleanmethods_using_WE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/* for instagram using is displayed & is enabled.
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement loginbutton = driver.findElement(By.xpath("//button[.='Log in']"));
		System.out.println("Before entering data into username and password");
		System.out.println(loginbutton.isDisplayed());
		System.out.println(loginbutton.isEnabled());
		System.out.println("======================================");
		System.out.println("After entering data into username and password");
		driver.findElement(By.name("username")).sendKeys("guru");
		driver.findElement(By.name("password")).sendKeys("testing@123");
		System.out.println(loginbutton.isEnabled());
		*/
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(1500);
		WebElement option = driver.findElement(By.xpath("//option[text()='INR 50 - INR 99 ( 1 ) ']"));
		System.out.println(option.isSelected());
		option.click();
		Thread.sleep(1500);
		System.out.println(option.isSelected());
		driver.close();
		
		
		
	}

}

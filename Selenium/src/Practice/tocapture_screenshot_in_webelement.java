package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class tocapture_screenshot_in_webelement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://zomato.com/");
		File elementscreenshot = driver.findElement(By.xpath("//span[text()='Zomato']")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(elementscreenshot, new File("./errorshot/zlogo.png"));
		driver.close();
	}

}

package Screen_Shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Tocapture_webelement_screenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://udemy.com/");
		
		File elementScreenShot = driver.findElement(By.xpath("//img[@alt='Udemy']")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(elementScreenShot, new File("./errorshot/logo1.png"));
		driver.close();
	}

}

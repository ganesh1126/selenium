package Revision_selenium;
// using web element we took single pic screen shots 
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class zomato_webelement_screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/bangalore");
		File screenshot = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[7]/div/section/section/section/section/section[1]/div/div/div/div/div/img")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("./errorshot/dosa.png"));
		driver.close();
	}

}

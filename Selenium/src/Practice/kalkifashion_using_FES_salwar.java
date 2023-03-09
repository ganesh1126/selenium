package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kalkifashion_using_FES_salwar {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.kalkifashion.com/");
		List<WebElement> navelements = driver.findElements(By.xpath("//nav[not(@id='mobile-nav')]/div/div[@id='desktop-nav']/div"));
		System.out.println(navelements.size());
		for( WebElement navele: navelements) {
			System.out.println(navele.getText());
			System.out.println(navele.isDisplayed());
		}
}
}

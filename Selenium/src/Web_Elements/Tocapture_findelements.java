package Web_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tocapture_findelements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/");
		 List<WebElement> navelement = driver.findElements(By.xpath("//nav[not(@id='mobilr-nav')]/div/div[@id='desktop-nav']/div"));
		for(WebElement navele : navelement) {
			System.out.println(navele.getText());
			
		}
	}

}

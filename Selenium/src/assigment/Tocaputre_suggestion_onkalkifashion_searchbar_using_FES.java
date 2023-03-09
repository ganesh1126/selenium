package assigment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tocaputre_suggestion_onkalkifashion_searchbar_using_FES {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.kalkifashion.com/");
		driver.findElement(By.id("search-input")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='search-suggestions']/ul/li"));
		System.out.println(elements.size());
		for(WebElement name: elements) {
			System.out.println(name.getText());
		}

	}

}

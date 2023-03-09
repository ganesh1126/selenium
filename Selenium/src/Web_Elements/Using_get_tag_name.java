package Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_get_tag_name {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/");
		String alttext = driver.findElement(By.xpath("//img[@title='Coffee Table Sets online']")).getAttribute("alt");
		System.out.println(alttext);
		driver.close();
}
}

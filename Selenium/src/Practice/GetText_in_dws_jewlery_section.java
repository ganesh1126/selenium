package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_in_dws_jewlery_section {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.partialLinkText("Jewelry")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Black & White Diamond Heart")).click();

		WebElement topmsg = driver.findElement(By.xpath("//div[contains(text(), 'Heart')]"));
		WebElement downmsg = driver.findElement(By.xpath("//p[contains(text(), 'Bold')]"));
		System.out.println(topmsg.getText());
		System.out.println(downmsg.getText());
		driver.close();

	}
}

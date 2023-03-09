package pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_understand_using_prompt_pop_ups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("guru");
		Thread.sleep(1000);
		System.out.println(promptAlert.getText());
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("demo")).getText());
		driver.close();
	}

}

package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_understand_confirmation_popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://licindia.in/");
		try {
			driver.findElement(By.linkText("Agents Portal")).click();
		}
		catch (Exception e) {
			Thread.sleep(1000);
			driver.findElement(By.linkText("Agents Portal")).click();
			Thread.sleep(1000);
		}
		Alert confirmationpopup = driver.switchTo().alert();
		System.out.println(confirmationpopup.getText());
		Thread.sleep(1000);
		confirmationpopup.dismiss();
		Thread.sleep(1000);

		driver.close();
	}

}

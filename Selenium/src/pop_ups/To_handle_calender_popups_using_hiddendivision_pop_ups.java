package pop_ups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_handle_calender_popups_using_hiddendivision_pop_ups {

	public static void main(String[] args) {
		LocalDateTime ltd = LocalDateTime.now().plusMonths(2);
		String month = ltd.getMonth().toString();
		month = "" + month.charAt(0) + month.substring(1, month.length()).toLowerCase();
		int year = ltd.getYear();
		int day = ltd.getDayOfMonth();

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.get("https://www.goibibo.com/");
		// driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		for (;;) {
			try {
				driver.findElement(
						By.xpath("//div[text()='" + month + " " + year + "']/../..//p[text()='" + day + "']")).click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		driver.close();

	}

}

//    "//div[text()='May 2023']/../..//p[text()='22']"

package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");
		WebElement DaydropDown = driver.findElement(By.id("day"));
		WebElement MonthdropDown = driver.findElement(By.id("month"));
		WebElement YeardropDown = driver.findElement(By.id("year"));
		
		 Select daySelect = new  Select(DaydropDown);
		 Select monthSelect = new  Select(MonthdropDown);
		 Select yearSelect = new  Select(YeardropDown);
		 
		 daySelect.selectByIndex(0);
		 monthSelect.selectByValue("10");
		 yearSelect.selectByVisibleText("1905");
		 List<WebElement> allmonthOptions = monthSelect.getOptions();
		 for(WebElement month : allmonthOptions) {
			 System.out.println(month.getText());
			 monthSelect.selectByVisibleText(month.getText());
			 Thread.sleep(3000);
		 }
		 
	}
}

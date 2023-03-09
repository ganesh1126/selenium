package assigment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Agoda_using_All_DataDriven_Concepts {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./TestData/Agoda.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String testUrl = (String) pro.get("url");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(testUrl);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='ab-close-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='tab-flight-tab']")).click();
	
		FileInputStream FIS = new FileInputStream("./TestData/Agonda.xlsx");
		Workbook wb = WorkbookFactory.create(FIS);
		String fromplace = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String toplace = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		LocalDateTime ltd = wb.getSheet("Sheet1").getRow(1).getCell(2).getLocalDateTimeCellValue();
		int day  = ltd.getDayOfMonth();
		String month =  ltd.getMonth().toString();
		month = ""+ month.charAt(0) + month.substring(1, month.length()).toLowerCase();
		int year = ltd.getYear();
		
		driver.findElement(By.id("flight-origin-search-input")).sendKeys(fromplace);
		driver.findElement(By.id("flight-destination-search-input")).sendKeys(toplace);
		Actions action = new Actions(driver);
		 WebElement calender = driver.findElement(By.id("flight-departure"));
		 action.moveToElement(calender).click().perform();
		 
		for (;;) {
			try {
				driver.findElement(
						By.xpath("//div[text()='" + month + "']/..//span[text()='" + day + "']")).click();
				break;
			} catch (NoSuchElementException e) {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
	
		
		


	}

}

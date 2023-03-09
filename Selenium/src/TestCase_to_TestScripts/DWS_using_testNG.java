package TestCase_to_TestScripts;
/***
 * @author Ganesh
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS_using_testNG {
/* @Test(priority = 1)
 public void Register() throws EncryptedDocumentException, IOException {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
		FileInputStream fis = new FileInputStream("./TestData/DSW.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String data = workbook.getSheet("Sheet1").getRow(1).getCell(0).toString().toLowerCase();
	    driver.findElement(By.id("gender-"+data+"")).click();
	    System.out.println(data);
		
		String testData = workbook.getSheet("Sheet1").getRow(1).getCell(1).toString();
		driver.findElement(By.id("FirstName")).sendKeys(testData);
		String testdata1 = workbook.getSheet("Sheet1").getRow(1).getCell(2).toString();
		driver.findElement(By.id("LastName")).sendKeys(testdata1);
		String testdata2 = workbook.getSheet("Sheet1").getRow(1).getCell(3).toString();
		driver.findElement(By.id("Email")).sendKeys(testdata2);
		String testData3 = workbook.getSheet("Sheet1").getRow(1).getCell(4).toString();
		driver.findElement(By.id("Password")).sendKeys(testData3);
		String testData4 = workbook.getSheet("Sheet1").getRow(1).getCell(5).toString();
		driver.findElement(By.id("ConfirmPassword")).sendKeys(testData4);
		driver.findElement(By.id("register-button")).click();
		driver.quit();
 }*/
	
 @Test(priority=2, invocationCount = 6)
 public void Login() throws EncryptedDocumentException, IOException {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//pomUpskilling Selenium	Upskilling Selenium	p
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click(); 
		
		FileInputStream fis = new FileInputStream("./TestData/DSW.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String testdata2 = wb.getSheet("Sheet1").getRow(1).getCell(3).toString();
		driver.findElement(By.id("Email")).sendKeys(testdata2);
		String testData3 = wb.getSheet("Sheet1").getRow(1).getCell(4).toString();
		driver.findElement(By.id("Password")).sendKeys(testData3);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
		System.out.println(testdata2);
		driver.quit();
				
 }


}

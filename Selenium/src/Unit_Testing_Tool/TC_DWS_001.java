package Unit_Testing_Tool;
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

public class TC_DWS_001 {
 @Test
 public void  Login() throws EncryptedDocumentException, IOException {
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
		
	 
 }
}

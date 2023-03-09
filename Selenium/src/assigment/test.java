package assigment;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	public class test  {
	 
		@DataProvider
		public String[][] data() throws EncryptedDocumentException, IOException
		{
			File file=new File("./TestData/SystemStudy.xlsx");
			FileInputStream fis=new FileInputStream(file);
			Workbook workbook = WorkbookFactory.create(fis);
			
			Sheet webShopSheet = workbook.getSheet("Sheet1");
			int rowNum=webShopSheet.getPhysicalNumberOfRows();
			int colNum=webShopSheet.getRow(0).getPhysicalNumberOfCells();
			
			String[][] data=new String[rowNum-1][colNum];
			
			for(int i=0;i<rowNum-1;i++) {
				for(int j=0;j<colNum;j++) {
					data[i][j]=webShopSheet.getRow(i+1).getCell(j).toString();
				}
			}
			return data;
		}
		
		@Test(dataProvider ="data")
		public void systemTesting(String[] cred)
		{
			//Launching browser
			System.setProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Reporter.log("Browser is launched",true);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			//Opening the web page
			SoftAssert softAssert=new SoftAssert();
			driver.get(cred[2]);
			softAssert.assertEquals(driver.getCurrentUrl(), cred[2], "Welcome page is not displayed");
			Reporter.log("Welcome page is displayed",true);
			
			//Opening the login page
			WebElement login = driver.findElement(By.linkText("Log in"));
			login.click();
			softAssert.assertEquals(driver.getCurrentUrl(),cred[3] ,"Login page was not opened");
			Reporter.log("Login page was opened",true);
			
			//logging in to web page and open home page
			WebElement email = driver.findElement(By.id("Email"));
			email.sendKeys(cred[4]);
			softAssert.assertEquals(email.getAttribute("value"), cred[4], "Email was not entered");
			WebElement password = driver.findElement(By.id("Password"));
			password.sendKeys(cred[5]);
			softAssert.assertEquals(password.getAttribute("value"), cred[4], "Password was not entered");
			WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Log in']"));
			loginbutton.click();
			WebElement homepage = driver.findElement(By.xpath("//a[text()='sumanthchinivar16@gmail.com']"));
			softAssert.assertEquals(homepage.getText(), cred[4],"Homepage is not launched");
			Reporter.log("Home page is opened",true);
			
			WebElement books = driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
			books.click();
			softAssert.assertEquals(driver.getCurrentUrl(), cred[6],"Books was not displayed");
			Reporter.log("Books page was displayed",true);
			
			//select a book and add to cart
			WebElement bookSelect = driver.findElement(By.xpath("(//div[contains(@class,'picture')])[1]"));
			bookSelect.click();
			softAssert.assertEquals(driver.getCurrentUrl(),cred[7], "Books was not opened");
			Reporter.log("Books was opened",true);
			WebElement bookCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']"));
			bookCart.click();
			
			//place an order
			WebElement cart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
			cart.click();
			
		}
	}


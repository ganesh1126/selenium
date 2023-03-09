package TestCase_to_TestScripts;
/***
 * @author Ganesh
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DWS_using_System_TestScript {
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
	public void systemTesting(String[] cred) throws InterruptedException
	{
		//Launching browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicit=new WebDriverWait(driver, 5);
		driver.manage().window().maximize();
		Reporter.log("Window is maximized",true);
		
		//Opening the web page
		SoftAssert softAssert=new SoftAssert();
		driver.get("https://demowebshop.tricentis.com/");
		softAssert.assertEquals(driver.getCurrentUrl(), "Welcome page is not displayed");
		Reporter.log("Welcome page is displayed",true);
		
		//Opening the login page
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		softAssert.assertEquals(driver.getCurrentUrl() ,"Login page was not opened");
		Reporter.log("Login page was opened",true);
		
		//logging in to web page and open home page
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys(cred[4]);
		softAssert.assertEquals(email.getAttribute("value"), cred[0], "Email was not entered");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys(cred[5]);
		softAssert.assertEquals(password.getAttribute("value"), cred[1], "Password was not entered");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginbutton.click();
		WebElement homepage = driver.findElement(By.xpath("//a[text()='sumanthchinivar16@gmail.com']"));
		softAssert.assertEquals(homepage.getText(), cred[4],"Homepage is not launched");
		Reporter.log("Home page is opened",true);
		
		WebElement books = driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
		books.click();
		softAssert.assertEquals(driver.getCurrentUrl(),"Books was not displayed");
		Reporter.log("Books page was displayed",true);
	
		//select a book and add to cart
		WebElement addToCart = driver.findElement(By.xpath("//div[@class='product-grid']/div[1]/div/div[2]/div[3]/div[2]/input"));
		addToCart.click();	
		
		//place an order
		WebElement cart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		cart.click();
		softAssert.assertEquals(driver.getTitle(),cred[6] , "Cart was not opened");
		Reporter.log("Cart  was displayed",true);
		WebElement product = driver.findElement(By.xpath("(//a[text()='Computing and Internet'])[2]"));
		String title=product.getText();
		softAssert.assertEquals(title,cred[8],"Book was not added to cart");
		Reporter.log("Book was added to cart");
		
		
		WebElement terms = driver.findElement(By.xpath("//input[@id='termsofservice']"));
		terms.click();
		if(!(terms.isSelected())) {
			driver.navigate().refresh();
			terms.click();
		}
		
		
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
		softAssert.assertEquals(driver.getCurrentUrl(), cred[7],"Check Out page was not displayed");
		Reporter.log("Checkout page was displayed",true);
		
		WebElement billingAddress = driver.findElement(By.xpath("(//input[@title='Continue'])[1]"));
		billingAddress.click();
		
		WebElement shippingAddress = driver.findElement(By.xpath("(//input[@title='Continue'])[2]"));
		shippingAddress.click();
		
		WebElement shippingMethod = driver.findElement(By.xpath("(//input[@onclick='ShippingMethod.save()'])"));
		shippingMethod.click();
		
		WebElement paymentMethod = driver.findElement(By.xpath("(//input[@name='paymentmethod'])[1]"));
		paymentMethod.click();
		WebElement continueToInfo = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
		continueToInfo.click();
		
		WebElement paymentInfo = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
		paymentInfo.click();
		
		WebElement confirmOrder = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
		confirmOrder.click();
		
		WebElement orderConfirmed=driver.findElement(By.xpath("//div[@class='page checkout-page']"));
		WebElement orderConfirmedText = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
		softAssert.assertEquals(orderConfirmedText.getText(), cred[9],"Order not placed");
		Reporter.log("Order confirmed",true);
		driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@DataProvider
	public String[][] data() throws EncryptedDocumentException, IOException {
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
	public void Login(String[] data) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTextFeild = driver.findElement(By.id("Email"));
		emailTextFeild.clear();
		emailTextFeild.sendKeys("email");

		WebElement passwordTextFeild = driver.findElement(By.id("Password"));
		passwordTextFeild.clear();
		passwordTextFeild.sendKeys("psw");

		Actions action = new Actions(driver);
		WebElement computer = driver.findElement(By.partialLinkText("Computers"));
		action.moveToElement(computer).perform();

		WebElement Notebook = driver.findElement(By.partialLinkText("Notebooks"));
		action.moveToElement(Notebook).click().perform();

		WebElement AddToCart = driver.findElement(By.xpath("//input[@value='Add to cart']"));
		AddToCart.click();

		WebElement Shoppingcart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		Shoppingcart.click();

		WebElement checkbox = driver.findElement(By.id("termsofservice"));
		checkbox.click();

		driver.findElement(By.id("checkout")).click();

		WebElement FirstNameTextFeild = driver.findElement(By.id("BillingNewAddress_FirstName"));
		FirstNameTextFeild.sendKeys("guru");

		WebElement lastNameTextFeild = driver.findElement(By.id("BillingNewAddress_LastName"));
		lastNameTextFeild.sendKeys("manjunath");

		WebElement Email = driver.findElement(By.id("BillingNewAddress_Email"));
		Email.sendKeys("gurupraaa@gmail.com");


		WebElement company = driver.findElement(By.id("BillingNewAddress_Company"));
		company.sendKeys("TYSS COMPANY");

		WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"))
				.findElement(By.xpath("//option[text()='India']"));
		country.click();

		WebElement Address = driver.findElement(By.id("BillingNewAddress_City"));
		Address.sendKeys("#104/64 newton road jaipur");


		WebElement zipcode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
		zipcode.sendKeys("84874878");

		WebElement phonenumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
		phonenumber.sendKeys("7873984798");
		
		WebElement continue1 = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
		continue1.click();
		
		WebElement group = driver.findElement(By.id("shippingoption_0"));
		group.click();
		
		WebElement cash = driver.findElement(By.id("paymentmethod_0"));
		cash.click();
		
		WebElement continue2 = driver.findElement(By.id("//input[@onclick='PaymentMethod.save()']"));
		continue2.click();
		
		WebElement confirmpayment = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
		confirmpayment.click();
		
		WebElement orderid = driver.findElement(By.xpath("//ul[@class='details']"));
		System.out.println(orderid.getText());*/
























	}
}

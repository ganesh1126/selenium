package assigment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testdata_using_SystemStudy {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	File File = new File("./TestData/SystemStudy.xlsx");
	FileInputStream fis = new FileInputStream(File);
	Workbook wb =  WorkbookFactory.create(fis);
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	WebElement emailTextFeild = driver.findElement(By.id("Email"));
	emailTextFeild.clear();
	emailTextFeild.sendKeys("pad98@gmail.com");
	System.out.println(emailTextFeild.getText());
	
	WebElement passwordTextFeild = driver.findElement(By.id("Password"));
	passwordTextFeild.clear();
	passwordTextFeild.sendKeys("padam@98");
	System.out.println(passwordTextFeild.getText());
	
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	Actions action = new Actions(driver);
	WebElement compu = driver.findElement(By.linkText("Computers"));
	action.click(compu).perform();

	WebElement Notebook = driver.findElement(By.partialLinkText("Notebooks"));
	action.moveToElement(Notebook).click().perform();

	WebElement AddToCart = driver.findElement(By.xpath("//input[@value='Add to cart']"));
	AddToCart.click();

	WebElement Shoppingcart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
	Shoppingcart.click();

	WebElement checkbox = driver.findElement(By.id("termsofservice"));
	checkbox.click();

	driver.findElement(By.id("checkout")).click();
/*
	WebElement FirstNameTextFeild = driver.findElement(By.id("BillingNewAddress_FirstName"));
	FirstNameTextFeild.sendKeys("guru");

	WebElement lastNameTextFeild = driver.findElement(By.id("BillingNewAddress_LastName"));
	lastNameTextFeild.sendKeys("manjunath");

	WebElement Email = driver.findElement(By.id("BillingNewAddress_Email"));
	Email.sendKeys("pad98@gmail.com");


	WebElement company = driver.findElement(By.id("BillingNewAddress_Company"));
	company.sendKeys("TYSS COMPANY");

	WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"))
			.findElement(By.xpath("//option[text()='India']"));
	country.click();

	WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
	city.sendKeys(" udaipur");
	
	WebElement address = driver.findElement(By.id("BillingNewAddress_Address1"));
	address.sendKeys("#104/64, 2nd main 6th cross sarvarnagar");


	WebElement zipcode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
	zipcode.sendKeys("84874878");

	WebElement phonenumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
	phonenumber.sendKeys("7873984798");*/
	
	WebElement billingaddress = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
	billingaddress.click();

	
	Thread.sleep(10000);
	WebElement shippingaddress = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
	shippingaddress.click();
	
	Thread.sleep(10000);
	WebElement group = driver.findElement(By.id("shippingoption_0"));
	group.click();
	
	
	Thread.sleep(8000);
	Actions     action1  = new Actions(driver);
	action1.sendKeys(Keys.PAGE_DOWN).perform();
	WebElement continue4 = driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
	continue4.clear();
     
     Thread.sleep(8000);
	
	
	WebElement cash = driver.findElement(By.id("paymentmethod_0"));
	cash.click();
	
	WebElement continue2 = driver.findElement(By.id("//input[@onclick='PaymentMethod.save()']"));
	continue2.click();
	
	WebElement confirmpayment = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
	confirmpayment.click();
	
	WebElement orderid = driver.findElement(By.xpath("//ul[@class='details']"));
	System.out.println(orderid.getText());	
}

}

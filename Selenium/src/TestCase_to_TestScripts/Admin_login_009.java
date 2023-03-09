package TestCase_to_TestScripts;
/***
 * 
 * @author Ganesh
 *
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Admin_login_009 {
@Test
public void Login() throws InterruptedException {
	//Excepted Data
	String usernameData = "admin";
	String passwordData = "Test@123456";
	String exceptedLoginPageTitle = "Admin-Login";
	String exceptedHomePageTitle = "  Admin | Dashboard";
	// Step 1: Launch Browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		SoftAssert sf = new SoftAssert();
		
		//Step 2 : Enter URL
		driver.get("http://elftestingserver/domain/Hospital_Management_System/hms/admin/");
		String actualLoginPageTitle = driver.getTitle();
		Thread.sleep(2000);
		if(exceptedLoginPageTitle.equals(actualLoginPageTitle)) {
			System.out.println("Login page is displayed successful");
		}else {
			System.out.println("Login page is not  displayed ");
		}
		
		
		//Step 3: Enter userName Text feild
		WebElement usernameTextFeild = driver.findElement(By.name("username"));
		usernameTextFeild.clear();
		usernameTextFeild.sendKeys(usernameData);
		String actualDataEnteredInUsernameTextField = usernameTextFeild.getAttribute("value");
		if(actualDataEnteredInUsernameTextField.equals(usernameData)) {
			System.out.println("Username Text Field accepted the test data");
		}else {
			System.out.println("Username Text Field  is not accepted the test data");
		}
		
		
		//Step 4: Enter PasswordTextFeild
		WebElement passwordTextfeild = driver.findElement(By.name("password"));
		passwordTextfeild.clear();
		passwordTextfeild.sendKeys(passwordData);
		String actualDataEnteredInpasswordTextField = passwordTextfeild.getAttribute("value");
		if(actualDataEnteredInpasswordTextField.equals(passwordData)) {
			System.out.println("password Text Field accepted the test data");
		}else {
			System.out.println("password Text Field  is not accepted the test data");
		}
		
		
		//Step 5: Click on Login Button
		WebElement LoginButton = driver.findElement(By.name("submit"));
		String actualHomePageTitle = driver.getTitle();
		Thread.sleep(3000);
		if(exceptedHomePageTitle.equals(actualHomePageTitle)) {
			System.out.println("Home page is displayed successful");
		}else {
			System.out.println("Home page is not  displayed ");
		}
		LoginButton.click();
		driver.close();
		
}
}

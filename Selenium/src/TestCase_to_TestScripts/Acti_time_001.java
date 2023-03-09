package TestCase_to_TestScripts;
/***
 * @author Ganesh
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_time_001 {

	public static void main(String[] args) throws InterruptedException  {
		//Excepted Data
		String usernameData = "admin";
		String passwordData = "manager";
		String exceptedLoginPageTitle = "actiTIME - Login";
		String exceptedHomePageTitle = "  Enter Time-Track";
		
		//Step 1: Open the browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // to perform cross browser testing & OOAD
		System.out.println("Browser is launched");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		
		//Step 2 : Enter the test URL & click on "Enter" button
		driver.get("https://demo.actitime.com/login.do");
		String actualLoginPageTitle = driver.getTitle();
		Thread.sleep(2000);
		if(exceptedLoginPageTitle.equals(actualLoginPageTitle)) {
			System.out.println("Login page is displayed successful");
		}else {
			System.out.println("Login page is not  displayed ");
			
		}
		
		//Step 3 : click on "User-name" text field and provide  the input
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(usernameData);
		String actualDataEnteredInUsernameTextField = usernameTextField.getAttribute("value");
		if(actualDataEnteredInUsernameTextField.equals(usernameData)) {
			System.out.println("Username Text Field accepted the test data");
		}else {
			System.out.println("Username Text Field  is not accepted the test data");
		}
		//Step 4 : click on "password" text field and provide  the input
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys("manager");
		String actualDataEnteredInpasswordTextField = passwordTextField.getAttribute("value");
		if(actualDataEnteredInpasswordTextField.equals(passwordData)) {
			System.out.println("password Text Field accepted the test data");
		}else {
			System.out.println("password Text Field  is not accepted the test data");
		}
		
		//Step 5 : click on "Login" button
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(5000);
		String actualHomePageTitle = driver.getTitle();
		Thread.sleep(2000);
		if(exceptedHomePageTitle.equals(actualHomePageTitle)) {
			System.out.println("Home page is displayed successful");
		}else {
			System.out.println("Home page is not  displayed ");
		}
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(6000);
		driver.close();
		

	}

}

package Configaration_Annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POM.register;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass
	public void browser() {
		Reporter.log("Browser is Launched", true);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait explicitwait = new WebDriverWait(driver, 40);

	}
	

	@BeforeMethod
	public void LoginToApp() {
		driver.get("https://demowebshop.tricentis.com/");
		//WebElement loginLink = driver.findElement(By.linkText("Log in"));
		//loginLink.click();
		
		register reg = new register(driver);
		reg.getRegisterPage().click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("pad98@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("padam@98");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	
	@AfterMethod
	public void logout() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log out")).click();	
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
}

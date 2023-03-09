package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DWS {
	@DataProvider (name="cred", parallel = false)
	public String[][] sendData() {
		String [] [] sarr = {
				{"male","Neasha","dasapr","nersha1278@gmail.com","rasader@45","rasader@45"},
				/*{"female","Neaasha","daeynhpr","nersha0978@gmail.com","raaaader@45","raaaader@45"},
				{"male","Neaassha","darrenhpr","nersha9324@gmail.com","raaaadoo@45","raaaadoo@45"},
				{"female","Neahssha","darenhpr","nersha0882@gmail.com","rabbadoo@45","rabbadoo@45"},
				{"male","Nahhhree","draard","neaarrw56@gmail.com","rabbaiii@45","rabbaiii@45"},
				{"female","yannnneu","zaaard","zaaard888@gmail.com","xooossk@45","xooossk@45"},
				{"male","padmaaaa","nagggga","padnagaaa878@gmail.com","padaaa@09","padaaa@09"},
				{"female","naggggeee","avvvagsh","nagggeaa231@gmail.com","nagggess@66","nagggess@66"},
				{"male","raniii","rajjjii","raniii999@gmail.com","raniiiu@008","raniiiu@008"},
				{"male","kriishhh","jannnii","jannikuu223@gamil.com","jannnuuu@000","jannnuuu@000"},*/



		};
		return sarr;
	}

	@Test(dataProvider = "cred")
	public void Register(String [] credential) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert sf = new SoftAssert();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Bwoser Launched Successfully",true);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register")).click();
		WebElement radiobutton = driver.findElement(By.id("gender-"+credential[0]+""));
		radiobutton.click();
		
		WebElement firstNametextfeild = driver.findElement(By.id("FirstName"));
		firstNametextfeild.clear();
		firstNametextfeild.sendKeys(credential[1]);
		sf.assertEquals(firstNametextfeild.getAttribute("value"), credential[1], "firstname text feild should accepts charaters");
		Reporter.log("FirstName text feild entered sucessfully",true);

		WebElement lastNametextFeild = driver.findElement(By.id("LastName"));
		lastNametextFeild.clear();
		lastNametextFeild.sendKeys(credential[2]);
		sf.assertEquals(lastNametextFeild.getAttribute("value"), credential[2], "lastName text feild should accepts charaters");
		Reporter.log("lastName text feild entered sucessfully",true);

		
		WebElement EmailTextFeild = driver.findElement(By.id("Email"));
		EmailTextFeild.clear();
		EmailTextFeild.sendKeys(credential[3]);
		sf.assertEquals(EmailTextFeild, credential[3],"emailTextFeild should accepts valid data");
		Reporter.log("Email is entered successfully",true);
		
		
		
		WebElement passwordTextfeild = driver.findElement(By.id("Password"));
		passwordTextfeild.clear();
		passwordTextfeild.sendKeys(credential[4]);
		sf.assertEquals(passwordTextfeild, credential[4], "Password Text feild should accepts avalid data");
		Reporter.log("Password entered successfully",true);
		
		
		
		
		WebElement ConfirmPassordtextFeild = driver.findElement(By.id("ConfirmPassword"));
		ConfirmPassordtextFeild.clear();
		ConfirmPassordtextFeild.sendKeys(credential[5]);
		sf.assertEquals(ConfirmPassordtextFeild, credential[5], "Confirm Password Text feild should accepts avalid data");
		Reporter.log(" Confirm Password entered successfully",true);
		
		WebElement RegisterButton = driver.findElement(By.id("register-button"));
		RegisterButton.click();
		Reporter.log(" RegisterButton clicked  successfully",true);
		sf.assertAll();
		driver.quit();
	}


}

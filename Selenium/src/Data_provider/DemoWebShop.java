package Data_provider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*	String var = "female";
input[@id='gender-"+var+"'].click()*/
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoWebShop {

	@DataProvider (name="cred", parallel = false)
	public String[][] sendData() {
		String [] [] sarr = {
				{"male","Neasha","dasapr","nersha1278@gmail.com","rasader@45","rasader@45"},
				{"female","Neaasha","daeynhpr","nersha0978@gmail.com","raaaader@45","raaaader@45"},
				{"male","Neaassha","darrenhpr","nersha9324@gmail.com","raaaadoo@45","raaaadoo@45"},
				{"female","Neahssha","darenhpr","nersha0882@gmail.com","rabbadoo@45","rabbadoo@45"},
				{"male","Nahhhree","draard","neaarrw56@gmail.com","rabbaiii@45","rabbaiii@45"},
				{"female","yannnneu","zaaard","zaaard888@gmail.com","xooossk@45","xooossk@45"},
				{"male","padmaaaa","nagggga","padnagaaa878@gmail.com","padaaa@09","padaaa@09"},
				{"female","naggggeee","avvvagsh","nagggeaa231@gmail.com","nagggess@66","nagggess@66"},
				{"male","raniii","rajjjii","raniii999@gmail.com","raniiiu@008","raniiiu@008"},
				{"male","kriishhh","jannnii","jannikuu223@gamil.com","jannnuuu@000","jannnuuu@000"},



		};
		return sarr;
	}

	@Test(dataProvider = "cred")
	public void Register(String [] credential) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-"+credential[0]+"")).click();
		driver.findElement(By.id("FirstName")).sendKeys(credential[1]);
		driver.findElement(By.id("LastName")).sendKeys(credential[2]);
		driver.findElement(By.id("Email")).sendKeys(credential[3]);
		driver.findElement(By.id("Password")).sendKeys(credential[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(credential[5]);
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}


}

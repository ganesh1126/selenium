package TestCase_to_TestScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
/***
 * @author Ganesh
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DemoWebShop_001 {

	public static void main(String[] args) throws InterruptedException {
		String Exceptedresult = "Please enter some search keyword"; 
		String exceptedTitle = "Demo Web Shop";
		//Step 1: Open the browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // to perform cross browser testing & OOAD
		System.out.println("Browser is launched");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		//Step 2: Enter the URL
		driver.get("https://demowebshop.tricentis.com/");
		String webSite = driver.getTitle();
		if(webSite.contains(exceptedTitle)) {
			System.out.println("we are getting  current title");
		}else {
		System.out.println("we are not getting current title");
		}
		
		//Step 3:  .click on search icon button
		WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
		search.click();
		
		
		//Step 4: Getting a pop-up message
		Alert alertpopup = driver.switchTo().alert();
		String actualResult = alertpopup.getText();
		if(actualResult.contains(Exceptedresult)) {
			System.out.println("proper message is displayed");
		}else {
			System.out.println("proper message is not displayed ");
		}
		Thread.sleep(2000);
		alertpopup.accept();
		driver.close();
		
	
	}

}

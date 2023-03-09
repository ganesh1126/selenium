package TestCase_to_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Configaration_Annotation.BaseClass;
import Library_package.ReadFile;

public class DWS_using_end_to_end_testing  extends BaseClass{
	
	
	@DataProvider
	public String data() throws EncryptedDocumentException, IOException{
		ReadFile r1 = new ReadFile();
		String Email = r1.readFileInExcel("./TestData/Data_DWS_provider.xlsx","Sheet1", 1,3);
		String psw = r1.readFileInExcel("./TestData/Data_DWS_provider.xlsx","Sheet1", 1,4);
		String value = r1.toString();
		return value;
	}
	
	
	@Test
	public void computers()  {
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.partialLinkText("COMPUTERS"));
		action.moveToElement(ele).perform();
		
		//Notebooks
		WebElement Notebook = driver.findElement(By.partialLinkText("Notebooks"));
		action.moveToElement(Notebook).click().perform();
		
		//Add to Cart
		WebElement AddToCart = driver.findElement(By.xpath("//input[@value='Add to cart']"));
		AddToCart.click();
		
		// Click on Shopping Kart
		WebElement Shoppingcart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		Shoppingcart.click();
		
		//click on check box 
		WebElement checkbox = driver.findElement(By.id("termsofservice"));
		checkbox.click();
	}
		
	
	
	
	
	}
	

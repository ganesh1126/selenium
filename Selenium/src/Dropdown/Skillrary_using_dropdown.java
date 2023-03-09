package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Skillrary_using_dropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	driver.get("https://demoapp.skillrary.com/");
	WebElement multiListBox = driver.findElement(By.id("cars"));
	Select  multiSelect = new Select(multiListBox);
	System.out.println(multiSelect.isMultiple());
	multiSelect.selectByValue("399");
	multiSelect.selectByIndex(0);
	System.out.println("first selected options" + multiSelect.getFirstSelectedOption().getText());
	List<WebElement> SelectOptions = multiSelect.getAllSelectedOptions();
	for(WebElement list : SelectOptions) {
		System.out.println(list.getText());
	}
	multiSelect.deselectByIndex(3);
	driver.close();
	
}
}

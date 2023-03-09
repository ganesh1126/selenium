package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register {
	public WebDriver driver;



	public register(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	

	@FindBy(linkText = "Register")
	private WebElement registerPage;


	public WebElement getRegisterPage() {
		return registerPage;
	}
	
}

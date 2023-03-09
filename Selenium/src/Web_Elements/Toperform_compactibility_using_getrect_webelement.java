package Web_Elements;

import java.awt.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toperform_compactibility_using_getrect_webelement {
private static org.openqa.selenium.Rectangle passwordRectObject;

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com");
	WebElement emailtextfeild = driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]"));
	WebElement passwordtextfeild = driver.findElement(By.id("passContainer"));
	org.openqa.selenium.Rectangle email = emailtextfeild.getRect();
	org.openqa.selenium.Rectangle password = passwordtextfeild.getRect();
	
	if(email.getX() == password.getY()) {
		System.out.println("both  the element is properly alligned to right");
	}else {
		System.out.println("right alligment issue");
	}
	
	if(email.getX() + email.getWidth() == password.getX()+ password.getWidth()) {
		System.out.println("both the alligment is properly on center");
	}else {
		System.out.println("center alligment issue");
	}
	
	if(email.getY()+email.getHeight()+3 <= password.getY()) {
		System.out.println("height of the web page is properly in center");
	}else {
		System.out.println("height alligment issue");
	}
	
	if(email.getX()+email.getHeight()+3 <= password.getX()) {
		System.out.println("width of the web page is properly center"); 
	}else {
		System.out.println("width alligment issue");
	}
	driver.close();
	 
}
}

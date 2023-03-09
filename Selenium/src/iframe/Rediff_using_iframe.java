package iframe;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Rediff_using_iframe {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("login")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter name or email' and @id='TO_IDcmp2']")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Ganesh");
		WebElement bodyframe = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(bodyframe);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys(" Hello , Welcome");
		//switch back to parent
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Send")).click();
		 
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File screenshot = ts.getScreenshotAs(OutputType.FILE);
//		System.out.println(screenshot);
//		Thread.sleep(4000);
//
//		FileHandler.copy(screenshot, new File("./errorshot/image1.png"));

	}

}

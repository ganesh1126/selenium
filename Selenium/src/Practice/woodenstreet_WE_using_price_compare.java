package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class woodenstreet_WE_using_price_compare {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/");
		for(;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.linkText("Sofa Sets")).click();
		driver.findElement(By.partialLinkText("Wooden Sofa")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Marriott 3 Seater Wooden Sofa (Honey Finish, Irish Cream)")).click();
		Thread.sleep(3000);
		String productPrice1 = driver.findElement(By.xpath("//span[@class=\"offerprice\"]")).getText();
		String[] produtPrice1final = productPrice1.split("R");
		productPrice1=produtPrice1final[1].replace("s", "").replace(",", "").replace(" ", "");
		int finalPrice1=Integer.parseInt(productPrice1);
		System.out.println(finalPrice1);
		driver.findElement( By.id("button-cart-buy-now")).click();
		
		
		driver.findElement(By.linkText("Living")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Coffee Tables")).click();
		driver.findElement(By.linkText("Vesta Sheesham Wood Coffee Table with Four Stools (Dual Finish, Cream Blossom)")).click();
		Thread.sleep(3000);
		String productPrice2 = driver.findElement(By.xpath("//span[@class=\"offerprice\"]")).getText();
		String[] produtPrice2final = productPrice2.split("R");
		productPrice2=produtPrice2final[1].replace("s", "").replace(",", "").replace(" ", "");
		int finalPrice2=Integer.parseInt(productPrice2);
		System.out.println(finalPrice2);
		driver.findElement( By.id("button-cart-buy-now")).click();
		
		
		
		driver.findElement(By.linkText("Bedroom")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Beds")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Walken Bed With Storage (King Size, Walnut Finish)")).click();
		Thread.sleep(5000);
		String productPrice3 = driver.findElement(By.xpath("//span[@class=\"offerprice\"]")).getText();
		String[] produtPrice3final = productPrice3.split("R");
		productPrice3=produtPrice3final[1].replace("s", "").replace(",", "").replace(" ", "");
		int finalPrice3=Integer.parseInt(productPrice3);
		System.out.println(finalPrice3);
		driver.findElement( By.id("button-cart-buy-now")).click();
		
		Thread.sleep(3000);
//		for(;;) {
//			try {
//				driver.findElement(By.xpath("(//button[@data-garden-id=\"buttons.icon_button\"])[2]")).click();
//				break;
//			} catch (Exception e) {
//				Thread.sleep(1000);
//			}
//		}
		driver.findElement(By.xpath("//a[@class=\"cart\"]")).click();
		
		
		if(finalPrice1<finalPrice2&&finalPrice1<finalPrice3) {
			driver.findElement(By.xpath("//a[contains(text(),'Marriott 3 Seater Wooden Sofa')]/..//p[@title='Remove']")).click();
		}
		else if(finalPrice2<finalPrice3) {
			driver.findElement(By.xpath("//a[contains(text(),'Vesta Sheesham Wood Coffee Table')]/..//p[@title='Remove']")).click();
		}
		else {
			driver.findElement(By.xpath("//a[contains(text(),'Walken Bed With Storage')]/..//p[@title='Remove']")).click();
		}
		
	}
}

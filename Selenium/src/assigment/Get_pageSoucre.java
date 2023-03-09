package assigment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_pageSoucre {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String pagesource = driver.getPageSource();
	System.out.println(pagesource);
	driver.close();
}
}

package DataDriven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import netscape.javascript.JSObject;

public class ToRead_Data_from_JSON {

	public static void main(String[] args) throws IOException, ParseException {
				//FR
				FileReader fr =new FileReader("./TestData/testData.json");
				
				//object of File Type
				JSONParser parser = new JSONParser();
				JSONObject json = (JSONObject)parser.parse(fr);
				
				//read methods
				String testUrl = (String) json.get("url");
				
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get(testUrl);
				
				System.out.println(json.get("car"));
				System.out.println(json.get("Price"));
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				driver.close();
			}

		}



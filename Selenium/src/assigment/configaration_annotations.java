package assigment;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class configaration_annotations {

	@AfterSuite
	public void AfterSuit() {
		Reporter.log("AfterSuit", true);
	}
	
	@BeforeTest
	public void Beforetest() {
		Reporter.log("Beforetest", true);
	}
	
	@AfterClass
	public void AfterClass() {
		Reporter.log("AfterClass", true);
	}
	
	@Test
	public void delete() {
		System.out.println("Test case deleted");
	}
	
	@BeforeTest
	public void  BeforeMethod() {
		Reporter.log("BeforeMethod", true);
	}
	
	@Test 
	public void Copy() {
		System.out.println("Test case copy");
	}
	
	@AfterMethod
	public void AfterMethod() {
		Reporter.log("AfterMethod", true);
	}
	
	
	@BeforeSuite
	public void BeforeSuit() {
		Reporter.log("BeforeSuit", true);
	}
	
	
	
}

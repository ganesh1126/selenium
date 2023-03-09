package Basic;
// using depends on method

import org.testng.annotations.Test;

public class Account {

	@Test
	public void createAccount() {
		System.out.println("Account create successfully");
	}
	
	@Test(dependsOnMethods ="createAccount" )
	public void editAccount() {
		System.out.println("Account edit successfully");
	}
	
	@Test(dependsOnMethods ={"editAccount","createAccount"} )
	public void deleteAccount() {
		System.out.println("Account delete successfully");
	}
}

package Unit_Testing_Tool;

import org.testng.annotations.Test;

public class TC_Dummy_001 {
 @Test(priority = 5)
 public void invalidLogin() {
	 System.out.println("not a valid user");
 }
 @Test (priority = 1)
 public void Login() {
	 System.out.println("Login..............successfully");
 }
 
 @Test(priority = 3)
 public void deleteUser() {
	 System.out.println("Delete..... successfully ");
 }
 
}

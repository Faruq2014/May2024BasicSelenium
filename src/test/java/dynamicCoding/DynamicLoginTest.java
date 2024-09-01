package dynamicCoding;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfandElse;

public class DynamicLoginTest extends BaseTestWithIfandElse{
	
	
	  @Test 
	  public void validLoginTest() { 
		  loginTest("3e@bmail.com", "uijkkj4"); }
	  @Test 
	  public void validUserNameInvlidPassowrdLoginTest() { 
		  loginTest("3e@bmail.com", "rrr"); }
	  
	  @Test 
	  public void invalidPasswordTest() { 
		  loginTest("3e@bmail.com", "gggg"); }
	  
	  
	  @Test 
	  public void invalidUserNameTest() { 
		  loginTest("bmail.com", "gggg"); }
	 
	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}
	
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
	}
	
  //helper method
	public void loginTest(String userName, String password) {
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	
	}

}

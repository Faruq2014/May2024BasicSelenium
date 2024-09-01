package pageObjectModel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	LoginPage lp;
	@BeforeMethod
	public void openFaceBook() {
		openApplication();
	}
	
	@Test
	public void validLoginTest() {
		System.out.println("hello");
	    lp = new LoginPage(driver);
		lp.connectFriends();
		lp.userName("lk@bmail.com");
		lp.password("kjlk");
		lp.loginButton();
		
	}
	
	@Test
	public void invalidLoginTest() {
		System.out.println("hello");
		lp = new LoginPage(driver);
		lp.connectFriends();
		lp.userName("lk@bmail.com");
		lp.password("kjlk123");
		lp.loginButton();
		
	}
	
	@Test
	public void invalidUserLoginTest() {
		System.out.println("hello");
		lp = new LoginPage(driver);
		lp.connectFriends();
		lp.userName("lk@bmail");
		lp.password("kjlk");
		lp.loginButton();
		
	}

	@AfterMethod
	public void closeFaceBook() {
		closeApplication();
	}
}

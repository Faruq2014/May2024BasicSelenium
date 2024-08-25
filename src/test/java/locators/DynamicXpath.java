package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import facebookBase.BaseTestWithIfandElse;

public class DynamicXpath extends BaseTestWithIfandElse{
	@BeforeTest
	public void openFacebook() {
		openApplication();
	}
	
	@Test
	public void userNameTest() {
		// Beginning text
		driver.findElement(By.xpath("//*[contains(@class,'inputtext ')]")).sendKeys("gg23");
	}
	
	@Test
	public void passTest() {
		// ending text
		driver.findElement(By.xpath("//*[contains(@class,'55r1 _6luy _9npi')]")).sendKeys("fdf22");
	}
	@Test
	public void startWithXpathFormula() {
		
		driver.findElement(By.xpath("//button[starts-with (@id,'u_0_5_')]")).click();
	}
	
	//@Test
	public void containFunction() {
		driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
	}
	
	
	
	
	//@ AfterTest
public void closeFacebook() {
		closeApplication();
	}
}

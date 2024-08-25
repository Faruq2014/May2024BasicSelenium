package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfandElse;

public class BasicXpath extends BaseTestWithIfandElse{
	@BeforeTest
	public void openFacebook() {
		openApplication();
	}
	@Test
	public void xPathFormula() {
		//tag[@attribute='value']
		//input[@id='email']
	//	/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rr4");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lll");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@Test
	public void linkXpath() {
		driver.findElement(By.xpath("//a[@title='Spanish']")).click();
	}
	
	//@ AfterTest
public void closeFacebook() {
		closeApplication();
	}
}

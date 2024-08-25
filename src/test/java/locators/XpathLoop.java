package locators;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import facebookBase.BaseTestWithIfandElse;

public class XpathLoop extends BaseTestWithIfandElse{
	@BeforeTest
	public void openFacebook() {
		openApplication();
	}
	
	@Test
	public void xPathLoopTest() {
		///div[@id='pageFooter']/div[2]/ul/li)[29]
		
		driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[2]")).click();
	}
	
	@Test
	public void xPathIndexTest() {
		///div[@id='pageFooter']/div[2]/ul/li)[29]
		
		driver.findElement(By.xpath("//*[@id='pageFooterChildren']/ul/li[5]")).click();
	}
	
	
	//@ AfterTest
public void closeFacebook() {
		closeApplication();
	}
}

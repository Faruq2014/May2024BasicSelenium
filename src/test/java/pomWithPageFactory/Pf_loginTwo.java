package pomWithPageFactory;

import org.openqa.selenium.WebDriver;

public class Pf_loginTwo {
 WebDriver driver;

public Pf_loginTwo(WebDriver driver) {
	super();
	this.driver = driver;
	
}

public void userNameThree() {
	Pf_LoginPage lp = new Pf_LoginPage(driver);
 lp.uName.sendKeys("kjllkjkj");
}
 
}

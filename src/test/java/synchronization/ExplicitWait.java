package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	WebDriver driver;
	WebDriverWait wait;

	public ExplicitWait(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email") private WebElement uName;
	public WebElement userName(String eneteruserName) {
		 wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(uName));
		uName.sendKeys(eneteruserName);
		return uName;
	}
	
	@FindBy(name="pass") private WebElement password;
	
	public WebElement password(String enterPass) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(enterPass);
		return password;
	
	}
	
	@FindBy(xpath="") private WebElement lButton;
	public void loginButton() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(lButton)).click();
		//lButton.click();
		
	}
	
	
}

package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
   public WebDriver driver;
	String browser="chrome";
	
	
	
	public void openApplication() {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("edge")) {
		driver= new EdgeDriver();
	}
		else if (browser.equalsIgnoreCase("fairFox")) {
		driver= new FirefoxDriver();
	}else {
		
		System.out.println("you put wrong browser name");
		
	}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	
	public void closeApplication() {
		if(driver != null) {
			driver.quit();
		}
	}
	


}
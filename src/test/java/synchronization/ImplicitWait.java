package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
   WebDriver driver;
	@Test
	public void loginTest() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		// driver.get()== is fully loaded with  pageLoadTimeout(Duration.ofSeconds(10));
		// so you do not have to write 
		
		driver.navigate().to("https://www.facebook.com/");
		// implicit wait for loading 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//if you use driver.navigate().to()
		// make sure to write navigate method
		// because navigate method does not wait for page to load
		
		// implicit wait for findElement method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email"));
		
		// implicit wait for scripting
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
	}
}

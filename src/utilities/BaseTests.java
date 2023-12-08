package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import pageElements.LandingPage;

public class BaseTests {
	
	WebDriver driver;
	
	public WebDriver InitializeBrowser() {
		
		driver = new ChromeDriver();
		
		return driver;
		
	}
	
	public LandingPage LaunchApplicationByBhuvnesh() {
		
		driver = InitializeBrowser();
		LandingPage landingpage = new LandingPage(driver);
		landingpage.GoTo();
		return landingpage;
	}
	
	@AfterMethod
	public void CloseBrowser() {
		
		driver.quit();
	}
}

package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractMethods {

	WebDriver driver;
	public AbstractMethods(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public void Wait_Till_Link_Is_Clickable(By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	
	public void HoverAnyElement(WebElement ele) {
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(ele).build().perform();
	}
}

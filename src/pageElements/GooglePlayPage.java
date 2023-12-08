package pageElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class GooglePlayPage extends AbstractMethods {

	WebDriver driver;
	public GooglePlayPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void PrintURL() {
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String st:handles) {
			
			driver.switchTo().window(st);
			String title = driver.getTitle();
			if (title.contains("Airtel Thanks")) {
				break;
			}
		}
		
		System.out.println(driver.getCurrentUrl());
	}
	
	
}

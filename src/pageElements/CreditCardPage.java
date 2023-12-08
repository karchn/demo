package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class CreditCardPage extends AbstractMethods {

	WebDriver driver;
	public CreditCardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(@href,'Thanks_App')]")
	WebElement ThanksAppLink;
	
	
	public GooglePlayPage ClickOnThanksApp() {
		ThanksAppLink.click();
		
		GooglePlayPage gpp = new GooglePlayPage(driver);
		return gpp;
	}
	
	
}

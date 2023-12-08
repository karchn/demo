package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class RechargeOnlinePage extends AbstractMethods {

	WebDriver driver;
	public RechargeOnlinePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement RechargeNumberTxtbox;
	
	public RechargePacksPage EnterNumberToRecharge(String number) {
		RechargeNumberTxtbox.sendKeys(number);
		
		RechargePacksPage rpp = new RechargePacksPage(driver);
		return rpp;
	}
	
}

package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class ViewPlansPage extends AbstractMethods {

	WebDriver driver;
	public ViewPlansPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//button[contains(text(),'3359')]")
	WebElement FirstPlan;
	
	By Planlink = By.xpath("//button[contains(text(),'3359')]");
	
	
	public RechargeOnlinePage SelectPlan() {
		Wait_Till_Link_Is_Clickable(Planlink);
		FirstPlan.click();
		
		RechargeOnlinePage rp = new RechargeOnlinePage(driver);
		return rp;
		
	}
	
}

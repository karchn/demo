package pageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class RechargePacksPage extends AbstractMethods {

	WebDriver driver;
	public RechargePacksPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//label[text()='World Cup Packs']")
	WebElement WorldCupPackLink;
	
	By WCLink = By.xpath("//label[text()='World Cup Packs']");
	
	public void GoToWorldCupPackList() {
		
		Wait_Till_Link_Is_Clickable(WCLink);
		WorldCupPackLink.click();
		
		}
	
	@FindBy(xpath="//label[@data-testid='coreBenefitTitle']")
	List<WebElement> packsPrice;
	
	public void PrintPacks() {
		
		for (WebElement el:packsPrice) {
			System.out.println(el.getText());
		}
	}
	
	
}

package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class LandingPage extends AbstractMethods {

	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void GoTo() {
		driver.get("https://airtel.in");
		driver.navigate().to("https://airtel.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
	}
	
	By PrepaidMenuItem = By.id("nav-dropdowns-1");
	
	@FindBy(id="nav-dropdowns-1")
	WebElement PrepaidDropdown;
	
	@FindBy(xpath="(//label[text()='View Plans'])[2]")
	WebElement ViewPlansLink;
	
	
	public ViewPlansPage Click_on_ViewPlans() {
		
		Wait_Till_Link_Is_Clickable(PrepaidMenuItem);
		HoverAnyElement(PrepaidDropdown);
		ViewPlansLink.click();
		
		ViewPlansPage vp = new ViewPlansPage(driver);
		return vp;
	}
	
	
	
	// creating a locator FinanceMenuItem to hover for finance flows
	By FinanceMenuItem = By.id("nav-dropdowns-6");
	
	
	@FindBy(id="nav-dropdowns-6")
	WebElement FinanceMenuLink;
	
	@FindBy(xpath="//label[text()='Credit Card']")
	WebElement CreditCardLink;
	
	public CreditCardPage Click_on_CreditCard() {
		
		Wait_Till_Link_Is_Clickable(FinanceMenuItem);
		HoverAnyElement(FinanceMenuLink);
		CreditCardLink.click();
		
		CreditCardPage cc = new CreditCardPage(driver);
		return cc;
	}
}

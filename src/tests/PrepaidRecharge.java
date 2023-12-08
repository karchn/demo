package tests;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageElements.LandingPage;
import pageElements.RechargeOnlinePage;
import pageElements.RechargePacksPage;
import pageElements.ViewPlansPage;
import utilities.BaseTests;
import utilities.ExcelUtility;

public class PrepaidRecharge extends BaseTests {

	LandingPage lp;
	ViewPlansPage vp;
	RechargeOnlinePage rp;
	RechargePacksPage rpp;
	
	
	
	@Test(groups="Sanity")
	public void WorldCupPlanRecharge() throws InterruptedException, IOException {
//		
		lp = LaunchApplicationByBhuvnesh();
		vp = lp.Click_on_ViewPlans();
		
		
		rp = vp.SelectPlan();
//		
		ExcelUtility xs = new ExcelUtility();
		
		String number = xs.GetData(1, 0).toString();
		
		rpp = rp.EnterNumberToRecharge(number);
		
		
		rpp.GoToWorldCupPackList();
		
		rpp.PrintPacks();
	}
	
	
	
	
}

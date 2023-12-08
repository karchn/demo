package tests;

import org.testng.annotations.Test;

import pageElements.CreditCardPage;
import pageElements.GooglePlayPage;
import pageElements.LandingPage;
import utilities.BaseTests;

public class FinanceFlows extends BaseTests {
	
	
	LandingPage lp;
	CreditCardPage cc;
	GooglePlayPage gpp;
	
	
	@Test
	public void CreditCardFlow() {
		
		lp = LaunchApplicationByBhuvnesh();
		
		cc = lp.Click_on_CreditCard();
		gpp = cc.ClickOnThanksApp();
		
		gpp.PrintURL();
		
	}

}

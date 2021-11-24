package org.wvs.vtiger.tests;

import org.testng.annotations.Test;
import org.wvs.vtiger.pages.AccountPage;
import org.wvs.vtiger.pages.CreateAccountPage;
import org.wvs.vtiger.pages.HomePage;
import org.wvs.vtiger.pages.LoginPage;
import org.wvs.vtiger.utilty.WebUtil;

public class ValidateAccountPage {
	WebUtil wu=WebUtil.getObject();
	@Test
	public  void test001verifyAccountpage() {
		wu.launchBrowser("ch");
		LoginPage loginPage=new LoginPage();
	    
		HomePage hmPage=loginPage.validLogin();
		
		AccountPage accontPage=hmPage.verifyHomePage().accountLandingPage();
		
		accontPage.searchIndividualAccountInfo().deleteAccount().createAccountLandingPage();
		
}
}
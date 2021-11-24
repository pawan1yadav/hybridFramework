package org.wvs.vtiger.tests;

import org.testng.annotations.Test;
import org.wvs.vtiger.pages.HomePage;
import org.wvs.vtiger.pages.LoginPage;
import org.wvs.vtiger.utilty.WebUtil;

public class ValidateHomePage {
	WebUtil wu=WebUtil.getObject();
	@Test
	public  void test001verifyHomepage() {
		wu.launchBrowser("ch");
		LoginPage loginPage=new LoginPage();
		 HomePage hmPage=loginPage.validLogin();
       
		
		hmPage.verifyHomePage();
		hmPage.accountLandingPage();
		
}
}

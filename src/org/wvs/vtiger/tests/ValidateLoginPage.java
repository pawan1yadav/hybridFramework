package org.wvs.vtiger.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.wvs.vtiger.pages.LoginPage;
import org.wvs.vtiger.utilty.WebUtil;



public class ValidateLoginPage {
	WebUtil wu= WebUtil.getObject();
	@Test
	public  void test001verifyLoginpage() {
		wu.launchBrowser("ch");
		LoginPage loginPage=new LoginPage();
	    
		loginPage.validLogin();
}
	
	//@Test
	public  void test002verifyLoginpage() {
		wu.launchBrowser("ch");
		LoginPage loginPage=PageFactory.initElements(wu.getDriver(), LoginPage.class);
	    
		loginPage.invalidLogin();
}
	//@Test
	public  void test003verifyLoginpage() {
		wu.launchBrowser("ch");
		LoginPage loginPage=PageFactory.initElements(wu.getDriver(), LoginPage.class);
	    
		loginPage.loginWithInCorrectPassword();
}
	
}
package org.wvs.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wvs.vtiger.utilty.WebUtil;


public class HomePage {
	WebUtil wu=WebUtil.getObject();
	
	@FindBy(xpath="//a[text()='Sign Out']")
	public WebElement signOut;
	
	@FindBy(xpath="//a[text()='Marketing']")
	public WebElement marketing;
	
	@FindBy(xpath="//div[@class='drop_mnu'][2]//a[text()='Accounts']")
	public WebElement account;
	
	  public WebElement getSignOutWE() {
	    	 return signOut;
	     }
	     
	     public WebElement getMarketingWE() {
	    	 return marketing;
	     }
	     
	     public WebElement getAccountLinkWE() {
	    	 return account;
	     }
	
	

	public HomePage verifyHomePage() {
		String signOutText=wu.getText(signOut);
		boolean b=wu.equals(signOutText, "Sign Out");
		if(b==true){
			System.out.println("TestCase is Passed");
		}else {
			System.out.println("TestCase is Failed");
		}
		return new HomePage();
	} 
	
	public AccountPage accountLandingPage() {
		
		wu.mouseOver(marketing);
		wu.click(account, "Account subLink");
		return new AccountPage();
	}
   
	public HomePage() {
		PageFactory.initElements(wu.getDriver(), this);
	}
	
	
}

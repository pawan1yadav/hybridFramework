package org.wvs.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wvs.vtiger.utilty.WebUtil;

public class LoginPage {
	     
	@FindBy(xpath= "//input[@name='user_name']")          // @cache Lookup by default=false
	private  WebElement weUser;
	@FindBy(xpath= "//input[@name='user_password']")
	private  WebElement wePassword;
	@FindBy(xpath=  "//input[@name='Login']")
	private  WebElement weLogin;
	
     public WebElement getUserNameWE() {
    	 return weUser;
     }
     
     public WebElement getPasswordWE() {
    	 return wePassword;
     }
     
     public WebElement getLoginBtnWE() {
    	 return weLogin;
     }
	 

        WebUtil wu= WebUtil.getObject();
     
	
	public HomePage validLogin() {
		
		wu.openUrl("http://localhost:8888/");
        
		wu.sendKeys(weUser, "admin", "UserName");
		
		wu.sendKeys(wePassword, "admin", "userpwd");
		
		wu.click(weLogin, "loginBtn");
		return new HomePage();
	}
	
	public LoginPage() {
		PageFactory.initElements(wu.getDriver(), this);
	}
	
	public  void invalidLogin() {
		
//		WebUtil .openUrl("http://localhost:8888/");
//        
//		WebUtil .sendKeys(weUser, "admin", "UserName");
//		
//		//WebUtil .sendKeys(wePass, "admin", "userpwd");
//		
//		WebUtil .click(weLogin, "loginBtn");
//		
	}
	
public  void loginWithInCorrectPassword() {
		
//		WebUtil .openUrl("http://localhost:8888/");
//        
//		WebUtil .sendKeys(weUser, "admin", "UserName");
//		
//		WebUtil .sendKeys(wePass, "admn", "userpwd");
//		
//		WebUtil .click(weLogin, "loginBtn");
		
	}
	
	
}

package org.wvs.vtiger.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wvs.vtiger.utilty.WebUtil;

public class CreateAccountPage {
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement accName;

	@FindBy(xpath="//input[@name='phone']")
	private WebElement phNum;

	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[3]")
	private WebElement saveBT;

	@FindBy(xpath="(//input[@title='Cancel [Alt+X]'])[3]")
	private WebElement cancelBT;

	@FindBy(xpath="//td[contains(@class,'SelectedCell')]//b[text()='More Information ']")
	private WebElement moreInfoSection;

	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement otherPhNum;

	@FindBy(xpath="//input[@name='employees']")
	private WebElement employees_ED;

	public WebElement getAccountNameWE() {
		return accName;
	}

	public WebElement getPhoneNumWE() {
		return phNum;
	}

	public WebElement getSaveBtnWE() {
		return saveBT;
	}
	public WebElement getCancelBtnWE() {
		return cancelBT;
	}

	public WebElement getOtherPhNumWE() {
		return otherPhNum;
	}

	public WebElement getEmployeesWE() {
		return employees_ED;
	}
     
	public WebElement getMoreInfoTabWE() {
		return moreInfoSection;
	}

	WebUtil wu=WebUtil.getObject();

	public CreateAccountPage enterAccountBasicInfo() {
		wu.sendKeys(accName, "abc", "Account Name");
		wu.sendKeys(phNum, "2324536676", "Phone Number");
		return this;
	}

	public CreateAccountPage enterAccountMoreInfo() {
		wu.click(moreInfoSection, "More Info Tab");
		wu.sendKeys(otherPhNum, "35646756778", "Other PhoneNum");
		wu.sendKeys(employees_ED, "adsfsfsf", "Employees");
        return this;
	}

	public AccountDetailPage saveAccount() {
		wu.click(saveBT, "Save Button ");
		return new AccountDetailPage();
	}

	public AccountPage cancelAccount() {
		wu.click(cancelBT, "Cancel Button");
		return new AccountPage();
	}
	
	public CreateAccountPage() {
		PageFactory.initElements(wu.getDriver(), this);  
	}

}

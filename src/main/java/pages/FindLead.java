package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods {

	public static String firstLeadID;
	public FindLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Email']")
	WebElement eleEmailTab;
	public FindLead eMailTabClick() {
		click(eleEmailTab);
		return this;
	}
	
	@FindBy(name="emailAddress")
	WebElement eleEmailAddress;
	public FindLead setEmailVal(String email) {
		type(eleEmailAddress,email);
		return this;
	}
	
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindButton;
	public FindLead findLeadBtnClick() throws InterruptedException {
	click(eleFindButton);
	Thread.sleep(1000);
	return this;
	}
	
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleGetFirstLeadID;
	public String getFirstLeadID() {
	String firstLeadID = eleGetFirstLeadID.getText();
	return firstLeadID;
	}
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleClickFirstLeadID;
	public ViewLeadPage clickFirstLeadID() {
		click(eleClickFirstLeadID);
		return new ViewLeadPage();
	
	}
	
	@FindBy(name="id")
	WebElement eleID;
	public FindLead setLeadId(String data) {
		type(eleID,data);
		return new FindLead();
	}
	
	
	@FindBy(name="firstName")
	WebElement elefirstname;
	public FindLead setFirstName(String data) {
		type(elefirstname,data);
		return this;
	}

	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement elefirstID;
	public MergeLeadPage clickMergefirstLeadID() {
		click(elefirstID);
		switchToWindow(0);
		//driver.switchTo().window(allList.get(0));
		return new MergeLeadPage();
	}
	
	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")
	WebElement elesecondID;
	public MergeLeadPage clickMergeSecondLeadID() {
		click(elesecondID);
		switchToWindow(0);
		return new MergeLeadPage();
	}
}

	
	
	
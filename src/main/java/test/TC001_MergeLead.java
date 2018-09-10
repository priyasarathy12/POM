package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_MergeLead extends ProjectMethods {

@BeforeTest
public void setData() {
	testCaseName = "TC001_MergeLead";
	testDescription ="Merge leads in leaftaps";
	category = "Sanity";
	authors= "Haripriya";
	testNodes = "Leads";
	dataSheetName="Merge";
}
@Test(dataProvider="fetchData")
public void MergeLead(String uname,String password,String firstname) throws InterruptedException {
		String firstLeadID = new LoginPage()
		.typeUsername(uname)
		.typePassword(password)
		.clickLogin()
		.Crmsfa()
		.ClickLeads()
		.mergeLead()
		.firstIconClick()
		.setFirstName(firstname)
		.findLeadBtnClick()
		.getFirstLeadID();
		new FindLead()
		.clickMergefirstLeadID()
		.secondIconClick()
		.setFirstName(firstname)
		.findLeadBtnClick()
		.clickMergeSecondLeadID()
		.mergeBtnClk()
		.clickFindLead()
		.setLeadId(firstLeadID)		
		.findLeadBtnClick();
		
}
}

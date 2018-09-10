package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_DeleteLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_DeleteLead";
		testDescription ="Delete leads in leaftaps";
		category = "Sanity";
		authors= "Haripriya";
		testNodes = "Leads";
		dataSheetName="Delete";
	}
	@Test(dataProvider="fetchData")
	public void DeleteLead(String uname, String password,String email) throws InterruptedException{
		 String firstLeadID = new LoginPage()
		.typeUsername(uname)
		.typePassword(password)
		.clickLogin()
		.Crmsfa()
		.ClickLeads()
		.findLead()
		.eMailTabClick()
		.setEmailVal(email)
		.findLeadBtnClick()
		.getFirstLeadID();
		new FindLead()
		.clickFirstLeadID()
		.clickDeleteLead()
		.findLead()
		.setLeadId(firstLeadID)
		.findLeadBtnClick();
		
	}
	
}




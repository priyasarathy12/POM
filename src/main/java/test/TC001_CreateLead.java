package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testDescription ="login to leaftaps";
		category = "Smoke";
		authors= "sarath";
		testNodes = "Leads";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public  void CreateLead(String uname, String password, String cname, String fname, String lname, String mail ){
		new LoginPage()
		.typeUsername(uname)
		.typePassword(password)
		.clickLogin()
		.Crmsfa()
		.ClickLeads()
		.createLead()
		.CompanyName(cname)
		.FirstName(fname)
		.LastName(lname)
		.PrimaryMail(mail)
		.ClickSubmit();
		
	}


}

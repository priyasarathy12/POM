package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {
	
	public CreateLeadPage() {
	PageFactory.initElements(driver, this);	  
	} 
 //Added Comments for committ
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompanyName;
	@When("Set CompanyName as (.*)")
	public CreateLeadPage CompanyName(String data) {
	type(eleCompanyName,data);
	return this;
}
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;
	@When("Set FirstName as (.*)")
	public CreateLeadPage FirstName(String data) {
	type(eleFirstName,data);
	return this;
	}

	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;
	@When("Set LastName as (.*)")
	public CreateLeadPage LastName(String data) {
	type(eleLastName,data);
	return this;
	}
	
	@FindBy(id="createLeadForm_primaryEmail")
	WebElement elemail;
	public CreateLeadPage PrimaryMail(String data) {
	type(elemail,data);
	return this;
	}
	
	@FindBy(className="smallSubmit")
	WebElement elesubmit;
	@When("Clk SubmitBtn")
	public ViewLeadPage ClickSubmit() {
	click(elesubmit);
	return new ViewLeadPage();
	}
	
	
	
	
	
	

}

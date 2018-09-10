package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods {
	
	public MyLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Create Lead")
	WebElement elecreate;
	@When("Clk CreateLead")
	public CreateLeadPage createLead() {
	click(elecreate);
	return new CreateLeadPage();
}
	
	@FindBy(linkText="Find Leads")
	WebElement elefind;
	public FindLead findLead() {
		click(elefind);
		return new FindLead();
	}

	@FindBy(linkText="Merge Leads")
	WebElement elemerge;
	public MergeLeadPage mergeLead() {
		click(elemerge);
		return new MergeLeadPage();
	}
}

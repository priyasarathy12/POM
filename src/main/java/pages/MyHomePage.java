package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Leads")
	WebElement eleLead;
	@When("Go Leads")
	public MyLeadPage ClickLeads() {
	click(eleLead);
	return new MyLeadPage();

	}
}




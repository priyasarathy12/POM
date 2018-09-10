package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Delete")
	WebElement eleDelete;
	public MyLeadPage clickDeleteLead() {
		click(eleDelete);
		return new MyLeadPage();
	}
	
	@FindBy(linkText="Find Leads")
	WebElement eleFindLead;
	public FindLead clickFindLead() {
		click(eleFindLead);
		return new FindLead();
	}
	
}

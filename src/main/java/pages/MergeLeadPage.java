package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//img[@src='/images/fieldlookup.gif']")
	WebElement eleImg1;
	public FindLead firstIconClick() {
		click(eleImg1);
		switchToWindow(1);
		return new FindLead();
	}
	
	@FindBy(xpath="(//img[@alt='Lookup'])[2]")
	WebElement eleImg2;
	public FindLead secondIconClick() {
		click(eleImg2);
		switchToWindow(1);
		return new FindLead();
	}
		@FindBy(linkText="Merge")
		WebElement eleMergebtn;
		
		public ViewLeadPage mergeBtnClk() {
		click(eleMergebtn);
		driver.switchTo().alert().accept();
	    return new ViewLeadPage();
		}
}

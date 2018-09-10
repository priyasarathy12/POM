package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods {

	public HomePage() {
	PageFactory.initElements(driver, this);
	}
    @FindBy(className="decorativeSubmit")
	WebElement eleLogOut;
    
	public LoginPage clickLogOut() {
	//WebElement eleLogin = locateElement("class", "decorativeSubmit");
	click(eleLogOut);
	return new LoginPage();
	}
	
	@FindBy(className="crmsfa")
	WebElement elecrmsfa;
	@When("Go CRMSFA")
	public MyHomePage Crmsfa() {
	click(elecrmsfa);
	return new MyHomePage();
	}
	}





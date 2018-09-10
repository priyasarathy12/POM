package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	public ChromeDriver driver;
	@Given("Launch the browser")
	public void launchbrowser() 
	{
	// Create Object
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@And("Load the Url")
	public void loadurl()
	{
	//Load URL
	driver.get("http://leaftaps.com/opentaps/");
	}
	
	@And("Maximize the browser")
	public void maximize()
	{
	//Maximize()
    driver.manage().window().maximize();
	}
	
	@And("set timeout")
	public void managetime()
	{
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@And("Enter username")
	public void usernameCSR(String uname )
	{
	//Enter UserName
	driver.findElementById("username").sendKeys("DemoSalesManager");
	}
	
	@And("Enter password")
	public void passwordCSR(String pwd)
	{
	//Enter Password
	driver.findElementById("password").sendKeys("crmsfa");
	}

	@And("Enter the username as (.*)")
	public void username(String uname )
	{
	//Enter UserName
	driver.findElementById("username").sendKeys(uname);
	}
	
	@And("Enter the password as (.*)")
	public void password(String pwd)
	{
	//Enter Password
	driver.findElementById("password").sendKeys(pwd);
	}	
	
	@When("Click login button")
	public void loginbutton()
	{
	//Click Login Button
	driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("verify that login is successful")
	public void verifyLogin()
	{
		System.out.println("Login verified");
	}
	
	@And("Click CRMSFA")
	public void clickCRMSFA() 
	{
	driver.findElementByClassName("crmsfa").click();
	}

	@And("Click Leads")
	public void clickLeads() 
	{
	driver.findElementByLinkText("Leads").click();
	}
	
	@And("Click CreateLead")
	public void createLeads() 
	{
	driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("Give CompanyName as (.*)")
	public void companyName(String cmpny) 
	{
	driver.findElementById("createLeadForm_companyName").sendKeys(cmpny);	
	}
	
	@And("Give FirstName as (.*)")
	public void firstName(String fname) 
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}
	
	@And("Give LastName as (.*)")
	public void lastName(String lname) 
	{
	driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}
	
	@And("Click SubmitBtn")
	public void clickSubmit()
	{
		driver.findElementByClassName("smallSubmit").click();
        
	}
	
	@And ("Click FindLead")
	public void clickFindLead() {
		driver.findElementByLinkText("Find Leads").click();
	}
	
	@And ("Enter FirstName")
	public void enterFirstName() {
		driver.findElementByXPath("//*[@id=\"ext-gen248\"]").sendKeys("Abirami");
	}
	
	@And ("Click FindLeadsBtn")
	public void clickFindLeadBtn() {
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	}
	
	@And ("Click FirstResultingLead")
	public void clickFirstResultingLead() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@And ("Click Edit")
	public void clickEdit() {
	driver.findElementByLinkText("Edit").click();
	}
	
	@And ("Update the CompanyName")
	public void updateCompanyName() {
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Verizon");	
	}
	@And ("Click updateSbmtBtn")
public void clickUpdateSbmtBtn() {
		driver.findElementByClassName("smallSubmit").click();
	}
	@And ("Verify the CompanyName")
public void verifyCompanyName() {
		
	}
		
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

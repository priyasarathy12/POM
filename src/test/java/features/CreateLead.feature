Feature: Leaftaps Automation

#Background:
#Given Launch the browser
#And Maximize the browser
#And set timeout
#And Load the Url

@CLusingframework
Scenario Outline: Create Lead
And Give username as <username>
And Give password as <password>
When Clk login btn
And Go CRMSFA
And Go Leads
And Clk CreateLead
And Set CompanyName as <cmpny>
And Set FirstName as <fname>
And Set LastName as <lname>
And Clk SubmitBtn

Examples:
|username|password|cmpny|fname|lname|
|DemoSalesManager|crmsfa|TCS|Abirami|A|
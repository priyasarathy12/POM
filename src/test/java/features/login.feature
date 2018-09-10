Feature: Leaftaps Automation

Background:
Given Launch the browser
And Maximize the browser
And set timeout
And Load the Url

#Scenario:
#And Enter the username as DemoSal
#And Enter the password as c
#When Click login button
#Then verify that login is successful
#
#Scenario Outline: Login into Leaftaps 
#And Enter the username as <username>
#And Enter the password as <password>
#When Click login button
#Then verify that login is successful
#
#Examples:
#|username|password|
#|DemoSalesManager|crmsfa|
#|DemoCSR|crmsfa|
#
#Scenario:
#And Enter username 
#And Enter password 
#When Click login button
#And Click CRMSFA
#And Click Leads
#And Click CreateLead
#And Give CompanyName as CTS
#And Give FirstName as Haripriya
#And Give LastName as P
#And Click SubmitBtn
#
#@reg
#Scenario Outline: Create Lead
#And Enter the username as <username>
#And Enter the password as <password>
#When Click login button
#And Click CRMSFA
#And Click Leads
#And Click CreateLead
#And Give CompanyName as <cmpny>
#And Give FirstName as <fname>
#And Give LastName as <lname>
#And Click SubmitBtn
#
#Examples:
#|username|password|cmpny|fname|lname|
#|DemoSalesManager|crmsfa|TCS|Abirami|A|

@Smoke
Scenario: Edit Lead
And Enter username 
And Enter password 
When Click login button
And Click CRMSFA
And Click Leads
And Click FindLead
And Enter FirstName
And Click FindLeadsBtn
And Click FirstResultingLead
And Click Edit
And Update the CompanyName
And Click updateSbmtBtn
And Verify the CompanyName



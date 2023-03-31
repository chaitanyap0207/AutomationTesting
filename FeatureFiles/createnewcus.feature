Feature: customer details
Scenario: create new customer details

Given user launch Chrome Browser
When User open URL "https://itera-qa.azurewebsites.net/"
And Click on Login
And User enters username as "chaitanya207" and Password as "Chaitup@207"
And Click on Login
When click on create new
And user enter name as "p.chaitanya theja" 
And company as "Micolinks india private limited"
And address as "ereerrcolony"
And city as "Tirupathi"
And phone number as "5636737111"
And Email as "chaitanyafings@gmail.com"
And click on Create
And click on search text box 
And enter chaitanya in  search box

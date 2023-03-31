Feature: Login
Scenario: Successful Login with Valid Credentials
		Given user launch Chrome Browser
		When User open URL "https://itera-qa.azurewebsites.net/"
		And Click on Login
		And User enters username as "chaitanya207" and Password as "Chaitup@207"
		And Click on Login
		When User Click on Logout
		And click on Home button
		And CloseBrowser

Scenario Outline:Login Data Driven

		Given user launch Chrome Browser
		When User open URL "https://itera-qa.azurewebsites.net/"
		And Click on Login
		And User enters username as "<username>" and Password as "<password>"
		And Click on Login
		When User Click on Logout
		And click on Home button
		And CloseBrowser

Examples:
			| username | password |
			| chaitanya207 | Chaitup@207 |
			| chaitu517 | SivasriP |
			
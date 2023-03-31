package stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Login;

public class Steps {
	public WebDriver driver;
	public Login lp;
	@Given("user launch Chrome Browser")
	public void user_launch_chrome_browser() {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		lp=new Login(driver);
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
	    driver.get(url);
	   
	}

	@When("Click on Login")
	public void click_on_login() {
	    lp.homeloginclick();
	    lp.switchTabs(driver);
	    
	}

	@When("User enters username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) throws InterruptedException {
	    lp.setusername(username);
	    lp.setpassword(password);
	    lp.switchTabs(driver);
	    lp.clickLogin();
	
	}

	/*@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		if(driver.getPageSource().contains("Wrong username or password"))
	    {
			
			driver.close();
	    	Assert.assertTrue(false);
			
	    }
	    else
	    {
	    	
	    	Assert.assertEquals(title, driver.getTitle());
	    }
	    
	}
*/
	@When("User Click on Logout")
	public void user_click_on_logout() throws InterruptedException  {
	
		Thread.sleep(3000);
		lp.clickLogout();
		lp.switchTabs(driver);
		
	}
	
	
	@When("click on Home button")
	public void click_on_home_button() {
		lp.homebuttonclick();
	    
	}
	
	

	@Then("CloseBrowser")
	public void close_browser() {
	    driver.close();
	    
	}
	
	//create new customer page
	

@When("click on create new")
public void click_on_create_new() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enter name as {string}")
public void user_enter_name_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("company as {string}")
public void company_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("address as {string}")
public void address_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("city as {string}")
public void city_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("phone number as {string}")
public void phone_number_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Email as {string}")
public void email_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("click on Create")
public void click_on_create() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("click on search text box")
public void click_on_search_text_box() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("enter chaitanya in  search box")
public void enter_chaitanya_in_search_box() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



}

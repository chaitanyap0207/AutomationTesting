package pageObject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
		
		public WebDriver ldriver;
		
		public Login(WebDriver rdriver)
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver,this);
		}
		
		@FindBy(xpath="//*[@id=\"navbarColor01\"]/form/ul/li[2]/a")
		WebElement Lgn1button;
		
		@FindBy(id="Username")
		WebElement usrbutton;
		
		@FindBy(id="Password")
		WebElement Pwdbutton;
		
		@FindBy(xpath="/html/body/div/div[1]/form/table/tbody/tr[7]/td[2]/input[1]")
		WebElement Lgn2button;
		
		@FindBy(xpath="//*[@id=\"navbarColor01\"]/form/ul/li[2]/a")
		WebElement lgtbutton;
		
		@FindBy(xpath="//a[text()='Home']")
		WebElement homebutton;
		
		public void homeloginclick() 
		{
			Lgn1button.click();
		}
		
		public void setusername(String username)
		{
			usrbutton.clear();
			usrbutton.sendKeys(username);
		}
		
		public void setpassword(String password)
		{
			Pwdbutton.clear();
			Pwdbutton.sendKeys(password);
		}
		public void clickLogin()
		{
			Lgn2button.click();
		}
		
		public void clickLogout() 
		{
			lgtbutton.click();
		}
		
		public void switchbacktoframe(WebDriver driver)
		{
			driver.switchTo().defaultContent();
		}
		public void homebuttonclick()
		{
			homebutton.click();
		}
		public void switchTabs(WebDriver driver)
		{
			Set<String> child = driver.getWindowHandles();
			for(String b:child)
			{
				driver.switchTo().window(b);
			}
		
		}
		
		
		
}

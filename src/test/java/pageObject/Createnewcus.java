package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Createnewcus {
	public WebDriver cdriver;
	
	public Createnewcus(WebDriver rdriver)
	{
		cdriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	

}

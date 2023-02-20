package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utility;

public class OrderSuccessPage extends Utility{

	
	@FindBy(xpath="//button[text()='chkot']")
	WebElement chkot;
	
	@FindBy(xpath="//button[text()='Sign In with Google']")
	WebElement googlesignin;
	
	@FindBy(xpath="/input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="/span[text()='Next']")
	WebElement nextbutton;
	
	
	
	public OrderSuccessPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void orderss() {
		 test = extent.startTest("Plcaing the Order", "Order test case");
		chkot.click();
		javascript(chkot, "Successfully", "chkot");
		
		
	}
}
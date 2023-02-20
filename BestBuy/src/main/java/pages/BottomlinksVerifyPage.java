package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utility;

public class BottomlinksVerifyPage extends Utility {

	@FindBy(xpath = "//a[text()='Check Order Status']")
	WebElement firstbtlink;

	@FindBy(xpath = "//a[text()='Shop with an Expert']")
	WebElement scndbtlink;

	@FindBy(xpath = "//a[text()='Best Buy Totaltech']")
	WebElement thirdbtlink;

	public BottomlinksVerifyPage() {

		PageFactory.initElements(driver, this);

	}

	public boolean frstlink() {
		
		test = extent.startTest("Bottom Link", "Validating Bottom Link");
		javascript(firstbtlink, "Successfully", "FirstLink");
		return firstbtlink.isSelected();
		
		

	}

	public boolean scndlink() {
		javascript(scndbtlink, "Successfully", "SecondLink");
		return scndbtlink.isSelected();
	}

	public boolean thrdlink() {
		javascript(thirdbtlink, "Successfully", "ThirdLink");
		return thirdbtlink.isSelected();
	}

}
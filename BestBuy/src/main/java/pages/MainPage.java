package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utility;

public class MainPage extends Utility {

	@FindBy(xpath = "//span[@class='store-display-name']")
	WebElement location;

	@FindBy(xpath = "//a[@class='c-button c-button-outline c-button-sm find-store-btn']")
	WebElement flocation;

	@FindBy(xpath = "//span[@class='location-zip-code-form-drawer-caret-title']")
	WebElement zcode;

	@FindBy(xpath = "//input[@class='tb-input form-control zip-code-input v-medium']")
	WebElement city;

	@FindBy(xpath = "//button[@data-cy='SubmitButton']")
	WebElement submit;

	@FindBy(xpath = "//a[@href='https://www.bestbuy.com']")
	WebElement mainpg;

	@FindBy(xpath = "//span[@class='v-p-right-xxs line-clamp']")
	WebElement account;

	@FindBy(xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	WebElement signin;

	@FindBy(xpath = "//a[@class='c-button c-button-outline c-button-sm create-account-btn']")
	WebElement createacc;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement fname;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lname;

	@FindBy(xpath = "//input[@type='email']")
	WebElement mail;

	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement pass;

	@FindBy(xpath = "//input[@id='reenterPassword']")
	WebElement confmpass;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement mbl;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement sbutton;

	@FindBy(xpath = "//input[@id='fld-e']")
	WebElement Emailid;

	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submitbt;

	public MainPage() {

		PageFactory.initElements(driver, this);
	}

	public void Basdetails() {
		location.click();
		flocation.click();
		zcode.click();
	}

	public void Areainfo(String Area) {
		city.sendKeys(Area);
		submit.click();
		mainpg.click();
	}

	public void Accountpage() {

		test = extent.startTest("SignUp", "Account Creation");

		account.click();

	}

	public void Signinpass() {

		signin.click();
		javascript(signin, "Passed", "Signin");

	}

	public void Signinfailed() {
		signin.click();
		javascript(account, "Failed", "Account");
	}

	public void Createaccount() {
		createacc.click();
	}

	public void Fname(String Firstname) {
		fname.sendKeys(Firstname);
	}

	public void Lname(String Lastname) {
		lname.sendKeys(Lastname);
	}

	public void Eml(String Email) {
		mail.sendKeys(Email);
	}

	public void Pass(String password) {
		pass.sendKeys(password);
	}

	public void CPassword(String cpassword) {
		confmpass.sendKeys(cpassword);
	}

	public void Number(String number) {
		mbl.sendKeys(number);
	}

	public void Submit() {
		sbutton.click();

		javascript(account, "Passed", "Account");

	}

	public void Login(String Email, String password) {
		Emailid.sendKeys(Email);
		Password.sendKeys(password);
		Submitbt.click();
	}

}
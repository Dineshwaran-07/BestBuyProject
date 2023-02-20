package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utility;



public class SearchItemPage extends Utility {


	@FindBy(xpath = "//span[@class='store-display-name']")
	WebElement location;

	@FindBy(xpath = "//a[@class='c-button c-button-outline c-button-sm find-store-btn']")
	WebElement finalLocation;

	@FindBy(xpath = "//span[@class='locationation-zip-code-form-drawer-caret-title']")
	WebElement zipcode;

	@FindBy(xpath = "//input[@class='tb-input form-control zip-code-input v-medium']")
	WebElement city;

	@FindBy(xpath = "//button[@data-cy='SubmitButton']")
	WebElement sit;
	
	@FindBy(xpath = "//a[@href='https://www.bestbuy.com']")
	WebElement mpag;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement sea;

	@FindBy(xpath = "//span[@class='header-search-icon']")
	WebElement ssea;
	
	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART'][1]")
	WebElement addtocart;
	
	@FindBy(xpath="//div[@class='go-to-cart-button']")
	WebElement gotocartbtn;

	public SearchItemPage() {
		
		PageFactory.initElements(driver, this);
	}
	

	public void locationtails() {
		 test = extent.startTest("Adding Item", "Moving to Cart");	
		location.click();
		finalLocation.click();
		zipcode.click();
		javascript(location, "Passed", "locationation");

	}

	public void Areadata(String Area) {
		city.sendKeys(Area);
		sit.click();
		mpag.click();
		javascript(city, "Passed", "Area");

	}

	public void Search(String Search) {
		sea.sendKeys(Search);
		ssea.click();
		javascript(ssea, "Passed", "Search");
		
	}
	
	public void addtocart() {
		addtocart.click();
		gotocartbtn.click();
		javascript(addtocart, "Passed", "Added to the Cart");
		
	}

	
}

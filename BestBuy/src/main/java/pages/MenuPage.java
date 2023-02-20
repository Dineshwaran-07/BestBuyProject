package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utility;

public class MenuPage extends Utility {

	@FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement menubutton;

	@FindBy(xpath = "//button[@class='c-button-unstyled top-four v-fw-medium']")
	WebElement deals;

	@FindBy(linkText = "Top Deals")
	WebElement topdeals;

	@FindBy(xpath = "//button[@class='c-button-unstyled top-four v-fw-medium']//following::button[1]")
	WebElement Support;

	@FindBy(xpath = "//a[@href='/support'][1]")
	WebElement SupportCenter;

	@FindBy(xpath = "//button[@class='c-button-unstyled top-four v-fw-medium']//following::button[2]")
	WebElement Brands;

	@FindBy(xpath = "//a[@href='/site/brands/best-buy-brands/pcmcat1596746025285.c?id=pcmcat1596746025285']")
	WebElement bestbuy;

	@FindBy(xpath = "//button[@class='c-button-unstyled top-four v-fw-medium']//following::button[3]")
	WebElement Featured;

	@FindBy(xpath = "//a[@href='/site/more-of-this/celebrating-black-culture/pcmcat1576083313564.c?id=pcmcat1576083313564']")
	WebElement giftideas;

	@FindBy(tagName = "title")
	WebElement exptitle;

	public MenuPage() {
		PageFactory.initElements(driver, this);
	}

	public void deals() {

		test = extent.startTest("Deals Menu", "Validating titles");
		((JavascriptExecutor) driver).executeScript("return arguments[0].click();", menubutton);
		deals.click();
		topdeals.click();
		javascript(deals, "Successfully", "Deals");

	}

	public void suppots() {

		test = extent.startTest("Support and Services Menu", "Validating titles");
		((JavascriptExecutor) driver).executeScript("return arguments[0].click();", menubutton);
		Support.click();
		SupportCenter.click();
		javascript(Support, "Successfully", "Support");
	}

	public void brandss() {
		test = extent.startTest("Brands Menu", "Validating titles");
		((JavascriptExecutor) driver).executeScript("return arguments[0].click();", menubutton);
		Brands.click();
		bestbuy.click();
		javascript(Brands, "Successfully", "Brand");

	}

	public void Features() {
		test = extent.startTest("Featured Menu", "Validating titles");
		((JavascriptExecutor) driver).executeScript("return arguments[0].click();", menubutton);
		Featured.click();
		giftideas.click();
		javascript(Featured, "Successfully", "Feature");

	}

}
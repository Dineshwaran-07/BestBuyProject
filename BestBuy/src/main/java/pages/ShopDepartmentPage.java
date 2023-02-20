package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utility;



public class ShopDepartmentPage extends Utility {
	
	@FindBy(xpath="//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement menubutto;
	
	@FindBy(xpath="//button[text()='Appliances']")
	WebElement appliances;
	
	@FindBy(xpath="//button[text()='Luxury Kitchen Appliances']")
	WebElement luxury;
	
	@FindBy(xpath="//a[text()='Luxury Refrigerators']")
	WebElement fridge;
	
	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART'][1]")
	WebElement addtocart;
	
	@FindBy(xpath="//div[@class='go-to-cart-button']")
	WebElement gotocrt;
	
public ShopDepartmentPage() {
		
		PageFactory.initElements(driver, this);
	}



public void first() {
	 test = extent.startTest("Menu a Shop by Department", "Department test case");
	menubutto.click();
	javascript(menubutto, "Passed", "Menu");
}

public void second() {
	
	((JavascriptExecutor) driver).executeScript("return arguments[0].click();", appliances);
	javascript(appliances, "Passed", "Appliance");
}

public void third() throws Exception {
	
	luxury.click();
	javascript(luxury, "Passed", "Luxury Kitchen Appliances");
	Thread.sleep(5000);
}

public void fourth() throws Exception {
	
	fridge.click();
	javascript(fridge, "Passed", "Luxury Refridgerators");
	Thread.sleep(3000);
}

public void fifth() throws Exception {
	
	addtocart.click();
	javascript(addtocart, "Passed", "Add to Cart");
	Thread.sleep(3000);
}

public void sixth() {
	
	gotocrt.click();
	javascript(gotocrt, "Passed", "Go to Cart");
}

public void fails() {
	test = extent.startTest("Menu a Shop by Department", "Department test case");
	Actionmethod(menubutto);
	javascript(menubutto, "Passed", "Menu");
}

}
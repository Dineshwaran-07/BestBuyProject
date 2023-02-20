package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utility;


public class ShopBrandsPage extends Utility {
	
	@FindBy(xpath="//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement menubuton;
	
	@FindBy(xpath="//button[text()='Brands']")
	WebElement brands;
	
	@FindBy(xpath="//a[text()='Samsung']")
	WebElement samphn;
	
	@FindBy(xpath="//a[text()='Smartphones & Watches']")
	WebElement smphnndwtch;
	
	@FindBy(xpath="//a[text()='Mobile Phones']")
	WebElement smphn;
	
	@FindBy(xpath="//a[text()='Learn about Galaxy S23']")
	WebElement lrnmre;
	
	@FindBy(xpath="//a[text()='Shop Now'][1]")
	WebElement shpnw;
	
	@FindBy(xpath="//button[text()='Add to Cart'][1]")
	WebElement addtocrt;
	
	
public ShopBrandsPage() {
		
		PageFactory.initElements(driver, this);
	}



public void shopbrd() {
	 test = extent.startTest("Menu a Shop by Brands", "Brands test case");
	menubuton.click();
	javascript(menubuton, "Passed", "Menu");
}

public void shopbrd0() {
	
	((JavascriptExecutor) driver).executeScript("return arguments[0].click();", brands);
	javascript(brands, "Passed", "Brands");
}

public void shbrd1() throws Exception {
	
	samphn.click();
	javascript(samphn, "Passed", "Samsung");
	Thread.sleep(5000);
}

public void shopbrd2() throws Exception {
	
	smphnndwtch.click();
	javascript(smphnndwtch, "Passed", "SmartPhone and Watches");
	Thread.sleep(3000);
}

public void shopdpt3() throws Exception {
	
	smphn.click();
	javascript(smphn, "Passed", "Mobile Phones");
	Thread.sleep(3000);
	lrnmre.click();
	shpnw.click();
	javascript(shpnw, "Passed", "Shop Now");
	Thread.sleep(5000);
}

public void shopdpt4() throws InterruptedException {
	
	JavascriptExecutor	js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollTo(0,0.800000011920929)");
	
	addtocrt.click();
}



}
package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.SearchItemPage;

public class SearchItemTest extends BaseClass {
     
	@Test
	public void SelectItem() {
		
		SearchItemPage item = new SearchItemPage();
		
		item.locationtails();
		item.Search("sony headphones");
		item.addtocart();
		
		test.log(LogStatus.PASS, "Item added to Cart");
	}
	
	@Test
	public void SelectItemfailed() {

		SearchItemPage item = new SearchItemPage();
		
		item.locationtails();
		item.Search(" ");
		item.addtocart();
		
		test.log(LogStatus.FAIL, "Item couldn't be seen");
	}
}

package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.ShopBrandsPage;


public class ShopBrandsTest extends BaseClass{
	
	
	@Test(priority = 1)
	public void shpdptpass() throws Exception {
		
		ShopBrandsPage mn = new ShopBrandsPage();
		
	     mn.shopbrd();
	     mn.shopbrd0();
	     mn.shbrd1();
	     mn.shopbrd2();
	     mn.shopdpt3();
	   
	     
	     test.log(LogStatus.PASS, "Success");
	}
	
	@Test
	public void shpbfail() throws Exception {
		
		ShopBrandsPage mm = new ShopBrandsPage();
		
	     mm.shopbrd();
	     mm.shopbrd0();
	     mm.shbrd1();
	     mm.shopbrd2();
	     mm.shopdpt3();
	     mm.shopdpt4();
	     
	     test.log(LogStatus.FAIL, "Failed");
	}

}
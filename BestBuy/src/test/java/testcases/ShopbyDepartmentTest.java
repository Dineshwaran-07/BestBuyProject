package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.ShopDepartmentPage;

public class ShopbyDepartmentTest extends BaseClass{

	
	@Test(priority = 1)
	public void shpdptpass() throws Exception {
		
		ShopDepartmentPage md = new ShopDepartmentPage();
		md.first();
		md.second();
		md.third();
		md.fourth();
		md.fifth();
		md.sixth();
	     
	     
	     test.log(LogStatus.PASS, "Success");
	}
	
	@Test
	public void shpdfail() throws Exception {
		
		ShopDepartmentPage dm = new ShopDepartmentPage();
		
	    dm.fails();
	    dm.first();
	    dm.second();
	    dm.third();
	    dm.fourth();
	    dm.fifth();
	    dm.sixth();
	     
	     test.log(LogStatus.FAIL, "Failed");
	}
	
}
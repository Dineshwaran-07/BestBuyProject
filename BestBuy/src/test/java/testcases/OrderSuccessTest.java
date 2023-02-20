package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.MainPage;
import pages.OrderSuccessPage;
import pages.SearchItemPage;

public class OrderSuccessTest extends BaseClass{

	@Test
	public void orderplaced() {
	
	SearchItemPage kl = new SearchItemPage();
	kl.locationtails();
	kl.Search("Pencil");
	kl.addtocart();
	
	OrderSuccessPage op = new OrderSuccessPage();
	op.orderss();
	
	MainPage ha = new MainPage();
	ha.Login("dineshelan77@gmail.com", "Dinu$0706");
	
	test.log(LogStatus.PASS, "Order Placed Successfully");
	
	}
	
	@Test
	public void orderfails() {
		
		SearchItemPage ll = new SearchItemPage();
		ll.locationtails();
		ll.Search("Pencil");
		ll.addtocart();
		
		OrderSuccessPage op = new OrderSuccessPage();
		op.orderss();
		
		MainPage ha = new MainPage();
		ha.Login("dineshelan77@gmail.com", "Dinu$0706");
		titlevalidationpass();
		Actionmethod(null);
		
		
		test.log(LogStatus.FAIL, "Order Rejected");
		
		}
	
	
}
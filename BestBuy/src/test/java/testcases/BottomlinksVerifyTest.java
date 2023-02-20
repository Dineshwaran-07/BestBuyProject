package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.BottomlinksVerifyPage;

public class BottomlinksVerifyTest extends BaseClass {

	@Test
	public void Bottomlink1() {

		BottomlinksVerifyPage bp = new BottomlinksVerifyPage();

		if (bp.frstlink()) {
			System.out.println("Link is valid link");
		}

		else
			System.out.println("It is invalid link");
		
		test.log(LogStatus.PASS, "Link Passed Successfully");

	}

	@Test
	public void Bottomlink2() {
		BottomlinksVerifyPage blp = new BottomlinksVerifyPage();

		if (blp.scndlink()) {
			System.out.println("Link is valid link");
		}

		else
			System.out.println("It is invalid link");
		
		test.log(LogStatus.PASS, "Link Passed Successfully");

		
	}

	@Test
	public void Bottomlink3() {
		BottomlinksVerifyPage blp = new BottomlinksVerifyPage();

		if (blp.thrdlink()) {
			System.out.println("Link is valid link");
		}

		else
			System.out.println("It is invalid link");
		
		test.log(LogStatus.PASS, "Link Passed Successfully");

	}

}

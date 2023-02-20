

package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.MainPage;

public class SignTest extends BaseClass {

	@Test
	public void createaccount() {

		MainPage mp = new MainPage();

		mp.Basdetails();
		mp.Areainfo("Aiea");
		mp.Accountpage();
		mp.Createaccount();
		mp.Fname("Dineshwaran");
		mp.Lname("Elancmpmliyan");
		mp.Eml("dinesh@gmail.com");
		mp.Pass("Dinu$1212");
		mp.CPassword("Dinu$1212");
		mp.Number("6382030761");
		mp.Submit();
		test.log(LogStatus.PASS, "Account Created Successfully");

	}

	@Test
	public void signin() {
		MainPage mpm = new MainPage();
		mpm.Basdetails();
		mpm.Accountpage();
		mpm.Signinpass();
		mpm.Login("suchantha04@gmail.com", "Dinu$0706");
		test.log(LogStatus.PASS, "Account Created Successfully");

	}

	@Test
	public void InvalidAccount() {
		MainPage mpm = new MainPage();
		mpm.Accountpage();
		mpm.Signinfailed();
		mpm.Login("dineshelan@gmail", null);
		test.log(LogStatus.FAIL, "Account Creation Failed");
	}
}

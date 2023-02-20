package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.MenuPage;

public class MenuTest extends BaseClass {

	@Test
	public void menutest() {

		MenuPage mp = new MenuPage();
		mp.deals();
		titlevalidationpass();
		test.log(LogStatus.PASS, " is valid title");

	}

	@Test
	public void suppots() {

		MenuPage mp = new MenuPage();
		mp.suppots();
		titlevalidationpass();
		test.log(LogStatus.PASS, " is valid title");

	}

	@Test
	public void brandtest() {
		MenuPage mp = new MenuPage();
		mp.brandss();
		titlevalidationpass();
		test.log(LogStatus.PASS, " is valid title");

	}

	@Test
	public void features() {
		MenuPage mp = new MenuPage();
		mp.Features();
		titlevalidationfails();
		test.log(LogStatus.FAIL, " is not a valid title");
	}

}

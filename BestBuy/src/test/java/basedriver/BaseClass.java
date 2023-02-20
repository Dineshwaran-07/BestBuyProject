package basedriver;

import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.LogStatus;

import utils.selenium.Utility;

public class BaseClass extends Utility {

	

	@BeforeMethod
	public void startup() throws Exception {

		getproperties();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

	}
	
	
	@BeforeSuite
	public void TestInitializer() {
		reportStarter();
		
	}

	@AfterMethod()
	public void testCloserIT(ITestResult result) throws Exception {

		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
			test.addScreenCapture(addScreenShot(driver,"screenShotPath"));
			System.out.println("Completed");
		}

		 driver.close();

	}

	@AfterSuite
	public void FinalTest() {
		extentReportFinisher();
	}

}

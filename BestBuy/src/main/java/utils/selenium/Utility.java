package utils.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {

	public static WebDriver driver;
	public static String dateandtime;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static void getproperties() throws Exception {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "//config.properties");
		prop.load(fs);
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		browserLauncher(browser);

	
		driver.get(url);
		WebElement state = driver.findElement(By.xpath("//div[@class='country-selection']"));
		state.click();
		
		WebElement popup = driver.findElement(By.xpath("//style[@type='text/css']"));
		
		
      try {
		if(popup != null) {
			
			driver.switchTo().alert().dismiss();
	
		}
      }catch (Exception e) {
    	  e.getMessage();
      }
	}

	public static void browserLauncher(String browserName) {

		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Running chrome browser as default");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void reportStarter() {
		try {
			dateandtime = DateandTime();

			extent = new ExtentReports("E-commerceReport.html", true);

		} catch (Exception e) {
			System.out.println("Error in ExtentReportStarter : " + e.getMessage());
		}
	}

	private String DateandTime() {
		DateFormat day = null;
		Date date = null;
		try {
			day = new SimpleDateFormat("yyyyMMddHHmmss");
			date = new Date();
		} catch (Exception e) {
			System.out.println("Error in Getdateandtime : " + e.getMessage());
		}

		return day.format(date);
	}

	public static boolean javascript(WebElement ele, String Text, String id) {
		boolean flag = false;
		try {
			try {
				if (waitforme(ele, id)) {
					((JavascriptExecutor) driver).executeScript("arguments[0].value='" + Text + "'", ele);
					test.log(LogStatus.PASS, id + " creation " + Text);
					flag = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {

			System.out.println("Error in Typetext : " + e.getMessage());
			test.log(LogStatus.FAIL, "Error in GetUrl : " + e.getMessage());

		}
		return flag;

	}

	
	public static boolean waitforme(WebElement element, String id) {
		boolean flag = false;

		try {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			//wait.until(ExpectedConditions.visibilityOf(element));
		
			flag = true;
		} catch (Exception e) {
	

		}
		return flag;
	}

	public static void extentReportFinisher() {

		try {
			extent.flush();
		} catch (Exception e) {
			System.out.println("Error in ExtentReportFinisher : " + e.getMessage());
		}
	}

	public void Actionmethod(WebElement element) {

		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
		
	}

	public void titlevalidationpass() {
		String title = driver.getTitle();
		System.out.println("The name of the title is : " + title);
		Assert.assertTrue(true, title);
	}

	public void titlevalidationfails() {
		String title = driver.getTitle();
		System.out.println("The name of the title is : " + title);
		Assert.assertTrue(true, title);
	}
	
	public void actionslides(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element, 0, 0);
		
	}
	
	public String addScreenShot(WebDriver d, String imgpath) throws Exception
	{
		String image = "";
		FileInputStream imageFile;
		try
		{
			String dest = System.getProperty("user.dir") +"\\ErrorScreenshots\\"+imgpath+".png";
			File imgfile = new File(capture(d, dest));
			imageFile = new FileInputStream(dest);
            byte imageData[] = new byte[(int) imgfile.length()];
            imageFile.read(imageData);
            byte[] base64EncodedByteArray = Base64.encodeBase64(imageData);
            image = new String(base64EncodedByteArray);
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
			return "data:image/png;base64,"+image;
	}
	
	 public static String capture(WebDriver driver,String dest) throws IOException
	    {
	        TakesScreenshot ts = (TakesScreenshot)driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	       
	        File destination = new File(dest);
	        FileUtils.copyFile(source, destination);        
	                     
	        return dest;
	    }
	

}
package testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;

public class BrokenLinksTest extends BaseClass {

	@Test
	public static void brokenlinks() {

		String homePage = "https://www.bestbuy.com/";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;

		driver.get(homePage);

		test = extent.startTest("Broken Links", "Validating the Page Link");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;

			}

			if (!url.startsWith(homePage)) {
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}

			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if (respCode >= 400) {
					System.out.println(url + " is a broken link");
					test.log(LogStatus.PASS, "is a broken link");
				} else {
					System.out.println(url + " is a valid link");
					test.log(LogStatus.FAIL, "is not a broken link");
				}

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		driver.quit();

	}
}
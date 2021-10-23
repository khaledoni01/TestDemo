package testingDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

public class AppTest extends TestBase {

	
	@DataProvider(name="testData")
	public Object[][] testData() throws IOException {
		
		return ExcelUtil.readExcel();
	}
	
	@Test(priority = 0, dataProvider = "testData", groups= {"sanity"})
	public void testBrowserLaunch(String bName, String bVersion) {
		
		System.out.println("Browser launched Test");
		System.out.println(bName + " " + bVersion);
		
		Assert.assertTrue(false, "Browser name isn't verified");
	}
	
//	@Test(priority = 1, groups= {"sanity"})
	public void provideLoginDetails() {
		System.out.println("Login Details Test");
	}
		
}

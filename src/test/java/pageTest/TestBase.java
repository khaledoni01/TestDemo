package pageTest;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import pageActions.ForgotPassPageActions;
import pageActions.LoginPageActions;
import pageLocators.ForgotPassPageLocators;

public class TestBase {
	
	public static WebDriver driver = null;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static LoginPageActions loginPageActions = null;
	public static ForgotPassPageActions forgotPassPageActions = null;

	public static ForgotPassPageActions forgotPassPageActionsObject() {
		return new ForgotPassPageActions();
	}
	public static LoginPageActions loginPageActionsObject() {
		return new LoginPageActions();
	}
		
	@BeforeSuite(alwaysRun = true)
	@Parameters({"baseUrl", "browserName"})
	public void beforeSuite(String baseUrl, String browserName) {
		TestBase.setupExtentReport();
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver_94.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/firefox_89.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(baseUrl);
//		driver.manage().window().maximize();
		TestBase.loginPageActions = TestBase.loginPageActionsObject();
	}
	
	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		TestBase.tearDownReport();
//		driver.quit();
	}
	
	public static void setupExtentReport() {
		extent = new ExtentReports(
				System.getProperty("user.dir") + "/extentReport/Automation_Report.html", true);

		extent.addSystemInfo("Host Name", "Test Project")
				.addSystemInfo("Environment", "QA Automation Testing")
				.addSystemInfo("User Name", "Khaled");
		extent.loadConfig(new File(System.getProperty("user.dir") + "/src/test/resources/extent-config.xml"));
	}
	public static void tearDownReport() {
		extent.flush();
		extent.close();
	}
	
	public static WebDriver getDriver() {
		return TestBase.driver;
	}
}

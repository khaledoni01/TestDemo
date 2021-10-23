package testingDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestBase {

	public static WebDriver driver = null;
	
	@BeforeSuite(alwaysRun=true)
	@Parameters({"browser", "baseUrl"})
	public void bSuite(String browser, String baseUrl) {

//		System.out.println("Before Suite");
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_94.exe");
			driver = new ChromeDriver();		
			driver.get(baseUrl);
		}
		else if(browser.equalsIgnoreCase("IE")) {
			System.out.println("IE browser");
		}

		
	}
	
	@AfterSuite()
	public void afterSuite() {
		System.out.println("After suite");
	}
}

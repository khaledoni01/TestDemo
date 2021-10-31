package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import pageTest.TestBase;

public class CommonActions {
	
	public static final int WAIT_TIME = 20;
	
	public static void waitUntilVisible(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(TestBase.getDriver(), WAIT_TIME);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void sendKeys(WebElement ele, String val) {
		ele.clear();
		ele.sendKeys(val);
	}
	
	public static void click(WebElement ele) {
		ele.click();
	}

	public static String getText(WebElement ele) {
		return ele.getText().trim();
	}
	
	public static void report(String msg) {
		Log.info(msg);
		TestBase.test.log(LogStatus.INFO, msg);
	}
}

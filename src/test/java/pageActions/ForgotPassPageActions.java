package pageActions;

import org.openqa.selenium.support.PageFactory;

import pageLocators.ForgotPassPageLocators;
import pageTest.TestBase;
import utility.CommonActions;

public class ForgotPassPageActions {
	
	ForgotPassPageLocators forgotPassPageLocators = null;
	
	public ForgotPassPageActions() {
		forgotPassPageLocators = new ForgotPassPageLocators();
		PageFactory.initElements(TestBase.getDriver(), forgotPassPageLocators);
	}

	public void provideEmailAddr(String emailAddr) {
		CommonActions.waitUntilVisible(forgotPassPageLocators.emailAddr);

		CommonActions.sendKeys(forgotPassPageLocators.emailAddr, emailAddr);
		CommonActions.report("Email is provided");
	}
	
}

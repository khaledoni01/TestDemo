package pageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageLocators.LoginPageLocators;
import pageTest.TestBase;
import utility.CommonActions;
import utility.Log;

public class LoginPageActions {

	LoginPageLocators indexPageLocators = null;
	
	public LoginPageActions() {
		indexPageLocators = new LoginPageLocators();
		PageFactory.initElements(TestBase.getDriver(), indexPageLocators);
	}
	
	public void login(String username, String password) {
		
//		indexPageLocators.username.clear();
//		indexPageLocators.username.sendKeys(username);

		CommonActions.sendKeys(indexPageLocators.username, username);
		CommonActions.report("Username is provided");
		
		CommonActions.sendKeys(indexPageLocators.password, password);
		CommonActions.report("Password is provided");
			
	}
	
}

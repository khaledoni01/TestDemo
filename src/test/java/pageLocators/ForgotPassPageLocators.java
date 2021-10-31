package pageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import pageTest.TestBase;

public class ForgotPassPageLocators {

	@FindBy(xpath="//input[@id='swpm_reset_email']")
	public WebElement emailAddr;

	
}

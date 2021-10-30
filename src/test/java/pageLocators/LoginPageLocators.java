package pageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import pageTest.TestBase;

public class LoginPageLocators {

	@FindBy(xpath="//input[@id='swpm_user_name']")
	public WebElement username;

	@FindBy(xpath="//input[@id='swpm_password']")
	public WebElement password;
	
//	public WebElement userName = TestBase.getDriver().findElement(By.xpath(""))
	
}

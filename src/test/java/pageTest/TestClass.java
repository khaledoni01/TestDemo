package pageTest;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelUtil;

public class TestClass extends TestBase {

	
	@DataProvider(name = "testdata")
	public static Object[][] testdata() {
		String inputSheet = "Sheet1";
		return ExcelUtil.getExcelData(System.getProperty("user.dir") + "/data/testing.xlsx", inputSheet);
	}
	
	@Test(priority=0, groups="sanity", dataProvider="testdata")
	public void indexPageTest(String username, String password, String emailAddr) {
		
		loginPageActions.login(username, password);
		
		forgotPassPageActions.provideEmailAddr(emailAddr);
	}
	

	
}

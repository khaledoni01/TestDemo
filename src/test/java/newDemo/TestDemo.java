package newDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestDemo {
	
	int a;

	@Test()
	public void twoDimensionalArray() {
		
		int[][] arr = { {10, 20, 30}, {40, 50, 60} };
		
		
		System.out.println( arr[1][1] );
		
		System.out.println(a);
	}
		
}

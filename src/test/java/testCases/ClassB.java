package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassB {

	@Test
	public void userLogin()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.demoaut.com");
		System.out.println("Executed userlogin");
		
	}
}

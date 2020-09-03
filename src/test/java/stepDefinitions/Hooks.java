package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import managers.WebDriverManager;

public class Hooks {
	public WebDriver driver;
	public WebDriverManager webDriverManagerObj;
	public Hooks()
	{
		webDriverManagerObj = new WebDriverManager();
		driver = webDriverManagerObj.getDriver();
	}
	@Before
	public void BeforeTest()
	{
		System.out.println("This is before Hook");
		driver.get("https://www.google.com");
	}

	@After
	public void AfterTest()
	{
		System.out.println("This is After hook");
		driver.close();
		driver.quit();
	}
}

package ovh.kania.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest{
	protected WebDriver driver;

	@BeforeEach
	public void startBrowser(){
		driver = new FirefoxDriver();
	}

	@AfterEach
	public void tearDown(){
		if (driver != null) {
			driver.quit(); 
		}

	}
}

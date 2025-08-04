package ovh.kania.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import ovh.kania.utils.BaseTest;

public class HomePageTests extends BaseTest{
	
	
	@BeforeEach
	public void startBrowser(){
		driver = new FirefoxDriver();

	}

	@Test
	public void testPage(){
		driver.navigate().to("https://google.com");
		Assertions.assertEquals("Google", driver.getTitle());
		
	}
}

package ovh.kania.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ovh.kania.pages.InventoryPage;
import ovh.kania.pages.LoginPage;

public class LoginTests {
	
	WebDriver driver;
	LoginPage loginPage;
	InventoryPage inventoryPage;
		
	@BeforeEach
	public void startBrowser(){
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		loginPage = new LoginPage(driver);
		inventoryPage = new InventoryPage(driver);
	}

	@AfterEach
	public void closeBrowser(){
		if (driver != null) {
			driver.quit();
		}
	}

	@Test
	public void userCanLoginSuccessfully(){
		loginPage.loginAs("standard_user", "secret_sauce");
		Assertions.assertEquals(inventoryPage.inventoryURL(), inventoryPage.getPageURL());
	}

	@Test
	public void userCanLoginSuccessfullyyyyy(){
		loginPage.loginAs("locked_out_user", "secret_sauce");
		Assertions.assertEquals(loginPage.getLockedOutUserText(), loginPage.errorMessage());
	}

	
}

package ovh.kania.tests;


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
	public void shouldStandardUserSuccessLogin(){
		loginPage.loginAs("standard_user", "secret_sauce");
		Assertions.assertEquals(inventoryPage.inventoryURL(), inventoryPage.getPageURL());
	}

	@Test
	public void shouldLockedUserSeeErrorMessageOnLoginForm(){
		loginPage.loginAs("locked_out_user", "secret_sauce");
		Assertions.assertEquals(loginPage.getLockedOutUserErrorMessage(), loginPage.errorMessage());
	}

	@Test
	public void shouldEmptyUsernameShowErrorMessageOnLoginForm(){
		loginPage.loginAs("", "secret_sauce");
		Assertions.assertEquals(loginPage.getEmptyUsernameErrorMessage(), loginPage.errorMessage());

	}

	@Test
	public void shouldEmptyPasswordShowErrorMessageOnLoginForm(){
		loginPage.loginAs("standard_user", "");
		Assertions.assertEquals(loginPage.getEmptyPasswordErrorMessage(), loginPage.errorMessage());
	}

	@Test
	public void shouldWrongUsernameWrongPasswordShowErrorMessageOnLoginForm(){
		loginPage.loginAs("worng_username", "wrong_password");
		Assertions.assertEquals(loginPage.getWrongUsernameWrongPasswordErrorMessage(), loginPage.errorMessage());
	}
}

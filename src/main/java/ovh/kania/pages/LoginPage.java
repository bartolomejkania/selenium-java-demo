package ovh.kania.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
	
	//Driver
	private WebDriver driver;
	
	//Page locators
	private String URL = "https://saucedemo.com";
	private By usernameLocator = By.id("user-name");
	private By passwordLocator = By.id("password");
	private By loginButton = By.id("login-button");
	private By errorMessage = By.cssSelector("[data-test='error']");

	//Page texts
	String lockedUserErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
	
	//Constructor
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	

	//Methods
	public LoginPage nagiateToLoginPage(){
		driver.get(URL);
		return this;
	}

	public LoginPage enterUsername(String username){
		driver.findElement(usernameLocator).sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String password){
		driver.findElement(passwordLocator).sendKeys(password);
		return this;
	}

	public InventoryPage clickLogin(){
		driver.findElement(loginButton).click();
		return new InventoryPage(driver);
	}

	public InventoryPage loginAs(String username, String password){
		return enterUsername(username).enterPassword(password).clickLogin();
	}

	public LoginPage errorMessage(){
		driver.findElement(errorMessage).getText();
		return this;
	}

	public String returnLockedOutUserText(){
		return lockedUserErrorMessage;
	}
}

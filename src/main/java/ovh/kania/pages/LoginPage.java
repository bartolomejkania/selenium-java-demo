package ovh.kania.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

	final String URL = "https://saucedemo.com";
	final By usernameLocator = By.id("user-name");
	final By passwordLovator = By.id("password");
	final By loginButton = By.id("login-button");


	private WebDriver driver;

	public LoginPage(WebDriver driver){
		this.driver = driver;
	}

	public void nagiateToLoginPage(){
		driver.get(URL);
	}
	
	public void loginValidUser(String username, String password){
		
	}

}

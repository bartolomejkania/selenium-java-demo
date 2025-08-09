package ovh.kania.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class HeaderComponent {

	//Webdriver
	private WebDriver driver;

	//Page locators
	private By appLogo = By.className("app_logo");
	private By hamburgerMenu = By.id("react-burger-menu-btn");
	private By cartIcon = By.cssSelector("[data-test='shopping-cart-link']");
	private By hamburgerItemInventory = By.id("inventory_sidebar_link");
	private By hamburgerItemAbout = By.id("about_sidebar_link");
	private By hamburgerItemLogout = By.id("logout_sidebar_link");
	private By hamburgerItemResetAppState = By.id("reset_sidebar_link");

	//Constructor
	public HeaderComponent(WebDriver driver){
		this.driver = driver;
	}

	//Methods	
}

package ovh.kania.pages;

import org.openqa.selenium.WebDriver;

public class InventoryPage {
	
	String URL = "https://www.saucedemo.com/inventory.html";

	//Driver
	private WebDriver driver;

	//Constructor
	public InventoryPage(WebDriver driver){
		this.driver = driver;
	}

	//Methods
	public String getPageURL(){
		return driver.getCurrentUrl();
	}

	public String inventoryURL(){
		return URL;
	}

}

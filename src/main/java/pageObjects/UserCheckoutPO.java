package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.UserProductDetailPageUI;

public class UserCheckoutPO extends AbstractPage{

	WebDriver driver;

	public UserCheckoutPO(WebDriver driver) {
		super();
		this.driver = driver;
	}


}

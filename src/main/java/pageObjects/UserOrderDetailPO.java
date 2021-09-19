package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.AbstractPageUI;
import pageUIs.UserOrderDetailPageUI;
import pageUIs.UserOrdersPageUI;

public class UserOrderDetailPO extends AbstractPage{

	WebDriver driver;

	public UserOrderDetailPO(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public UserShoppingCartPO clickToDetailButton() {
		waitToElementClickable(driver, UserOrderDetailPageUI.REORDER_BUTTON);
		clickToElement(driver, UserOrderDetailPageUI.REORDER_BUTTON);
		return PageGeneratorManager.getUserShoppingCartPO(driver);
	}
}

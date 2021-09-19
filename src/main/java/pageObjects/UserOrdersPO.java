package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.AbstractPageUI;
import pageUIs.UserProductDetailPageUI;
import pageUIs.UserOrdersPageUI;

public class UserOrdersPO extends AbstractPage{

	WebDriver driver;
	
	public UserOrdersPO(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public UserAddressesPO openAddressesPage() {
		waitToElementClickable(driver, AbstractPageUI.ADDRESSES_LINK);
		clickToElement(driver, AbstractPageUI.ADDRESSES_LINK);
		return PageGeneratorManager.getUserAddressesPage(driver);
	}

    public UserOrderDetailPO clickToDetailButton() {
		waitToElementClickable(driver, UserOrdersPageUI.DETAIL_BUTTON);
		clickToElement(driver, UserOrdersPageUI.DETAIL_BUTTON);
		return PageGeneratorManager.getUserOrderDetailPO(driver);
    }
}

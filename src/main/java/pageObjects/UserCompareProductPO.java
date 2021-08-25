package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.UserCompareProductPageUI;
import pageUIs.UserCustomerInforPageUI;
import pageUIs.UserProductDetailPageUI;
import pageUIs.UserWishlistPageUI;

public class UserCompareProductPO extends AbstractPage{

	WebDriver driver;
	
	public UserCompareProductPO(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public boolean compareProductDisplayByProductName(String name) {
		
		waitToElementVisible(driver, UserCompareProductPageUI.DYNAMIC_PRODUCT_NAME_BY_TEXT,name);
		return isElementDisplayed(driver, UserCompareProductPageUI.DYNAMIC_PRODUCT_NAME_BY_TEXT,name);
	}

	public void hoverMouseToComputerHeader() {
		waitToElementVisible(driver, UserCompareProductPageUI.COMPUTER_HEADER_MENU);
		hoverMouseToElement(driver, UserCompareProductPageUI.COMPUTER_HEADER_MENU);
		
	}

	public UserComputerPO clickToNotebooksSubmenu() {
		waitToElementClickable(driver, UserCompareProductPageUI.NOTEBOOK_SUB_MENU);
		clickToElement(driver, UserCompareProductPageUI.NOTEBOOK_SUB_MENU);
		return PageGeneratorManager.getUserComputerPage(driver);
	}

	public void clickToClearListButton() {
		waitToElementClickable(driver, UserCompareProductPageUI.CLEAR_LIST_BUTTON);
		clickToElement(driver, UserCompareProductPageUI.CLEAR_LIST_BUTTON);
	}

	public boolean isNoDataMessageDisplay() {
		waitToElementVisible(driver, UserCompareProductPageUI.NO_DATA_MESSAGE);
		return isElementDisplayed(driver, UserCompareProductPageUI.NO_DATA_MESSAGE);
	}
}

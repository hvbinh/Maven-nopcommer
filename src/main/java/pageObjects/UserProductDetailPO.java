package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.UserCustomerInforPageUI;
import pageUIs.UserProductDetailPageUI;

public class UserProductDetailPO extends AbstractPage{

	WebDriver driver;
	public static String productName, SKU,quantity, price;
	
	public UserProductDetailPO(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public String getNotificationSuccessMessage() {
		waitToElementVisible(driver, UserProductDetailPageUI.NOTIFICATION_SUCCESS);
		return getElementText(driver, UserProductDetailPageUI.NOTIFICATION_SUCCESS);
	}

	public UserWishlistPO clickToWishlistHeaderLink(String headerLinkClassName) {
		waitToElementClickable(driver, UserProductDetailPageUI.DYNAMIC_HEADER_LINK_BY_CLASS, headerLinkClassName);
		clickToElement(driver, UserProductDetailPageUI.DYNAMIC_HEADER_LINK_BY_CLASS, headerLinkClassName);
		return PageGeneratorManager.getUserWishlistPO(driver);
	}

	public void closeNotificationSuccessMessage() {
		waitToElementClickable(driver, UserProductDetailPageUI.NOTIFICATION_CLOSE_BUTTON);
		clickToElement(driver, UserProductDetailPageUI.NOTIFICATION_CLOSE_BUTTON);
	}

	public UserComputerPO navigateBack() {
		backToPage(driver);
		return PageGeneratorManager.getUserComputerPage(driver);
	}


	public void clickToAddToWishlistButton() {
		waitToElementClickable(driver, UserProductDetailPageUI.ADD_TO_WISHLIST_BUTTON);
		clickToElement(driver, UserProductDetailPageUI.ADD_TO_WISHLIST_BUTTON);
	}

	public void inputToProductQuantity(String number) {
		waitToElementVisible(driver, UserProductDetailPageUI.PRODUCT_QUANTITY_TEXTBOX);
		getElement(driver, UserProductDetailPageUI.PRODUCT_QUANTITY_TEXTBOX).clear();

		sendkeyToElement(driver, UserProductDetailPageUI.PRODUCT_QUANTITY_TEXTBOX, number);
	}

	public void clickToAddToCartButton() {
		waitToElementClickable(driver, UserProductDetailPageUI.ADD_TO_CART_BUTTON);
		clickToElement(driver, UserProductDetailPageUI.ADD_TO_CART_BUTTON);
	}
}

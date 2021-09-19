package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.UserCustomerInforPageUI;
import pageUIs.UserProductDetailPageUI;
import pageUIs.UserShoppingCartPageUI;
import pageUIs.UserWishlistPageUI;

public class UserShoppingCartPO extends AbstractPage{

	WebDriver driver;
	
	public UserShoppingCartPO(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public String getWishlistNumber() {
		waitToElementVisible(driver, UserShoppingCartPageUI.SHOPPING_CART_NUMBER);
		return getElementText(driver, UserShoppingCartPageUI.SHOPPING_CART_NUMBER);
	}

	public UserWishlistPO clickToWishlistHeadermenu() {
		waitToElementClickable(driver, UserShoppingCartPageUI.WISHLIST_HEADER_MENU);
		clickToElement(driver, UserShoppingCartPageUI.WISHLIST_HEADER_MENU);
		return PageGeneratorManager.getUserWishlistPO(driver);
	}

	public UserComputerPO clickOnEditLink() {
		waitToElementClickable(driver, UserShoppingCartPageUI.EDIT_LINK);
		clickToElement(driver, UserShoppingCartPageUI.EDIT_LINK);
		return PageGeneratorManager.getUserComputerPage(driver);
	}


	public void clickToAgreeCheckbox() {
		waitToElementClickable(driver, UserShoppingCartPageUI.AGREE_CHECKBOX);
		clickToElement(driver, UserShoppingCartPageUI.AGREE_CHECKBOX);
	}

	public UserCheckoutPO clickToCheckOutButton() {
		waitToElementClickable(driver, UserShoppingCartPageUI.CHECKOUT_BUTTON);
		clickToElement(driver, UserShoppingCartPageUI.CHECKOUT_BUTTON);
		return PageGeneratorManager.getUserCheckoutPO(driver);
	}

    public void inputToQuantityTextbox(String number) {
		waitToElementVisible(driver, UserShoppingCartPageUI.SHOPPING_CART_NUMBER);
		sendkeyToElement(driver, UserShoppingCartPageUI.SHOPPING_CART_NUMBER, number);
    }

	public void clickToUpdateShoppingCartButton() {
		waitToElementClickable(driver, UserShoppingCartPageUI.UPDATE_SHOPPING_CART_BUTTON);
		clickToElement(driver, UserShoppingCartPageUI.UPDATE_SHOPPING_CART_BUTTON);
	}

	public void clickToEstimateShippingButton() {
		waitToElementClickable(driver, UserShoppingCartPageUI.ESTIMATE_SHIPPING_BUTTON);
		clickToElement(driver, UserShoppingCartPageUI.ESTIMATE_SHIPPING_BUTTON);
	}

	public void clickToNextDayAirText() {
		waitToElementClickable(driver, UserShoppingCartPageUI.NEXT_DAY_AIR_TEXT);
		clickToElement(driver, UserShoppingCartPageUI.NEXT_DAY_AIR_TEXT);
	}

	public void clickToApplyShippingButton() {
		waitToElementClickable(driver, UserShoppingCartPageUI.APPLY_SHIPPING_BUTTON);
		clickToElement(driver, UserShoppingCartPageUI.APPLY_SHIPPING_BUTTON);
	}

	public String getQuantityValue() {
		waitToElementVisible(driver, UserShoppingCartPageUI.SHOPPING_CART_NUMBER);
		return getElementAtribute(driver, UserShoppingCartPageUI.SHOPPING_CART_NUMBER, "value");
	}
}

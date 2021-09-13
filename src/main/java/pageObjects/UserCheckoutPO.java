package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.UserCheckoutPageUI;
import pageUIs.UserProductDetailPageUI;

public class UserCheckoutPO extends AbstractPage{

	WebDriver driver;

	public UserCheckoutPO(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public void selectCountry(String country) {
		waitToElementClickable(driver, UserCheckoutPageUI.COUNTRY_DROPDOWN);
		selectItemInDropdown(driver, UserCheckoutPageUI.COUNTRY_DROPDOWN, country);
	}

	public void inputToCityTexbox(String city) {
		waitToElementVisible(driver, UserCheckoutPageUI.CITY_TEXTBOX);
		sendkeyToElement(driver, UserCheckoutPageUI.CITY_TEXTBOX, city);
	}

	public void inputToAddress1(String address1) {
		waitToElementVisible(driver, UserCheckoutPageUI.ADDRESS1_TEXTBOX);
		sendkeyToElement(driver, UserCheckoutPageUI.ADDRESS1_TEXTBOX, address1);
	}

	public void inputToZipCode(String zip) {
		waitToElementVisible(driver, UserCheckoutPageUI.ZIP_TEXTBOX);
		sendkeyToElement(driver, UserCheckoutPageUI.ZIP_TEXTBOX, zip);
	}

	public void inputToPhoneNumber(String phoneNumber) {
		waitToElementVisible(driver, UserCheckoutPageUI.PHONE_TEXTBOX);
		sendkeyToElement(driver, UserCheckoutPageUI.PHONE_TEXTBOX, phoneNumber);
	}

	public void clickToAddressContinueButton() {
		waitToElementClickable(driver, UserCheckoutPageUI.ADDRESS_CONTINUE_BUTTON);
		clickToElement(driver, UserCheckoutPageUI.ADDRESS_CONTINUE_BUTTON);
	}

	public void clickToShippingContinueButton() {
		waitToElementClickable(driver, UserCheckoutPageUI.SHIPPING_CONTINUE_BUTTON);
		clickToElement(driver, UserCheckoutPageUI.SHIPPING_CONTINUE_BUTTON);
	}

	public boolean paymentInfoDisplay() {
		waitToElementVisible(driver, UserCheckoutPageUI.PAYMENT_INFO_TEXT);
		return isElementDisplayed(driver, UserCheckoutPageUI.PAYMENT_INFO_TEXT);
	}

	public void clickToPaymentContinueButton() {
		waitToElementClickable(driver, UserCheckoutPageUI.PAYMENT_CONTINUE_BUTTON);
		clickToElement(driver, UserCheckoutPageUI.PAYMENT_CONTINUE_BUTTON);
	}
}

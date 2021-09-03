package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.AbstractPage;
import pageUIs.AbstractPageUI;
import pageUIs.UserComputerPageUI;
import pageUIs.UserProductDetailPageUI;

import java.util.ArrayList;

public class UserComputerPO extends AbstractPage{
	WebDriver driver;

	
	public UserComputerPO(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void clickAddToCompareListButtonByHrefProduct(String hrefProduct) {
		waitToElementClickable(driver, UserComputerPageUI.DYNAMIC_ADD_TO_COMPARE_LIST_BUTTON_BY_HREF, hrefProduct);
		clickToElement(driver, UserComputerPageUI.DYNAMIC_ADD_TO_COMPARE_LIST_BUTTON_BY_HREF, hrefProduct);
	}

	public void closeNotificationSuccessMessage() {
		waitToElementClickable(driver, UserComputerPageUI.NOTIFICATION_CLOSE_BUTTON);
		clickToElement(driver, UserComputerPageUI.NOTIFICATION_CLOSE_BUTTON);
	}

	public UserCompareProductPO clickToCompareProductListFooterLink() {
		waitToElementClickable(driver, UserComputerPageUI.COMPARE_PRODUCT_LIST_FOOTER_LINK);
		clickToElement(driver, UserComputerPageUI.COMPARE_PRODUCT_LIST_FOOTER_LINK);
		return PageGeneratorManager.getUserCompareProductPO(driver);
	}

	public boolean notificationSuccessMessageDisplay() {
		waitToElementVisible(driver, UserComputerPageUI.NOTIFICATION_SUCCESS_MESSAGE);
		return isElementDisplayed(driver, UserComputerPageUI.NOTIFICATION_SUCCESS_MESSAGE);
	}

	public UserProductDetailPO clickToProductNameByHref(String href) {
		waitToElementClickable(driver, UserComputerPageUI.DYNAMIC_PRODUCT_NAME_BY_HREF, href);
		clickToElement(driver, UserComputerPageUI.DYNAMIC_PRODUCT_NAME_BY_HREF, href, href);
		return PageGeneratorManager.getUserProductDetailPO(driver);
	}

	public UserRecentlyViewedProductPO clickToRerentlyViewedProductPage() {
		waitToElementClickable(driver, UserComputerPageUI.RECENTLY_VIEWED_PRODUCT_FOOTER_LINK);
		clickToElement(driver, UserComputerPageUI.RECENTLY_VIEWED_PRODUCT_FOOTER_LINK);
		return PageGeneratorManager.getUserRecentlyViewedProductPO(driver);
	}

	public void selectProcessorByName(String itemValue) {
		waitToElementClickable(driver, UserComputerPageUI.PROCESSOR_DROPDOWN);
		selectItemInDropdown(driver, UserComputerPageUI.PROCESSOR_DROPDOWN, itemValue);
		
	}

	public void selectRAMByName(String dropdownName,String itemValue) {
		waitToElementClickable(driver, UserComputerPageUI.RAM_DROPDOWN);
		selectItemInDropdown(driver, UserComputerPageUI.RAM_DROPDOWN, itemValue);
		
	}

	public void selectHDDRadioByLabel(String hddName) {
		waitToElementClickable(driver, UserComputerPageUI.DYNAMIC_HDD_RADIO,hddName);
		clickToElement(driver, UserComputerPageUI.DYNAMIC_HDD_RADIO,hddName);
	}

	public void selectOS(String osName) {
		waitToElementClickable(driver, UserComputerPageUI.OS_VISTA_PREMIUM_RADIO,osName);
		clickToElement(driver, UserComputerPageUI.OS_VISTA_PREMIUM_RADIO,osName);
	}

	public void selectAllSoftware(String msOffice,String acrobatReader, String totalCommander) {
		waitToElementClickable(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL,msOffice);
		waitToElementClickable(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL,acrobatReader);
		waitToElementClickable(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL,totalCommander);
		WebElement element = getElement(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL, msOffice);
		if(!element.isSelected())
		{
			clickToElement(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL,msOffice);
		}
		element = getElement(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL, acrobatReader);
		if(!element.isSelected())
		{
			clickToElement(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL,acrobatReader);
		}
		element = getElement(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL, totalCommander);
		if(!element.isSelected())
		{
			clickToElement(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL,totalCommander);
		}
	}
	public void selectOneSoftware(String msOffice,String acrobatReader, String totalCommander) {
		waitToElementClickable(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL,msOffice);
		waitToElementClickable(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL,acrobatReader);
		waitToElementClickable(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL,totalCommander);
		WebElement element = getElement(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL, msOffice);
		if(!element.isSelected())
		{
			clickToElement(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL,msOffice);
		}
		element = getElement(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL, acrobatReader);
		if(element.isSelected())
		{
			clickToElement(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL,acrobatReader);
		}
		element = getElement(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL, totalCommander);
		if(element.isSelected())
		{
			clickToElement(driver, UserComputerPageUI.DYNAMIC_CHECKBOX_BY_LABEL,totalCommander);
		}
		
	}

	public void clicAddToCartButton() {
		waitToElementClickable(driver, UserComputerPageUI.ADD_TO_CART_BUTTON);
		clickToElement(driver, UserComputerPageUI.ADD_TO_CART_BUTTON);
	}

	public boolean notificationSuccessDisplays() {
		waitToElementVisible(driver, UserComputerPageUI.NOTIFICATION_SUCCESS_MESSAGE);
		return isElementDisplayed(driver, UserComputerPageUI.NOTIFICATION_SUCCESS_MESSAGE);
	}

	public void closeNotificationSuccess() {
		waitToElementVisible(driver, UserComputerPageUI.NOTIFICATION_CLOSE_BUTTON);
		clickToElement(driver, UserComputerPageUI.NOTIFICATION_CLOSE_BUTTON);
		
	}

	public void hoverMouseToShoppingCartMenu() {
		waitToElementVisible(driver, UserComputerPageUI.SHOPPING_CART_HEADER_MENU);
		hoverMouseToElement(driver, UserComputerPageUI.SHOPPING_CART_HEADER_MENU);
	}

	public String getProductTitleInShoppingCart() {
		waitToElementVisible(driver, UserComputerPageUI.PRODUCT_TITLE_TEXT);
		return getElementText(driver, UserComputerPageUI.PRODUCT_TITLE_TEXT);
	}

	public boolean processorDisplay(String processor) {
		waitToElementVisible(driver, UserComputerPageUI.PRODUCT_ATTRIBUTE_TEXT);
		WebElement element = getElement(driver, UserComputerPageUI.PRODUCT_ATTRIBUTE_TEXT);
		return element.getText().contains(processor);
	}

	public boolean RAMDisplay(String RAM) {
		waitToElementVisible(driver, UserComputerPageUI.PRODUCT_ATTRIBUTE_TEXT);
		WebElement element = getElement(driver, UserComputerPageUI.PRODUCT_ATTRIBUTE_TEXT);
		return element.getText().contains(RAM);
	}

	public boolean HDDDisplay(String HDD) {
		waitToElementVisible(driver, UserComputerPageUI.PRODUCT_ATTRIBUTE_TEXT);
		WebElement element = getElement(driver, UserComputerPageUI.PRODUCT_ATTRIBUTE_TEXT);
		return element.getText().contains(HDD);
	}

	public boolean OSDisplay(String OS) {
		waitToElementVisible(driver, UserComputerPageUI.PRODUCT_ATTRIBUTE_TEXT);
		WebElement element = getElement(driver, UserComputerPageUI.PRODUCT_ATTRIBUTE_TEXT);
		return element.getText().contains(OS);
	}

	public boolean softwareDisplay(String software) {
		waitToElementVisible(driver, UserComputerPageUI.PRODUCT_ATTRIBUTE_TEXT);
		WebElement element = getElement(driver, UserComputerPageUI.PRODUCT_ATTRIBUTE_TEXT);
		return element.getText().contains(software);
	}

	public boolean priceDisplay(String price) {
		waitToElementVisible(driver, UserComputerPageUI.TOTAL_PRICE_IN_SHOPPING_CART);
		WebElement element = getElement(driver, UserComputerPageUI.TOTAL_PRICE_IN_SHOPPING_CART);
		return element.getText().contains(price);
	}

	public UserShoppingCartPO clickOnShoppingCartLink() {
		waitToElementClickable(driver, UserComputerPageUI.SHOPPING_CART_HEADER_MENU);
		clickToElement(driver, UserComputerPageUI.SHOPPING_CART_HEADER_MENU);
		return PageGeneratorManager.getUserShoppingCartPO(driver);
	}

	public void updateQuantity(String quantity) {
		waitToElementVisible(driver, UserComputerPageUI.PRODUCT_QUANTITY);
		sendkeyToElement(driver, UserComputerPageUI.PRODUCT_QUANTITY, quantity);
	}

	public void clickToUpdateButton() {
		waitToElementClickable(driver, UserComputerPageUI.UPDATE_BUTTON);
		clickToElement(driver, UserComputerPageUI.UPDATE_BUTTON);
	}

	public String getProductPrice() {
		waitToElementVisible(driver, UserComputerPageUI.PRODUCT_PRICE);
		return getElementText(driver, UserComputerPageUI.PRODUCT_PRICE);
	}

	public UserShoppingCartPO clickOnGoToCartButton() {
		waitToElementClickable(driver, UserComputerPageUI.GO_TO_CART_BUTTON);
		clickToElement(driver, UserComputerPageUI.GO_TO_CART_BUTTON);
		return PageGeneratorManager.getUserShoppingCartPO(driver);
	}

	public void ClickOnRemoveCheckbox(String SKU) {
		waitToElementClickable(driver, UserComputerPageUI.DYNAMIC_REMOVE_CHECKBOX_BY_SKU, SKU);
		clickToElement(driver, UserComputerPageUI.DYNAMIC_REMOVE_CHECKBOX_BY_SKU, SKU);
	}

	public void clickOnUpdateShoppingCartButton() {
		waitToElementClickable(driver, UserComputerPageUI.UPDATE_CART_BUTTON);
		clickToElement(driver, UserComputerPageUI.UPDATE_CART_BUTTON);
	}

	public boolean shoppingCartEmptyDisplay() {
		waitToElementVisible(driver, UserComputerPageUI.NOTIFICATION_NO_DATA);
		return isElementDisplayed(driver, UserComputerPageUI.NOTIFICATION_NO_DATA);
	}


    public void selectOptionDropdown(String sortType) {
		waitToElementClickable(driver, UserComputerPageUI.SORT_BY_DROPDOWN);
		selectDropdownByName(driver,UserComputerPageUI.SORT_BY_DROPDOWN,UserComputerPageUI.A_TO_Z_OPTION);


    }

	public boolean isProductNameSortAToZSuccessfully() {
		ArrayList<String> originalList, sortedList1, sortedList2;
		waitToElementVisible(driver, UserComputerPageUI.PRODUCT_NAME_LIST);
		originalList = getProductNameList(driver,UserComputerPageUI.PRODUCT_NAME_LIST);
		sortedList1 = getProductNameListAfterProcessSortASC(driver,UserComputerPageUI.PRODUCT_NAME_LIST);

		selectItemInDropdown(driver, UserComputerPageUI.SORT_BY_DROPDOWN, "Name: A to Z");
		waitToElementVisible(driver, UserComputerPageUI.SPINNER);
		waitToElementInvisible(driver, UserComputerPageUI.SPINNER);
		sortedList2 = getProductNameList(driver,UserComputerPageUI.PRODUCT_NAME_LIST);

		return sortedList1.equals(sortedList2);
	}

	public boolean isProductNameSortZToASuccessfully() {
		ArrayList<String> originalList, sortedList1, sortedList2;
		selectItemInDropdown(driver, UserComputerPageUI.SORT_BY_DROPDOWN, "Position");
		waitToElementVisible(driver, UserComputerPageUI.SPINNER);
		waitToElementInvisible(driver, UserComputerPageUI.SPINNER);

		originalList = getProductNameList(driver,UserComputerPageUI.PRODUCT_NAME_LIST);
		sortedList1 = getProductNameListAfterProcessSortDESC(driver,UserComputerPageUI.PRODUCT_NAME_LIST);

		selectItemInDropdown(driver, UserComputerPageUI.SORT_BY_DROPDOWN, "Name: Z to A");
		waitToElementVisible(driver, UserComputerPageUI.SPINNER);
		waitToElementInvisible(driver, UserComputerPageUI.SPINNER);
		sortedList2 = getProductNameList(driver,UserComputerPageUI.PRODUCT_NAME_LIST);

		return sortedList1.equals(sortedList2);
	}

	public boolean isProductPriceSortLowToHighSuccessfully() {
		ArrayList<String> originalList, sortedList1, sortedList2;
		waitToElementVisible(driver, UserComputerPageUI.PRODUCT_PRICE_LIST);
		originalList = getProductPriceList(driver,UserComputerPageUI.PRODUCT_PRICE_LIST);
		sortedList1 = getProductPriceListAfterProcessSortASC(driver,UserComputerPageUI.PRODUCT_PRICE_LIST);

		selectItemInDropdown(driver, UserComputerPageUI.SORT_BY_DROPDOWN, "Price: Low to High");
		waitToElementVisible(driver, UserComputerPageUI.SPINNER);
		waitToElementInvisible(driver, UserComputerPageUI.SPINNER);
		sortedList2 = getProductPriceList(driver,UserComputerPageUI.PRODUCT_PRICE_LIST);

		return sortedList1.equals(sortedList2);
	}

	public boolean isProductPriceSortHighToLowSuccessfully() {
		ArrayList<String> originalList, sortedList1, sortedList2;
		waitToElementVisible(driver, UserComputerPageUI.PRODUCT_PRICE_LIST);
		originalList = getProductPriceList(driver,UserComputerPageUI.PRODUCT_PRICE_LIST);
		sortedList1 = getProductPriceListAfterProcessSortDESC(driver,UserComputerPageUI.PRODUCT_PRICE_LIST);

		selectItemInDropdown(driver, UserComputerPageUI.SORT_BY_DROPDOWN, "Price: High to Low");
		waitToElementVisible(driver, UserComputerPageUI.SPINNER);
		waitToElementInvisible(driver, UserComputerPageUI.SPINNER);
		sortedList2 = getProductPriceList(driver,UserComputerPageUI.PRODUCT_PRICE_LIST);

		return sortedList1.equals(sortedList2);

	}

	public boolean isProductListLessThanOrEqual3Items(String pageNumber) {
		waitToElementVisible(driver, UserComputerPageUI.PAGE_SIZE_DROPDOWN);
		selectItemInDropdown(driver, UserComputerPageUI.PAGE_SIZE_DROPDOWN, UserComputerPageUI.PAGE_SIZE_OPTION_DROPDOWN_BY_TEXT, pageNumber);
		waitToElementClickable(driver, UserComputerPageUI.NEXT_PAGE_BUTTON);
		int pageSize = getProductNameList(driver,UserComputerPageUI.PRODUCT_NAME_LIST).size();
		if(pageSize>3)
		{
			return false;
		}
		return true;
	}

	public boolean isNextIconDisplayInPage1() {
		waitToElementVisible(driver, UserComputerPageUI.NEXT_PAGE_BUTTON);
		if(isElementDisplayed(driver, UserComputerPageUI.NEXT_PAGE_BUTTON))
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	public boolean isPreviousIconDisplayInPage2() {
		waitToElementClickable(driver, UserComputerPageUI.NEXT_PAGE_BUTTON);
		clickToElement(driver, UserComputerPageUI.NEXT_PAGE_BUTTON);
		waitToElementVisible(driver, UserComputerPageUI.PREVIOUS_PAGE_BUTTON);
		if(isElementDisplayed(driver, UserComputerPageUI.PREVIOUS_PAGE_BUTTON))
		{
			return true;
		}
		else
		{
			return true;
		}
	}

	public boolean isProductListLessThanOrEqual6Items(String pageNumber) {
		waitToElementVisible(driver, UserComputerPageUI.PAGE_SIZE_DROPDOWN);
		selectItemInDropdown(driver, UserComputerPageUI.PAGE_SIZE_DROPDOWN, UserComputerPageUI.PAGE_SIZE_OPTION_DROPDOWN_BY_TEXT, pageNumber);
		waitToElementVisible(driver, UserComputerPageUI.SPINNER);
		waitToElementInvisible(driver, UserComputerPageUI.SPINNER);
		int pageSize = getProductNameList(driver,UserComputerPageUI.PRODUCT_NAME_LIST).size();
		if(pageSize>6)
		{
			return false;
		}
		return true;
	}

	public boolean isPagingNotDisplay() {
		if(isElementUndisplayed(driver, UserComputerPageUI.CURRENT_PAGE_BUTTON))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isProductListLessThanOrEqual9Items(String pageNumber) {
		waitToElementVisible(driver, UserComputerPageUI.PAGE_SIZE_DROPDOWN);
		selectItemInDropdown(driver, UserComputerPageUI.PAGE_SIZE_DROPDOWN, UserComputerPageUI.PAGE_SIZE_OPTION_DROPDOWN_BY_TEXT, pageNumber);
		waitToElementVisible(driver, UserComputerPageUI.SPINNER);
		waitToElementInvisible(driver, UserComputerPageUI.SPINNER);
		int pageSize = getProductNameList(driver,UserComputerPageUI.PRODUCT_NAME_LIST).size();
		if(pageSize>9)
		{
			return false;
		}
		return true;
	}

	public UserProductDetailPO clickToProductTitleByName(WebDriver driver, String productName) {
			waitToElementClickable(driver, UserComputerPageUI.DYNAMIC_PRODUCT_NAME_BY_NAME, productName);
			clickToElement(driver,UserComputerPageUI.DYNAMIC_PRODUCT_NAME_BY_NAME, productName);
			return PageGeneratorManager.getUserProductDetailPO(driver);

	}

	public UserHomePO goToHomePage() {
		navigateToUrlByJS(driver, "https://demo.nopcommerce.com/");
		return PageGeneratorManager.getUserHomePage(driver);
	}

	public UserProductDetailPO clickAddToCartByProductName(String productName) {
		waitToElementClickable(driver, UserComputerPageUI.DYNAMIC_ADD_TO_CART_BY_TEXT,productName);
		clickToElement(driver, UserComputerPageUI.DYNAMIC_ADD_TO_CART_BY_TEXT,productName);
		return PageGeneratorManager.getUserProductDetailPO(driver);

	}


}

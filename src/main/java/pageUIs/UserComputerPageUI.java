package pageUIs;

public class UserComputerPageUI {
	public static final String DYNAMIC_ADD_TO_COMPARE_LIST_BUTTON_BY_HREF = "//h2/a[@href='/%s']/parent::h2/following-sibling::div[@class='add-info']//button[@title='Add to compare list']";
	public static final String NOTIFICATION_CLOSE_BUTTON = "//span[@title='Close']";
	public static final String COMPARE_PRODUCT_LIST_FOOTER_LINK = "//div[@class='footer']//a[@href='/compareproducts']";
	public static final String RECENTLY_VIEWED_PRODUCT_FOOTER_LINK = "//div[@class='footer']//a[@href='/recentlyviewedproducts']";
	public static final String NOTIFICATION_SUCCESS_MESSAGE = "//div[@class='bar-notification success']/p";
	public static final String DYNAMIC_PRODUCT_NAME_BY_HREF = "//h2[@class='product-title']/a[@href='/%s']";
	public static final String DYNAMIC_PRODUCT_NAME_BY_NAME = "//h2[@class='product-title']/a[text()='%s']";

	
	public static final String DYNAMIC_HDD_RADIO = "//label[text()='%s']";
	public static final String OS_VISTA_PREMIUM_RADIO = "//label[text()='%s']";
	public static final String SOFTWARE_MICROSOFT_OFFICE_CHECKBOX = "//label[text()='Microsoft Office [+$50.00]']";
	public static final String SOFTWARE_ACROBAT_READER_CHECKBOX = "//label[text()='Acrobat Reader [+$10.00]']";
	public static final String SOFTWARE_TOTAL_COMMANDER_CHECKBOX = "//label[text()='Total Commander [+$5.00]']";
	public static final String ADD_TO_CART_BUTTON = "//input[@id='add-to-cart-button-1']";
	public static final String DYNAMIC_CHECKBOX_BY_LABEL = "//label[text()='%s']/preceding-sibling::input";
	
	public static final String SHOPPING_CART_HEADER_MENU = "//li[@id='topcartlink']";
	public static final String COUNT_NUMBER_IN_CART_TEXT = "//div[@class='count']";
	public static final String PRODUCT_TITLE_TEXT = "//div[@class='name']";
	public static final String PRODUCT_ATTRIBUTE_TEXT = "//div[@class='attributes']";
	public static final String PRODUCT_PRICE_TEXT = "//div[@class='price']";
	
	public static final String PRODUCT_QUANTITY = "//input[@id='product_enteredQuantity_1']";
	public static final String PRODUCT_PRICE = "//div[@class='product-price']/span";
	public static final String UPDATE_BUTTON = "//input[@id='add-to-cart-button-1']";
	public static final String TOTAL_PRICE_IN_SHOPPING_CART = "//div[@class='totals']/strong";
	
	public static final String GO_TO_CART_BUTTON = "//input[@value='Go to cart']";
	public static final String DYNAMIC_REMOVE_CHECKBOX_BY_SKU = "//span[text()='%s']/parent::td/preceding-sibling::td/input";
	public static final String UPDATE_CART_BUTTON = "//input[@name='updatecart']";
	public static final String NOTIFICATION_NO_DATA = "//div[@class='no-data']";

	public static final String SORT_BY_DROPDOWN = "//select[@id='products-orderby']";
	public static final String A_TO_Z_OPTION = "//option[text()='Name: A to Z']";
	public static final String PRODUCT_NAME_LIST = "//h2[@class='product-title']/a";
	public static final String PRODUCT_PRICE_LIST = "//div[@class='prices']//span[@class='price actual-price']";
	public static final String SPINNER = "//div[@class='ajax-products-busy' and @style='display: block;']";
	public static final String PAGE_SIZE_DROPDOWN = "//select[@id='products-pagesize']";
	public static final String PAGE_SIZE_OPTION_DROPDOWN_BY_TEXT = "//select[@id='products-pagesize']/option[text()='%s']";
	public static final String NEXT_PAGE_BUTTON = "//li[@class='next-page']";
	public static final String PREVIOUS_PAGE_BUTTON = "//li[@class='previous-page']";
	public static final String CURRENT_PAGE_BUTTON = "//li[@class='current-page']";





	
	
}

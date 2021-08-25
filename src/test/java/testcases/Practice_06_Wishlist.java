package testcases;

import commons.AbstractTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;

public class Practice_06_Wishlist extends AbstractTest {
	WebDriver driver;
	Select selectDay, selectMonth, selectYear;

	String firstName, lastName, email, companyName, pass, confirmPass;
	String updateFirstName, updateLastName, updateEmail, updateCompanyName;

	/**
	 * @author admin: Binh Ha
	 * 
	 */
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {

		driver = getBrowserDriver(browserName);

		// data
		firstName = "Tony";
		lastName = "Buoi Sang";
		email = "tonybuoisang" + randomNumber() + "@gmail.com";
		companyName = "Tony Buoi Sang company";
		pass = "123456";
		// update data
		updateFirstName = "Automation";
		updateLastName = "FC";
		updateEmail = "automationfc." + randomNumber() + ".vn@gmail.com";
		updateCompanyName = "Automation FC";

		Register();
		Login_In_With_Register_Email_And_correct_Password();
		homePage = PageGeneratorManager.getUserHomePage(driver);
		homePage.hoverToHeaderMenu("Computers");
		computerPage = homePage.clickToSubmenu("Desktops");
		
	}
	@Test
	public void TC_01_Add_To_Wishlist()
	{
        producDetailPage = computerPage.clickToProductTitleByName(driver, "Lenovo IdeaCentre 600 All-in-One PC");
        producDetailPage.clickToAddToWishlistButton();
        verifyEquals(producDetailPage.getNotificationSuccessMessage(),"The product has been added to your wishlist");
        producDetailPage.closeNotificationSuccessMessage();
		wishListPage = producDetailPage.clickToWishlistHeaderLink("wishlist-label");
		verifyEquals(wishListPage.getProductName(),"Lenovo IdeaCentre 600 All-in-One PC");
		wishListPage.clickToWishlistShareLink();
		verifyEquals(wishListPage.getWishlistPageTitle(), "Wishlist of "+firstName+" "+lastName);

	}

	public void Login_In_With_Register_Email_And_correct_Password() {
		homePage = PageGeneratorManager.getUserHomePage(driver);
		loginPage = homePage.clickToLoginLink();

		loginPage.inputToEmailTextbox(email);
		System.out.println("email: "+email);
		loginPage.inputToPasswordTextbox("123456");
		loginPage.clickToLoginButton();

		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
		Assert.assertTrue(homePage.isLogoutLinkDisplayed());
	}
	@Test
	public void TC_02_Add_Product_To_Cart_From_Wishlist() {
		wishListPage.clickToAddToCartCheckbox();
		String wishlistNumber = wishListPage.getWishlistNumber();
		shoppingCartPage = wishListPage.clickToAddToCartButton();
		String shoppingCartNumber = shoppingCartPage.getWishlistNumber();
		verifyEquals(wishlistNumber, shoppingCartNumber);

	}

	@Test
	public void TC_03_Remove_Product_From_Wishlist() {
		wishListPage = shoppingCartPage.clickToWishlistHeadermenu();
		wishListPage.clickToRemoveFromCartCheckbox();
		//wishListPage.clickToUpdateWishlistButton();
		verifyEquals(wishListPage.getWishlistNumber(), "(0)");

	}

	@Test
	public void TC_04_Add_Product_To_Compare() {

		wishListPage.hoverToComputersHeaderMenu();
		computerPage = wishListPage.clickToDesktopSubMenu();

		log.info("click add to compare list on Build your own computer");
		computerPage.clickAddToCompareListButtonByHrefProduct("build-your-own-computer");

		log.info("verify notificaiton message displayed");
		verifyTrue(computerPage.notificationSuccessMessageDisplay());

		log.info("close notification message");
		computerPage.closeNotificationSuccessMessage();

		log.info("click add to compare list on Lenovo IdeaCentre 600 All-in-One PC");
		computerPage.clickAddToCompareListButtonByHrefProduct("lenovo-ideacentre-600-all-in-one-pc");

		log.info("verify notificaiton message displayed");
		verifyTrue(computerPage.notificationSuccessMessageDisplay());

		log.info("close notification message");
		computerPage.sleepInSecond(2);
		computerPage.closeNotificationSuccessMessage();


		log.info("click to compare product list in footer");
		compareProductPage = computerPage.clickToCompareProductListFooterLink();

		log.info("verify that Lenovo IdeaCentre 600 All-in-One PC displays");
		verifyTrue(compareProductPage.compareProductDisplayByProductName("Lenovo IdeaCentre 600 All-in-One PC"));

		log.info("verify that Build your own computer displays");
		verifyTrue(compareProductPage.compareProductDisplayByProductName("Build your own computer"));

		compareProductPage.clickToClearListButton();

		verifyTrue(compareProductPage.isNoDataMessageDisplay());

	}
	@Test
	public void TC_05_Recently_View_Products() {
		log.info("hover on Computer header menu then click on notebooks submenu");
		compareProductPage.hoverMouseToComputerHeader();
		computerPage = compareProductPage.clickToNotebooksSubmenu();

		log.info("view product detail Asus N551JK-XO076H Laptop");
		myProductPage = computerPage.clickToProductNameByHref("asus-n551jk-xo076h-laptop");
		computerPage = myProductPage.navigateBack();

		log.info("view product detail HP Envy 6-1180ca 15.6-Inch Sleekbook");
		myProductPage = computerPage.clickToProductNameByHref("hp-envy-6-1180ca-156-inch-sleekbook");
		computerPage = myProductPage.navigateBack();

		log.info("view product detail HP Spectre XT Pro UltraBook");
		myProductPage = computerPage.clickToProductNameByHref("hp-spectre-xt-pro-ultrabook");
		computerPage = myProductPage.navigateBack();

		log.info("view product detail Lenovo Thinkpad X1 Carbon Laptop");
		myProductPage = computerPage.clickToProductNameByHref("lenovo-thinkpad-x1-carbon-laptop");
		computerPage = myProductPage.navigateBack();

		log.info("view product detail Samsung Series 9 NP900X4C Premium Ultrabook");
		myProductPage = computerPage.clickToProductNameByHref("samsung-series-9-np900x4c-premium-ultrabook");
		computerPage = myProductPage.navigateBack();

		log.info("click to recently viewed products footer link");
		recentlyViewedProductPage = computerPage.clickToRerentlyViewedProductPage();

		log.info("verify 3 recently viewed products show");
		verifyEquals(recentlyViewedProductPage.getProductNameWithHref("hp-spectre-xt-pro-ultrabook"), "HP Spectre XT Pro UltraBook");
		verifyEquals(recentlyViewedProductPage.getProductNameWithHref("lenovo-thinkpad-x1-carbon-laptop"), "Lenovo Thinkpad X1 Carbon Laptop");
		verifyEquals(recentlyViewedProductPage.getProductNameWithHref("samsung-series-9-np900x4c-premium-ultrabook"), "Samsung Series 9 NP900X4C Premium Ultrabook");

		log.info("other products should not show");
		verifyFalse(recentlyViewedProductPage.isProductDisplayWithHref("asus-n551jk-xo076h-laptop"));

	}



	public void Register() {
		// 1
		homePage = PageGeneratorManager.getUserHomePage(driver);
		registerPage = homePage.clickToRegisterLink();

		// 2
		registerPage.clickToGenderMaleRadioButton();

		registerPage.inputToFirstnameTextBox(firstName);

		registerPage.inputToLastnameTextBox(lastName);

		registerPage.selectDayDropdown("10");

		registerPage.selectMonthDropdown("February");

		registerPage.selectYearDropdown("1990");

		registerPage.inputToEmailTextbox(email);
		registerPage.inputToCompanyTextbox(companyName);
		registerPage.inputToPasswordTextbox(pass);
		registerPage.inputToConfirmPasswordTextbox(pass);

		registerPage.clickToRegisterButton();


		homePage = registerPage.clickToLogoutLink();

	}

	@AfterClass
	public void afterClass() {
	}

	UserHomePO homePage;
	UserRegisterPO registerPage;
	UserLoginPO loginPage;
	UserComputerPO computerPage;
    UserProductDetailPO producDetailPage;
	UserWishlistPO wishListPage;

	UserProductDetailPO myProductPage;
	UserShoppingCartPO shoppingCartPage;
	UserCompareProductPO compareProductPage;
	UserRecentlyViewedProductPO recentlyViewedProductPage;
}

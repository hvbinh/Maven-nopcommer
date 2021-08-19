package testcases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.filefilter.MagicNumberFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractPage;
import commons.AbstractTest;
import net.bytebuddy.implementation.bytecode.Throw;
import pageObjects.UserAddressesPO;
import pageObjects.UserComputerPO;
import pageObjects.UserCustomerInforPO;
import pageObjects.UserHomePO;
import pageObjects.UserLoginPO;
import pageObjects.UserProductDetailPO;
import pageObjects.UserOrdersPO;
import pageObjects.PageGeneratorManager;
import pageObjects.UserRegisterPO;
import pageObjects.UserSearchPO;
import pageUIs.UserSearchPageUI;

public class Practice_05_Sort_Dislay_Paging extends AbstractTest {
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
		computerPage = homePage.clickToSubmenu("Notebooks");
		
	}
	@Test
	public void TC_01_Verify_Product_Name_Is_Sort_Ascending()
	{
		verifyTrue(computerPage.isProductNameSortAToZSuccessfully());
	}
	@Test
	public void TC_02_Verify_Product_Name_Is_Sort_Descending()
	{
		verifyTrue(computerPage.isProductNameSortZToASuccessfully());
	}
	@Test
	public void TC_03_Verify_Product_Price_Is_Sort_ASC()
	{
		verifyTrue(computerPage.isProductPriceSortLowToHighSuccessfully());
	}
	@Test
	public void TC_04_Verify_Product_Price_Is_Sort_DESC()
	{
		verifyTrue(computerPage.isProductPriceSortHighToLowSuccessfully());
	}
	@Test
	public void TC_05_Verify_Page_Size_Equal_3()
	{
		verifyTrue(computerPage.isProductListLessThanOrEqual3Items("3"));
		verifyTrue(computerPage.isNextIconDisplayInPage1());
		verifyTrue(computerPage.isPreviousIconDisplayInPage2());
	}
	@Test
	public void TC_06_Verify_Page_Size_Equal_6()
	{
		verifyTrue(computerPage.isProductListLessThanOrEqual6Items("6"));
		verifyTrue(computerPage.isPagingNotDisplay());
	}
	@Test
	public void TC_07_Verify_Page_Size_Equal_9()
	{
		verifyTrue(computerPage.isProductListLessThanOrEqual9Items("9"));
		verifyTrue(computerPage.isPagingNotDisplay());
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
}

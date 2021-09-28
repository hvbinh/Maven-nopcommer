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

public class Practice_08_Admin extends AbstractTest {
	WebDriver driver;

	/**
	 * @author admin: Binh Ha
	 * 
	 */
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {

		driver = getBrowserDriver(browserName,"https://admin-demo.nopcommerce.com/");

		Login_In_With_Register_Email_And_correct_Password();
		//homePage = PageGeneratorManager.getUserHomePage(driver);

	}

	@Test
	public void TC_01_Add_Product_To_Cart() {


	}



	public void Login_In_With_Register_Email_And_correct_Password() {
		loginPage = PageGeneratorManager.getAdminLoginPage(driver);
		dashboardPage = loginPage.clickToLoginButton();

	}



	@AfterClass
	public void afterClass() {
	}

	AdminLoginPO loginPage;
	AdminDashboardPO dashboardPage;


}

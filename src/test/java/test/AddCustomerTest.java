package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToCreateCustomer() {
		
		driver=BrowserFactory.init();
		
		LoginPage LoginPage = PageFactory.initElements(driver, LoginPage.class);
		
		LoginPage.enterUserName("demo@techfios.com");
		LoginPage.enterPassword("abc123");
		LoginPage.clickSigninButton();
		
		DashboardPage dashboardPage=PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
		dashboardPage.clickCustomersButton();
		dashboardPage.clickAddCustomersButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.enterFullName("Selenium");
		addCustomerPage.enterCompany("Techfios");
		addCustomerPage.enterEmail("abc@techfios.com");
		
	}

}

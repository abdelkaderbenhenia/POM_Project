package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		LoginPage LoginPage = PageFactory.initElements(driver, LoginPage.class);
		
		LoginPage.enterUserName("demo@techfios.com");
		LoginPage.enterPassword("abc123");
		LoginPage.clickSigninButton();
		
		DashboardPage dashboardPage=PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
		
		
		BrowserFactory.teardDown();
		
	}

}

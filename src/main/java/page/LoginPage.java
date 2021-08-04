package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	// Element lib
	// WebElement element=driver.findElement(By.xpath("//*[@id=\"username\"]"));
	// By locator=By.xpath("");

	@FindBy(how = How.XPATH, using = "//*[@id=\'username\']")
	WebElement USERNAME_FIELD;

	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	WebElement PASSWORD_FIELD;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGNIN_FIELD;

	// Interactive Methods
	// Technique Individual method
	public void enterUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	public void clickSigninButton() {
		SIGNIN_FIELD.click();
	}

	// Technique combined method
	public void testLogin(String userName, String password) {
		USERNAME_FIELD.sendKeys(userName);
		PASSWORD_FIELD.sendKeys(password);
		SIGNIN_FIELD.click();

	}

}

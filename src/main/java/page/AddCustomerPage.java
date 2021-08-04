package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {

WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver=driver;
	}


	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")WebElement FUL_NAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")WebElement COMPANY_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")WebElement EMAIL_FIELD;
	
	public void enterFullName(String fULLNANE) {
		
		FUL_NAME_FIELD.sendKeys(fULLNANE+generateNumber(999));
	}
	

	
	
	
	public void enterCompany(String company) {
		
		selectDropdown(COMPANY_FIELD, company);
	}
	
	

	

	public void enterEmail(String email) {
		EMAIL_FIELD.sendKeys(generateNumber(999)+email);
	} 
}

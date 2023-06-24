package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class LoginPage extends TestBase {
	
	//driver.findElements(By.xpath()).sendKeys();
	
	
	//To initialize Webelements

	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//WebElements repository
	
	@FindBy (name = "username")
	WebElement usernameTxtBox;
	
	@FindBy (name = "password")
	WebElement passwordTxtBox;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbtn;

	@FindBy (xpath = "(//img[@class='img-responsive'])[1]")
	WebElement logo;
	
	@FindBy (linkText = "Sign Up")
	WebElement signUplink;
	//Action
	public HomePage login() {
		usernameTxtBox.sendKeys(prop.getProperty("username"));
		passwordTxtBox.sendKeys(prop.getProperty("password"));
		loginbtn.click();
		
		return new HomePage();
		
	}
	
	public boolean logoStatus() {
		boolean status = logo.isDisplayed();
		return status;
	}
	
	public boolean linkStatus() {
		boolean status = signUplink.isDisplayed();
		return status;
	}

}

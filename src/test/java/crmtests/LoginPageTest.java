package crmtests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.LoginPage;

public class LoginPageTest extends TestBase {
	
//Maven  - It is "Build management tool"
	//We will get auto created folder structure
	//Dependencies will be managed by pom.xml
	//We can change the version of tool
	
//POM = Page Object Model
	//- POM is a test design pattern
	// - We will seperate page objects and test cases LoginPage
	
	//Username text box
	//password text box
	//Login Button
	//Logo
	
	//---LoginPageTest
	
	//validateLoginTest();
	//validateLogoTest();
	//validateLoginPageLinks();
	
	LoginPage loginPage;
	
	
	@BeforeMethod
	public void initialization() {
		init();
		loginPage = new LoginPage();
	}
	
	@Test
	public void validateLoginTest() {
		
		loginPage.login();
	}
	
	@Test
	public void validateLogoTest() {
		boolean actualStatus = loginPage.logoStatus();
		Assert.assertEquals(actualStatus, true);
		
	}
	@Test
	public void validateLinksTest() {
		boolean actualStatus = loginPage.linkStatus();
		Assert.assertTrue(actualStatus);
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
}

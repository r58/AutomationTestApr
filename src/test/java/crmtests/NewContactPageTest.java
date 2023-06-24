package crmtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.HomePage;
import crmpages.LoginPage;
import crmpages.NewContactPage;
import utility.ReadData;

public class NewContactPageTest extends TestBase {
	
	HomePage homePage;
	NewContactPage newContactPage;
	
	@BeforeMethod
	public void initialization() {
		TestBase.init();	//Login page comes here
		LoginPage loginPage = new LoginPage();
		homePage = loginPage.login();	//Returned Home Page here
		newContactPage = homePage.newContact();	//Returned new Contact page
		
	}
	
	@DataProvider(name = "contactData")
	public String[][] passData() {
		return ReadData.testData();
		
	}
	
	
	@Test (dataProvider = "contactData")
	public void validateCreateContact(String FirstName, String LastName, String MobileNumber,String Address) {
		
		newContactPage.createNewContact(FirstName,LastName,MobileNumber,Address);	//So here the data will be provided by DataProvider
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	

}


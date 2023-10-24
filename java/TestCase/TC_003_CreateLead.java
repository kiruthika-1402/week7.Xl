package TestCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.ProjextSpecificMethod;
import Pages.LoginPage;

public class TC_003_CreateLead extends ProjextSpecificMethod  {
	
	@BeforeTest
	public void setData() {
	 filename = "CreateLead";

	}
	@Test(dataProvider = "fetchData")
	public void CreateLead1(String uname,String password,String companyName,String fName,String lName) {
		
		LoginPage lp = new LoginPage(driver);
		System.out.println(driver);
		lp.enterUserName(uname)
		.enterPassword(password)
		.clickOnLogin()
		.clickOnLink()
		.clickOnLeads()
		.clickOnCreateLead()
		.comName(companyName)
		.firstName(fName)
		.lastName(lName)
		.clickOnSubmit();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       
		
		
		
	}

}

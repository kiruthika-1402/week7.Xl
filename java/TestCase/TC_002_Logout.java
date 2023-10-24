package TestCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.ProjextSpecificMethod;
import Pages.LoginPage;

public class TC_002_Logout extends ProjextSpecificMethod {
	
	@BeforeTest
	public void setData() {
	 filename = "CreateLead";
	}
	@Test(dataProvider = "fetchData")
	public void logoutdata(String uname,String password) {
		LoginPage lp = new LoginPage(driver);
		System.out.println(driver);
		lp.enterUserName(uname)
		.enterPassword(password)
		.clickOnLogin()
		.clickLogout();
		
	}

}

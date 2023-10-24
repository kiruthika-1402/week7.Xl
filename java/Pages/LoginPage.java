package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.ProjextSpecificMethod;

public class LoginPage extends ProjextSpecificMethod {
	
	public LoginPage(RemoteWebDriver driver) {
	this.driver=driver;
	
	}
//	public RemoteWebDriver driver;

	public LoginPage enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		
		return this;
	}
	public HomePage clickOnLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new HomePage(driver);

	}
}

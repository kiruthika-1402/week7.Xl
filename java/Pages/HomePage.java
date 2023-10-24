package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.ProjextSpecificMethod;

public class HomePage extends ProjextSpecificMethod{
	
	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	
	public MyHomePage clickOnLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
        return new MyHomePage(driver);
	}
	
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new LoginPage(driver);
	}
}

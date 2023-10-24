package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.ProjextSpecificMethod;

public class MyHomePage extends ProjextSpecificMethod  {
	
	public MyHomePage(RemoteWebDriver driver){
		this.driver = driver;
	}

	public MyLead clickOnLeads() {
		driver.findElement(By.linkText("Leads")).click();
		
		return new MyLead(driver);
	}

}
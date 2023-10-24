package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.ProjextSpecificMethod;

public class MyLead extends ProjextSpecificMethod{
	
	public MyLead(RemoteWebDriver driver) {
		this.driver=driver;
		
		}
	public  CreateLead1 clickOnCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead1(driver);
	}
	
	

	}
	


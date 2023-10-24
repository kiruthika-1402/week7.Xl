package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.ProjextSpecificMethod;

public class CreateLead1 extends ProjextSpecificMethod {
	
	public CreateLead1(RemoteWebDriver driver){
		this.driver = driver;
	}
	public CreateLead1 comName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		    return this;
		}
		public CreateLead1 firstName(String fName) {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
			return this;
		}
		
		public CreateLead1 lastName(String lName) {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
			return this;
		}
		public ViewLead clickOnSubmit() {
			driver.findElement(By.name("submitButton")).click();
			return new ViewLead(driver);
	
	}
}

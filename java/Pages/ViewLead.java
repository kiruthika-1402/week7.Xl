package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.ProjextSpecificMethod;

public class ViewLead extends ProjextSpecificMethod {

	public ViewLead(RemoteWebDriver driver){
		this.driver = driver;
	}
	
	public ViewLead viewMyLead() {
		
		driver.findElement(By.xpath("//div[text()='View Lead']")).click();
		return this;
	}

}

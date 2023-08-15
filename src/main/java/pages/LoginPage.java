package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class LoginPage extends BaseClass {

	
	public LoginPage enterUserName() {
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		
		return this;
	}
	
	public LoginPage enterPassword() {
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("crmsfa");
			
			return this;
		
	}
	
	public CRMSFAPage clickOnLogin() {
		
		WebElement clickButton = driver.findElement(By.className("decorativeSubmit"));
		
		clickButton.click();
		
		return new CRMSFAPage();
	}
}

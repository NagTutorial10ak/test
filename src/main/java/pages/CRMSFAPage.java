package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CRMSFAPage extends BaseClass {

	
	public HomePage clickOnCrmSfa() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new HomePage();
	}
	
	public void clickOnLogOut() {
		
	}
}

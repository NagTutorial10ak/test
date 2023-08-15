package week7.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_CreateLead extends BaseClass {

	@BeforeTest
	public void fileNameRead() {
		fileName = "createLead.xlsx";
	}
	
	@Test(dataProvider = "fetchData")
	public void CreteLead(String companyName, String firstName, String lastName) {
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		
		
		driver.close();		
	}
}

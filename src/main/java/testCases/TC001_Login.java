package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.CRMSFAPage;
import pages.LoginPage;

public class TC001_Login extends BaseClass{

	@Test
	public void testCase001() {
		
		LoginPage objLoginPage = new LoginPage()
								  .enterUserName()
								  .enterPassword()
								  .clickOnLogin()
								  .clickOnCrmSfa()
								  .validateHomePage();
		
	}
}

package week6.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenFlikart extends BaseClass {

	@Test
	public void openKart()
	{

		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822158294!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=EAIaIQobChMI57vb-cPb_wIVsJlmAh09-gBFEAAYASAAEgJdgPD_BwE");
		
		
	}
	
}

package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static ChromeDriver driver;
	
	@BeforeMethod
	public void launchBrower()
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.close();
	}
	
	
}

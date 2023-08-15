package week6.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	ChromeDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver = new ChromeDriver();
		EdgeDriver driver2 = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterMethod
	public void afterMethod()
	{ 
		
		driver.close();
	}
	
}

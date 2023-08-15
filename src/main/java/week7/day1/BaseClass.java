package week7.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
	
	WebDriver driver;
	static String fileName;

	@BeforeMethod
	@Parameters({"url","userName","password","browser"})
	public void login(String url, String user, String password, String browser)
	{
		
		if(browser.equals("chrome")) {
			 driver = new ChromeDriver();
		}
		else {
			  driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(user);
		
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(password);
		
		WebElement clickButton = driver.findElement(By.className("decorativeSubmit"));
		
		clickButton.click();
		
		
	}
	
	
	@DataProvider(name="fetchData")
	public Object data() throws IOException {
		
		GetExcelData obj = new GetExcelData();
		
		return obj.readExcelData(fileName);
		
	}
}

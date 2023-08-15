package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	ChromeDriver driver;
	
	@Before
	public void method1() {
		System.out.println("BEFORE================");
	}
	
	@After
	public void method2()
	{
		System.out.println("AFTER===============");
	}
	
	@Given ("Launch the browser")
	public void login()
	{
		
	   driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
	}
	
	@And ("Enter the userName as {string}")
	public void enterUserName(String user) {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(user);
		
		
		
	}
	
	@And ("Enter the password as {string}")
	public void enterPassword(String passWord) {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(passWord);
		
		
	}
	
	@When ("click on login button")
	public void clickLogin() {
		WebElement clickButton = driver.findElement(By.className("decorativeSubmit"));
		
		clickButton.click();
		
	}

}

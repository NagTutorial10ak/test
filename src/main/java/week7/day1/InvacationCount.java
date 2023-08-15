package week7.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvacationCount {

	@Test(invocationCount = 6, threadPoolSize = 3)
	public void method6() {
		ChromeDriver driver = new ChromeDriver();
		System.out.println("playwright");
		driver.get("https://www.google.com/");
		driver.close();
	}
}

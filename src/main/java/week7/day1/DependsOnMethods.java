package week7.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bytecode.Throw;

public class DependsOnMethods {
	
	@Test()
	public void method2() {
		System.out.println("Testing");
	}
	@Test
	public void method3() {
		System.out.println("selenium");
	}
	@Test(timeOut = 5000)
	public void method4() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println("TestNg");
	}
	@Test()
	public void method5() throws Exception {
		System.out.println("cucumber");
		
		
		throw new Exception();
		
	
	}
	@Test(dependsOnMethods = "method5", alwaysRun = true)
	public void method6() {
		System.out.println("playwright");
	}

}

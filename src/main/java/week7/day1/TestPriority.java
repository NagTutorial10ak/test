package week7.day1;

import org.testng.annotations.Test;

public class TestPriority {
	
	@Test(priority = 1)
	public void method2() {
		System.out.println("Testing");
	}
	@Test
	public void method3() {
		System.out.println("selenium");
	}
	@Test(priority = -2)
	public void method4() {
		System.out.println("TestNg");
	}
	@Test(priority = 2)
	public void method5() {
		System.out.println("cucumber");
	}
	@Test(priority = 4)
	public void method6() {
		System.out.println("playwright");
	}

}

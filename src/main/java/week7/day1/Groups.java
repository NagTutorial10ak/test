package week7.day1;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups = {"smoke"})
	public void method2() throws Exception {
		System.out.println("Testing");
		throw new Exception();
	}
	@Test(groups = {"smoke"})
	public void method3() {
		System.out.println("selenium");
	}
	@Test(groups = {"Regression"}, dependsOnGroups = {"smoke"})
	public void method4() {
		System.out.println("TestNg");
	}
	@Test(groups = {"Regression"}, dependsOnGroups = {"smoke"})
	public void method5() {
		System.out.println("cucumber");
	}
	@Test(groups = {"Regression"}, dependsOnGroups = {"smoke"})
	public void method6() {
		System.out.println("playwright");
	}
	@Test(groups = {"Regression"}, dependsOnGroups = {"smoke"})
	public void method7() {
		System.out.println("cypress");
	}

}

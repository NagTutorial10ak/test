package pages;

import base.BaseClass;

public class HomePage extends BaseClass{

	public LoginPage validateHomePage() {
		
		String title = driver.getTitle();
		System.out.println(title);
		return null;
		
	}
}

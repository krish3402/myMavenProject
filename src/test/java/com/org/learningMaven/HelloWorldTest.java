package com.org.learningMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {
	
	@Test
	public void Login() {
		System.out.println("Login into the account"); 
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\$krish$\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get("http://www.mkcreative.ga");
	}

}

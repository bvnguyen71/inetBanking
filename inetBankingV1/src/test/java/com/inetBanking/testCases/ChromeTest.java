package com.inetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	
	@Test
	public void LaunchChrome_Method1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuan\\eclipse-workspace\\inetBankingV1\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
}
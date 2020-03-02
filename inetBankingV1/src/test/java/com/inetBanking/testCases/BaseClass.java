package com.inetBanking.testCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class BaseClass {
	
	
	 public String baseURL="http://demo.guru99.com/v4/"; 
	 public String username="mngr248507";
     public String password="bUjygud"; 
     public static WebDriver driver;
	 
	 @BeforeClass 
	 //@Test
	 public void setup() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\tuan\\eclipse-workspace\\inetBankingV1\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get(baseURL);
	}

	 @AfterClass 
	 public void tearDown() 
	 { 
		 driver.quit();
	 }
}
  
 

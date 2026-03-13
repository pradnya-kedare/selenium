package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
System.setProperty("webdriver.chrome.driver","C:/Users/Pradnya/eclipse-workspace/selenium/Drivers/chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
driver.get("https://www.google.com");
	}

}

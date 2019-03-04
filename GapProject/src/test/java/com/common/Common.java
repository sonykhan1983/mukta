package com.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Common {
private static String URL="https://www.gap.com/browse/home.do?ssiteID=GAP";
public static String getURl() {
	return URL;}
WebDriver driver;

public static WebDriver getbrowser (String browserName, WebDriver driver) {
	if (browserName.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriber.chrome.driver","./Driver/chromedriver");
	driver = new ChromeDriver();}
	if (browserName.equalsIgnoreCase("opera")) {
		driver=new OperaDriver();}
	else if (browserName.equalsIgnoreCase("geckodriver")) {
		driver=new FirefoxDriver();
	}
	
	return driver;
	
}
}

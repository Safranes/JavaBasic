package com.neotech.lesson25;

interface WebDriver{
	void open();
	void close();
	String getTitle();
	
}

interface TakesScreenshot{
	void getScreenshot();
	
}

interface RemoteWebDriver extends WebDriver,TakesScreenshot{
	void navigate();
	
}

public class Homework2 {
public static void main(String[] args) {
	ChromeDriver chrome= new ChromeDriver();
	chrome.open();
	
	FirefoxDriver firefox=new FirefoxDriver();
	firefox.close();
	
	SafariDriver safari=new SafariDriver();
	safari.getScreenshot();
	
	RemoteWebDriver remoteS=safari;
	remoteS.close();
	
	RemoteWebDriver remoteF=firefox;
	remoteF.navigate();
	RemoteWebDriver remoteC=chrome;
	remoteC.getTitle();
	

}
	
}

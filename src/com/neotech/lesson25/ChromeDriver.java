package com.neotech.lesson25;

class ChromeDriver implements RemoteWebDriver
{

	@Override
	public void open() {

		System.out.println("Chrome driver opened!");		
	}

	@Override
	public void close() {
		System.out.println("Chrome driver closed!");		
	}

	@Override
	public String getTitle() {

		return "Neotech Academy";
	}

	@Override
	public void getScreenshot() {

		System.out.println("Screenshot taken in Chrome!");
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to another page in Chrome!");
	}
	
}

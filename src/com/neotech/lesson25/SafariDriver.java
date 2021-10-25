package com.neotech.lesson25;

class SafariDriver implements RemoteWebDriver
{

	@Override
	public void open() {

		System.out.println("Safari driver opened!");		
	}

	@Override
	public void close() {
		System.out.println("Safari driver closed!");		
	}

	@Override
	public String getTitle() {

		return "Neotech Academy";
	}

	@Override
	public void getScreenshot() {

		System.out.println("Screenshot taken in Safari!");
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to another page in Safari!");
	}
	
}

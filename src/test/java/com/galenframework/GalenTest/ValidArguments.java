package com.galenframework.GalenTest;

public class ValidArguments {

	
	public void verifyValidBrowserArgument(String browser) {

		if(browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("chrome") || browser.equalsIgnoreCase("ie")){

			System.out.println("Driver is set to successfully :*************" + browser);
		}
		else{
			System.out.println("Invalid Browser Argument:- "+browser);
			System.exit(0);

		}
	}
	public void verifyValidViewPointArgument(String viewpoint) {

		if(viewpoint.equalsIgnoreCase("desktop") || viewpoint.equalsIgnoreCase("tab") || viewpoint.equalsIgnoreCase("mobile")){

			System.out.println("ViewPoint is set to successfully :*************"+viewpoint);
		}
		else{
			System.out.println("Invalid ViewPoint Argument:- "+viewpoint);
			System.exit(0);
		}
	}	
	
}

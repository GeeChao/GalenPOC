package com.galenframework.GalenTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.galenframework.testng.GalenTestNgTestBase;

public class LayoutTest extends GalenTestNgTestBase {

	ValidArguments validAr = new ValidArguments();
	public static List<String> tags = new ArrayList<String>();
	LoginPage_en loginPage_en = new LoginPage_en();
	Initializer ini = new Initializer();

	@Override
	public WebDriver createDriver(Object[] args) {
		return null;
	}

	@Parameters({"browser","viewpoint"})
	@BeforeTest
	public void initialize(String browser, String viewpoint) throws IOException{
		System.out.println("Inside Before Test Annotation");
		validAr.verifyValidBrowserArgument(browser);
		validAr.verifyValidViewPointArgument(viewpoint);
		}
	
	@Parameters({"browser","viewpoint"})
	@Test
	public void LoginPageLayout(String browser, String viewpoint) throws IOException{
		System.out.println("Inside Test Annotation");
		driver.set(ini.initiateDriver(browser));
		tags.add(viewpoint);
		ini.setDimension(viewpoint,driver);
		ini.lauchURL(driver);
		checkLayout("/specs/LoginPage.gspec", tags);
		}


	@AfterMethod
	public void closeBrowserSession(){
		System.out.println("###### Inside After Method Annotation ######");
		driver.get().close();
	}

}

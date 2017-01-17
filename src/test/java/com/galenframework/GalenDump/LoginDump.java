package com.galenframework.GalenDump;

import java.io.IOException;
import net.mindengine.galen.api.Galen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.galenframework.testng.GalenTestNgTestBase;

public class LoginDump extends GalenTestNgTestBase {

	public static WebDriver driver = null;

	@Override
	public WebDriver createDriver(Object[] args) {
		driver = new FirefoxDriver();
		return driver;
	}

	@Test
	public void DashboardLogin() throws IOException, InterruptedException {
		load("http://www.linkedin.com",320,480);
		Galen.dumpPage(driver,"LoginPage","/specs/LoginPageDump.gspec","dumps/Login-dump",400,400);
		System.out.println("Linkedin Login page dump is  Done!");
	}

}

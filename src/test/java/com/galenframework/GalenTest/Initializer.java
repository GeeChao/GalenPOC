package com.galenframework.GalenTest;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Initializer {

	public WebDriver initiateDriver(String browserName) {
		WebDriver driver = null;
		if ("firefox".equalsIgnoreCase(browserName)){
			driver = new FirefoxDriver();
		}
		else if ("chrome".equalsIgnoreCase(browserName)){
			System.setProperty("webdriver.chrome.driver", "system path to chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if ("ie".equalsIgnoreCase(browserName)){
			System.setProperty("webdriver.ie.driver", "system path to IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;

	}

	public void setDimension(String viewpoint, ThreadLocal<WebDriver> driver) {
		if(viewpoint.equalsIgnoreCase("tab")){
			Dimension dimension = new Dimension(800,600);
			driver.get().manage().window().setSize(dimension);
		}
		else if(viewpoint.equalsIgnoreCase("desktop")){
			driver.get().manage().window().maximize();
		}
		else if(viewpoint.equalsIgnoreCase("mobile")){
			Dimension dimension = new Dimension(320,480);
			driver.get().manage().window().setSize(dimension);
		}

	}


	public void lauchURL(ThreadLocal<WebDriver> driver) throws IOException {
			String url  = "http://www.linkedin.com";
			driver.get().get(url);
		}

}

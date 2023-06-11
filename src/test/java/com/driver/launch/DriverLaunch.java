package com.driver.launch;

import java.lang.invoke.SwitchPoint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverLaunch {

	
	public WebDriver driver;
	public static DriverLaunch launchInstance = null;
	private DriverLaunch()
	{
		
	}
	public static DriverLaunch GetInstance()
	{
		if(launchInstance==null)
		{
			launchInstance = new DriverLaunch();
		}
		return launchInstance;
		
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	public void DriverThrash()
	{
		driver.quit();
	}
	
	
	public WebDriver DriverLaunch(String BrowserNAme)
	{
		switch (BrowserNAme) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
		return driver;		
	}
	
	
	
	
	
	
}

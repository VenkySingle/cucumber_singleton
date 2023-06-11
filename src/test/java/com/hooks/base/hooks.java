package com.hooks.base;


import java.util.Properties;

import org.openqa.selenium.WebDriver;


import com.commonutils.common.CommonClass;
import com.commonutils.common.Logs;
import com.driver.launch.DriverLaunch;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.*;

public class hooks {
	
	public WebDriver driver;
	public Properties prop;
	public Properties prop1;
	public static String scenarioname;

	@Before()
	public void base(Scenario scenario)
	{
		scenarioname = scenario.getName();
		System.out.println(scenarioname);
	
		prop =  CommonClass.GetInstance().PropertyInitialize("URL");
		 prop1 = CommonClass.GetInstance().PropertyInitialize("Browser");
	   //driver = DriverLaunch.GetInstance().getDriver();
	  // if (DriverLaunch.GetInstance().getDriver()==null)
	   //{
		 
		  driver = DriverLaunch.GetInstance().DriverLaunch(prop1.getProperty("browser"));
		  driver.get(prop.getProperty("url"));
		  driver.manage().window().maximize();
		  Logs.GetInstance().Execstart(scenarioname);
		  CommonClass.GetInstance().initElements();
		  CommonClass.GetInstance().ReportInitialisation(scenarioname);
		  System.out.println("Before completed");
		  CommonClass.GetInstance().CreateTest(scenarioname, "Venky", "Func");
		  Logs.GetInstance().info("Report started");
		  
		  
		  
	//   }
	}


	@After
	public void tear()
	{
	    CommonClass.GetInstance().ReportSave();
		System.out.println("In after");
		driver = DriverLaunch.GetInstance().getDriver();
		System.out.println(driver);
		DriverLaunch.GetInstance().DriverThrash();
		//CommonClass.GetInstance().impwait();
		//DriverLaunch.GetInstance().DriverThrash();
	}

}

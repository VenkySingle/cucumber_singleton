package com.commonutils.common;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.aventstack.extentreports.model.Log;

public class Logs {
	
	public static Logger logger = Logger.getLogger(Log.class);
	public static Logs LogInstance;
	
	public static Logs GetInstance()
	{
		if(LogInstance==null)
		{
			LogInstance = new Logs();
		}
		return LogInstance;
	}
	
	
	public  void Execstart(String Tc)
	{
		PropertyConfigurator.configure("./log4j.properties");
		logger.info("================="+Tc+"=========");
	}
	public  void Execend(String Tc)
	{
		PropertyConfigurator.configure("./log4j.properties");
		logger.info("================="+Tc+"=========");
	}
	
	public  void info(String msg)
	{
		PropertyConfigurator.configure("./log4j.properties");
		logger.info(msg);
	}
	
	public  void warn(String msg)
	{
		PropertyConfigurator.configure("./log4j.properties");
		logger.warn(msg);
	}
	public  void fatal(String msg)
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.fatal(msg);
	}
	
	public   void error(String msg)
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.error(msg);
	}
	
	
	
	

}

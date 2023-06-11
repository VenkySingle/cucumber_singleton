package com.pageobjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.commonutils.common.CommonClass;

public class LoginPage {
	
	
	public static LoginPage LoginPageInstance;
	
	private LoginPage()
	{
		
	}

	public static LoginPage getInstance()
	{
		if (LoginPageInstance==null)
		{
			LoginPageInstance = new LoginPage();
		}
		return LoginPageInstance;
	}
	
	
@FindBy(how=How.XPATH,using = "//input[@name='uname']")
private WebElement uname;

@FindBy(how=How.XPATH,using = "//input[@name='pass']")
private WebElement pass;

@FindBy(how=How.XPATH,using = "//input[@type='submit'][@value='login']")
private WebElement loginbtn;

@FindBy(how=How.XPATH,using = "//label")
private WebElement expected;

@FindBy(how=How.XPATH,using = "//h3[starts-with(text(),'If')]")
private WebElement expectedfail;

public void doEnterusername( String val)
{
	try{
		CommonClass.GetInstance().sendkeys(uname, val);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void doEnterpassword( String val)
{
	try{
		CommonClass.GetInstance().sendkeys(pass, val);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void doclicklogin()
{
	try{
		CommonClass.GetInstance().click(loginbtn);
		CommonClass.GetInstance().impwait();
		//CommonClass.GetInstance().AlertAccept();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public void doValidation(String Actual)
{
	try{
		String expected1 = expected.getText();
		CommonClass.GetInstance().ValidationAssert(expected1, Actual);
		CommonClass.GetInstance().impwait();
		//CommonClass.GetInstance().AlertAccept();

		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void doValidationforfail(String Actual)
{
	try{
		String expectedfails = expectedfail.getText();
		CommonClass.GetInstance().ValidationAssert(expectedfails, Actual);
		CommonClass.GetInstance().impwait();
		//CommonClass.GetInstance().AlertAccept();

		
	}
	//If you are already registered please enter your login information below:
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	
}

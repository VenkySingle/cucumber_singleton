package com.stepdef.steps;

import com.commonutils.common.CommonClass;
import com.pageobjects.pages.LoginPage;

import io.cucumber.java.en.*;

public class Login {

	@Given("Enter username as {string}")
	public void enterUsernameAs(String string) {
	    try{
	    	LoginPage.getInstance().doEnterusername(string);
	    	CommonClass.GetInstance().ReportGen("pass", "Un entered successfully");
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	CommonClass.GetInstance().ReportGen("fail", "Un not entered successfully");
	    }
	}
	@Given("password as {string}")
	public void passwordAs(String string) {
	    try{
	    	LoginPage.getInstance().doEnterpassword(string);
	    	CommonClass.GetInstance().ReportGen("pass", "password entered successfully");
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	CommonClass.GetInstance().ReportGen("fail", "Pass not entered successfully");
	    }
	}
	@When("clicking login button")
	public void clickingLoginButton() {
	    try{
	    	LoginPage.getInstance().doclicklogin();
	    	CommonClass.GetInstance().ReportGen("pass", "Login btn clicked successfully");
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	CommonClass.GetInstance().ReportGen("fail", "Login btn not clicked successfully");
	    }
	}
	@Then("Login is successful and validation is success as {string}")
	public void loginIsSuccessful(String args) {
	    try{
	    	System.out.println("success");
	    	CommonClass.GetInstance().impwait();
	    	LoginPage.getInstance().doValidation(args);
	    	CommonClass.GetInstance().ReportGen("pass", "Assertion success");
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	CommonClass.GetInstance().ReportGen("fail", "Assertion fail");
	    }
	}
	@Then("Login is successful and validation is successful as {string}")
	public void loginIsSuccessfull(String args) {
	    try{
	    	System.out.println("success");
	    	CommonClass.GetInstance().impwait();
	    	LoginPage.getInstance().doValidationforfail(args);
	    	CommonClass.GetInstance().ReportGen("pass", "Assertion success");
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	CommonClass.GetInstance().ReportGen("fail", "Assertion fail");
	    	
	    }
	}
	
	
	
}

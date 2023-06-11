package com.pageobjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.commonutils.common.CommonClass;

public class Workpage {


public static Workpage workInstance;

private Workpage()
{
	
}
public static Workpage getInstance()
{
	
	if(workInstance==null)
	{
		workInstance = new Workpage();
	}
	return workInstance;
}
	
@FindBy(how=How.XPATH,using = "//a[contains(text(),'yo')]" )
private WebElement mycart;

@FindBy(how=How.XPATH,using = "//h3[contains(text(),'T')]" )
private WebElement mycartamt;

public void mycartclick()
{
  CommonClass.GetInstance().click(mycart);
  
}

public String mycartamt()
{
 System.out.println(mycartamt.getText()); 
 String b = mycartamt.getText();
 return b;
}



	
	
}

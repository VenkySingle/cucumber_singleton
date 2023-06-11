package com.stepdef.steps;

import java.util.List;

import com.commonutils.common.CommonClass;
import com.pageobjects.pages.Workpage;

import io.cucumber.java.en.*;

public class Work {
	
	@When("Clicking Cart")
	public void clickingCart() {
	   try{
		   Workpage.getInstance().mycartclick();
		   CommonClass.GetInstance().ReportGen("pass", "Cart clicked");
		   //throw new ArithmeticException();
	   }
	   catch(Throwable t)
	   {
		   CommonClass.GetInstance().ReportGen("fail", "Cart not clicked");
	   }
	}
	@Then("Find the Price")
	public void findThePrice(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Floach t,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> ll = dataTable.asLists();
		String a = ll.get(1).get(0);
		String b = Workpage.getInstance().mycartamt();
		if(a.equalsIgnoreCase(b))
		{
			CommonClass.GetInstance().ReportGen("pass", "success");	
			}
		else
		{
			CommonClass.GetInstance().ReportGen("fail", "fail"+b+"is the actual text"+a+"is the expectd");	
		}
		
		
	
	}

	

}

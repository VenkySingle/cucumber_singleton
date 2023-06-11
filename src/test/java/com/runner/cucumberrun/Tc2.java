package com.runner.cucumberrun;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@Test
@CucumberOptions(
		features = "./src/test/Resources/Work.feature",
		glue = {"com.hooks.base","com.stepdef.steps"},
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		monochrome = true,
		plugin={"pretty","html:cucumber-reports/cucumber_tc1.html"}
		
		
		)







public class Tc2 extends AbstractTestNGCucumberTests {
/*	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	*/

}

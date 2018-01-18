package com.usa.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
	features = {"Featuer"},
	glue = {"com.usa.stepdef"},
	tags = {"@register"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
	
}



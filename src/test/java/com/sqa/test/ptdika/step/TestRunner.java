package com.sqa.test.ptdika.step;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/",
				glue="",
				plugin={"pretty","html:target/cucumber-reports.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

}

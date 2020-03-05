package com.runner.pack;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.GenerateReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\AddactinLoginFeature.feature", glue = {
		"com.stepdef" }, monochrome = true, dryRun = false, plugin = {
				"json:src\\test\\resources\\Report\\ClientReport.json" })

public class AddactinRunnerClass {

	@AfterClass
	public static void afterclass() {
		GenerateReport.JVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Report\\ClientReport.json");
	}

}

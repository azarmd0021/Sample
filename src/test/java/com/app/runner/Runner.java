package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\MAVEN\\CucumberTesting\\src\\test\\java\\com\\app\\feature",
glue="com.app.stepdefition",
dryRun=false,
tags="@Tag_Scenario_Outline"
)

public class Runner {

}

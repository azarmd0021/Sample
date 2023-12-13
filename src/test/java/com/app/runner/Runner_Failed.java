package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failedrerun.txt",
glue="com.app.stepdefition",
dryRun=false,
tags=" @Smoke",
monochrome=true,
plugin= {"rerun:target/failedrerun.txt"})

public class Runner_Failed {

}

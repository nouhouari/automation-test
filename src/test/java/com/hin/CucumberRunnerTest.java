package com.hin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features="src/test/resources/features")
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
    
}

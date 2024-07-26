package org.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ={"\\src\\test\\resources\\cucumber\\Multiple.feature","src\\test\\resources\\cucumber\\flipkart.feature"},glue={"org.Step","com.hooks"},tags ="@Smoke and @Regression")
public class MultipleScenario {

}

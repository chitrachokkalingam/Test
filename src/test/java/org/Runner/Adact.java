package org.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\cucumber\\Adact.feature",glue="org.Step")
public class Adact {

}

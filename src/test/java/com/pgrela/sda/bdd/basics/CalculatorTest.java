package com.pgrela.sda.bdd.basics;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;

@CucumberOptions(plugin = { "pretty" }, features = "src/test/features")
@RunWith(Cucumber.class)
public class CalculatorTest {
}

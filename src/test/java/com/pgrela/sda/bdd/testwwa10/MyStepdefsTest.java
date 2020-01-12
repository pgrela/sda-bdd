package com.pgrela.sda.bdd.testwwa10;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

@CucumberOptions(
        //tags = "@smokeTest",
        //plugin = {"pretty"},
        features = "src/test/features/add-photo.feature"
)
@RunWith(Cucumber.class)
public class MyStepdefsTest {

}
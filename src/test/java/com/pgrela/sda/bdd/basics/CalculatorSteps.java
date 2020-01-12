package com.pgrela.sda.bdd.basics;

import io.cucumber.java.Before;
import io.cucumber.java.ca.Cal;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorSteps {
    Calculator calculator;

    @Before
    public void iHaveACalculatorInHand() {
        System.out.println("ok");
        calculator = new Calculator();
    }

    @Then("^I have a calculator$")
    public void iHaveACalculator() {
        calculator = new Calculator();
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void iAddAnd(int a, int b) {
        calculator.add(a, b);
    }

    @Then("I see {int} as a result")
    public void iSeeAsAResult(int difference) {
        Assertions.assertEquals(difference, calculator.lastResult());
        calculator = null;
    }

    @When("I sub {int} and {int}")
    public void iSubAAndB(int a, int b) {
        calculator.sub(a, b);
    }
}

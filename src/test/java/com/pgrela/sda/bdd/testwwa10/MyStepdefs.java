package com.pgrela.sda.bdd.testwwa10;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MyStepdefs {

    @Before()
    public void createWebDriver(){
        System.out.println("Tworzę web drivera");
    }

    @Given("^I am logged on facebook$")
    public void iAmLoggedOnFacebook() {
        System.out.println("zalogowałem się do facebooka");
    }

    @And("^a window for adding photos is open$")
    public void aWindowForAddingPhotosIsOpen() {
        System.out.println("Otwieram okno dodawania zdjęć");
    }


    @Then("^photo with description is published on my profile$")
    public void photoWithDescriptionIsPublicatedOnMyProfile() {
        System.out.println("Sprawdzam, czy zdjęcie jest na moim profilu");
    }

    @When("I upload photo with description {string}")
    public void iUploadPhotoWithDescription(String description) {
        System.out.println("Wpisuję opis " + description);
    }

    @When("add {int} to {int} result is {int}")
    //@When("^add (\\d+) to (\\d+) result is (\\d+)$")
    public void addToResultIs(int a, int b, int result) {
        Assertions.assertEquals(result, a + b);
    }
}

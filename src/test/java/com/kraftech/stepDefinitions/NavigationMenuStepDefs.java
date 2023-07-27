package com.kraftech.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {
    @When("Login as Mike")
    public void login_as_mike() {
        System.out.println("login as mike");

    }
    @Then("Validate that Dasboard text is visible")
    public void validate_that_dasboard_text_is_visible() {
        System.out.println("Validate that dashboard is visible");

    }
    @When("Go to developers menu")
    public void go_to_developers_menu() {
        System.out.println("go to developers menu");

    }
    @Then("Validate that Developers text is visible")
    public void validate_that_developers_text_is_visible() {
        System.out.println("Validate that the developers text is visible");

    }
    @When("Login as Sebastian")
    public void login_as_sebastian() {
        System.out.println("login as sebastian");

    }
    @When("Go to forms-Input menu")
    public void go_to_forms_ınput_menu() {
        System.out.println("go to forms input menu");

    }
    @Then("Validate that Genaral Form Elements -Input text is visible")
    public void validate_that_genaral_form_elements_ınput_text_is_visible() {
        System.out.println("validate that general form element input text is visible");

    }
    @When("Login as John")
    public void login_as_john() {
        System.out.println("login as john");

    }
    @When("Go to my profile menu")
    public void go_to_my_profile_menu() {
        System.out.println("go to my profile menu");

    }
    @Then("Verify that User Profile text is visible")
    public void verify_that_user_profile_text_is_visible() {
        System.out.println("validate that user profile text is visible");

    }








}

package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjects;

public class SearchStepDefs {


    PageObjects pageObjects = new PageObjects();

    @Given("user goes to homepage")
    public void userGoesToHomepage() {
    pageObjects.goToHomePage();
    }

    @When("user search for {string}")
    public void userSearchFor(String text) {
       // pageObjects.sendKeysTo(pageObjects.eSearchFieldInput, text+ Keys.ENTER);
        pageObjects.searchProduct(text);
    }

    @Then("products' names should contain {string}")
    public void productsNamesShouldContain(String text) {
        pageObjects.verifyTextInSearchedProducts(text);
    }
}

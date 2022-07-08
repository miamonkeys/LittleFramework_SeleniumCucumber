package steps;

import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DuckDuckGoPage;

public class DuckDuckGoSteps {

    DuckDuckGoPage duckDuckGo = new DuckDuckGoPage();
    
    @Given("^I am on the DuckDuckGo search page.$")
    public void goToDuckDuckGo() throws InterruptedException {
        duckDuckGo.navigateToGoogle();
        //Thread.sleep(5000); //NO USAR SEGUN EL INSTRUCTOR
    }

    @When("^I enter a search criteria.$")
    public void writeSomethingToSearch() {
        duckDuckGo.writeSearchriteria("Vida");
    }

    @And("^I click on the search button.$")
    public void clickSearch() {
        duckDuckGo.clickSearchButton();
    }

    @Then("^The results match the criteria.$")
    public void validateResults() {
        Assert.assertEquals("Vida Home - Vida Health", duckDuckGo.getTextFromElement());
    }

    @Then("Is the country switch displayed?")
    public void switchDisplayed() {
        Assert.assertTrue("Elemento mostrado en la página.",duckDuckGo.isDisplayed());
    }

    @Then("Is the search button enabled?")
    public void searchButtonDisplayed() {
        Assert.assertTrue("Botón habilitado.",duckDuckGo.isEnabled());
    }
}

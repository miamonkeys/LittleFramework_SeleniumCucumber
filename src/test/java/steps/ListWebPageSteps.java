package steps;

import java.util.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListWebPage;

public class ListWebPageSteps {
    ListWebPage gitHubPage = new ListWebPage();

    @Given("I navigate to the list web page.")
    public void navigateToListPage() {
        gitHubPage.navigateToListWebPage();
    }

    @When("^I write (.+).$")
    public void searchInTheList(String stateToSearch) throws InterruptedException {
        Thread.sleep(10);
        gitHubPage.searchText(stateToSearch);
    }

    @Then("^I find (.+) in the list.$")
    public void findMytext(String cityToFind) {
        List<String> listOfResults = gitHubPage.passElementsToList();
        //Buscara en la lista EXACTAMENTE lo que se le pide buscar.
        Boolean elementExists = listOfResults.contains(cityToFind);

        if(elementExists) {
            System.out.println("Texto encontrado en la lista.");
        } else {
            throw new Error("Texto NO encontrado en la lista.");
        }
    }
}

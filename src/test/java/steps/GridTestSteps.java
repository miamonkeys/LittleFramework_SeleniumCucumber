package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GridPage;

public class GridTestSteps {
    
    GridPage grid = new GridPage();

    @Given("^I navigate to the static table.$")
    public void navigateToGrid() {
        grid.navigateToGrid();
    }

    @Then("^I can return the value I wanted.$")
    public void showValueOfCell(){
        String valueOfCell = grid.sendRowColumn(2,2);
        System.out.println(valueOfCell);
    }
}

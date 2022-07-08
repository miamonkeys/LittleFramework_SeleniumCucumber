package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.SandBoxPage;

public class SandBoxSteps {

    SandBoxPage sandBoxPage = new SandBoxPage();

    @Given("^I navigate to the sandbox page.$")
    public void navigateToSandBox() {
        sandBoxPage.navigateToSandBox();
    }

    @And("^Select a value from the dropdown.$")
    public void selectValueFromDropdown () {
        sandBoxPage.selectValueByIndex(2);
    }
}

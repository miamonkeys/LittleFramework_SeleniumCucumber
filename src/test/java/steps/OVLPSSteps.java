package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.OVLPSPage;

public class OVLPSSteps {
    
    OVLPSPage ofiVirtPage = new OVLPSPage();

    @Given("Yo navego a la página principal")
    public void navigateToPage() {
        ofiVirtPage.navigateToOVLPS();
    }

    @When("Yo ignoro el alert box")
    public void dismissAlertBox() {
        ofiVirtPage.ignoreAlertBox();
    }

    @And("Yo escribo mi usuario y contraseña")
    public void enterPassAndUser() {
        ofiVirtPage.sentUserAndPass("servicedesk","Positiva2021$");
    }

    @Then("Yo doy click en el botón ingresar")
    public void clickToLogin() {
        ofiVirtPage.login();
    }
}

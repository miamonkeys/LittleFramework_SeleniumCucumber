package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import pages.AmazonSearchPage;

public class AmazonSearchSteps {

    AmazonSearchPage amazonWebPage = new AmazonSearchPage();

    @Given("^The user navigates to www.amazon.com$")
    public void navigateToWebSite(){
        amazonWebPage.navigateToAmazon();
    }

    @And("^Search for (.+)$")
    public void searchProduct(String product) {
        amazonWebPage.writeProductToSearch(product);
        amazonWebPage.clickSearchButton();
    }

    @And("^Navigates to the second page$")
    public void goToSecondPage() throws InterruptedException {
        amazonWebPage.goToSecondPage();
        Thread.sleep(2000);
    }

    @And("^Selects the (.*) option$")
    public void selectXProduct(Integer productPosition) {
        amazonWebPage.openProduct(productPosition);
    }

    @Then("^The user is able to add it to the cart$")
    public void addToCart() {
        amazonWebPage.addProductToCart();
    }
}

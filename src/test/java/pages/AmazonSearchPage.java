package pages;

import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonSearchPage extends BasePage {
    
    //Constructor
    public AmazonSearchPage(){
        super(webBrowserDriver);
    }

    private String productSearchBox = "//input[@id='twotabsearchtextbox']";
    private String secondPageButton = "div[class*='a-section a-text-center s-pagination-container'] " +
            "span[class*='s-pagination-strip'] " +
            "a[aria-label~='2']";
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String productList =
            "div[class*='s-main-slot s-result-list s-search-results sg-row'] " +
            "h2[class*='a-size-mini a-spacing-none a-color-base s-line-clamp-2'] " +
            "a[class*='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']";

    private String addToCartButton = "//*[@id=\"add-to-cart-button\"]";

    public void navigateToAmazon() {
        navigateTo("https://www.amazon.com/");
    }

    public void writeProductToSearch(String productToSearch) {
        searchCriteria(productSearchBox, productToSearch);
    }

    public void clickSearchButton() {
        clickElementByxpath(searchButton);
    }

    public void goToSecondPage() {
        clickElementByCSS(secondPageButton);
    }

    private String positionOverProduct(Integer indexProduct) {
        //Almacena todos los web elements de los productos en una lista.
        List<WebElement> webElementsList = getWebElementsByCSS(productList);
        //Hace click en el texto que tiene el web element.
        //Esto hace que se ingrese a leer la descripción de un producto.
        return webElementsList.get(indexProduct-1).getText();
    }

    public void openProduct(Integer indexProduct) {
        goToLink(positionOverProduct(indexProduct));
    }

    public void addProductToCart() {
        clickElementByxpath(addToCartButton);
    }

}

package pages;

public class DuckDuckGoPage extends BasePage {

    // xPath del Web Element.
    private String searchButton = "//*[@id=\"search_button_homepage\"]";
    private String searchTextField = "//*[@id=\"search_form_input_homepage\"]";
    private String textOfFirstResult = "//*[@id=\"r1-0\"]/div[2]/h2/a/span";
    private String countrySwitch = "//*[@id=\"links_wrapper\"]/div[1]/div[1]/div/div[1]";

    // Constructor.
    public DuckDuckGoPage() {
        super(webBrowserDriver);
    }

    public void navigateToGoogle() {
        navigateTo("https://duckduckgo.com/");
    }

    public void clickSearchButton() {
        clickElementByxpath(searchButton);
    }

    public void writeSearchriteria(String textToSearch) {
        searchCriteria(searchTextField, textToSearch);
    }
    
    public String getTextFromElement() {
        return getTextFromElement(textOfFirstResult);
    }

    public Boolean isDisplayed() {
        return isDisplayedElement(countrySwitch);
    }

    public boolean isEnabled() {
        return isEnabledElement(searchButton);
    }
}

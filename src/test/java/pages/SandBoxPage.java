package pages;

public class SandBoxPage extends BasePage {

    //xPath del Web Element.
    private String dropdownElement = "//body/div[@id='root']/div[2]/div[3]/main[1]/article[1]/section[5]/div[1]/p[1]/select[1]";

    //Constructor.
    public SandBoxPage() {
        super(webBrowserDriver);
    }

    public void navigateToSandBox() {
        navigateTo("https://developer.mozilla.org/es/docs/Web/HTML/Element/select");
    }

    //Selecciona un valor de un Dropdown por el valor.
    public void selectValueByValue(String selectedValue) {
        selectFromDropDownByValue(dropdownElement, selectedValue);
    }

    //Selecciona un valor de un Dropdown por su índice.
    public void selectValueByIndex(Integer selectedIndex) {
        selectFromDropDownByIndex(dropdownElement, selectedIndex);
    }
}

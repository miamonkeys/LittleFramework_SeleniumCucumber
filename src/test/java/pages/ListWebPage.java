package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ListWebPage extends BasePage {
    
    //Constructor
    public ListWebPage() {
        super(webBrowserDriver);
    }

    //Cuadro de texto donde se escribe lo que se va a buscar.
    private String searchBox = "/html/body/form/input";
    //Elementos <li> de la lista.
    private String listOfResults = "name";

    public void navigateToListWebPage() {
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }

    public void searchText(String textToSearch) {
        searchCriteria(searchBox, textToSearch);
    }

    public List<String> passElementsToList(){
        //Almacenamos en una lista tipo WebWlement lo que nos retorna la
        //función getAllWebElements().
        List<WebElement> webElementsList = getAllWebElements(listOfResults);

        //Instanciamos la lista tipo String que devolvera esta función.
        List<String> listOfElements = new ArrayList<String>();

        //Recorremos la lista tipo WebElement los elementos que vayamos
        //obteniendo los agregamos a la lista tipo String.
        for(WebElement element:webElementsList) {
            listOfElements.add(element.getText());
        }
        return listOfElements;
    }
}

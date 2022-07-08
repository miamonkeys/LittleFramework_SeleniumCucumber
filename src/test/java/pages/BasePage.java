package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    
    protected static WebDriver webBrowserDriver;
    private static WebDriverWait timeToWait;
    private static Actions actionsOnPage;

    static {
        ChromeOptions optionsOfChrome = new ChromeOptions();
        webBrowserDriver = new ChromeDriver(optionsOfChrome);
    }

    //Constructor.
    public BasePage(WebDriver webBrowserDriver) {
        BasePage.webBrowserDriver = webBrowserDriver;
        BasePage.timeToWait = new WebDriverWait(webBrowserDriver, java.time.Duration.ofSeconds(10));
    }

    //Cierra el navegador.
    public static void closeBrowser() {
        webBrowserDriver.quit();
    }

    //Método para navegar a un sitio web.
    public static void navigateTo(String url) {
        webBrowserDriver.get(url);
    }

    //Método que retorna un Web Element ubicado por su xpath
    private WebElement find(String locator) {
        return timeToWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    //Método para hacer click a un Web Element.
    public void clickElementByxpath(String locator) {
        find(locator).click();
    }

    //Método para escribir texto en el cuadro de busqueda.
    public void searchCriteria(String locator, String textToWrite) {
        find(locator).clear(); //Limpia la caja de busqueda antes de buscar.
        find(locator).sendKeys(textToWrite);
    }

    //Metodo para seleccionar un valor de un Dropdown.
    public void selectFromDropDownByValue(String locator, String valueSelected) {
        Select dropDown = new Select(find(locator));

        dropDown.selectByValue(valueSelected); //Seleccionamos el valor buscado.
    }

    //Metodo para seleccionar un valor de un Dropdown (por el índice).
    public void selectFromDropDownByIndex(String locator, Integer indexSelected) {
        Select dropDown = new Select(find(locator));

        dropDown.selectByIndex(indexSelected); //Seleccionamos el valor buscado.
    }

    //Método para hacer hover sobre un web element.
    public void hoverElement(String locator) {
        actionsOnPage.moveToElement(find(locator));
    }

    //Método para hacer doble click sobre un web element.
    public void doubleClickElement(String locator) {
        actionsOnPage.doubleClick(find(locator));
    }

    //Método para hacer click derecho sobre un web element.
    public void rightClickElement(String locator) {
        actionsOnPage.contextClick(find(locator));
    }

    //Método para obtener el valor de una celda de una tabla.
    public String getValueFromCell(String locator, Integer row, Integer column) {
        String cellINeed = locator + "/tbody/tr[" + row + "]/td[" + column + "]";
        return find(cellINeed).getText();
    }

    //This shit only works with web elements like text boxes.
    public void setValueToCell(
    String locator, 
    Integer row, 
    Integer column, 
    String valueToSet) {
        String cellIneed = locator + "/tbody/tr[" + row + "]/td[" + column + "]/input";
        find(cellIneed).sendKeys(valueToSet);
    }

    //Ignorar "alert boxes" de la página.
    public void dismissAlertBox() {
        webBrowserDriver.switchTo().alert().dismiss();
    }

    //Obtener el texto de un web element.
    public String getTextFromElement(String locator) {
        return find(locator).getText();
    }

    //Valida si un elemento web está visualizable.
    public Boolean isDisplayedElement(String locator) {
        return find(locator).isDisplayed();
    }

    //Valida si un elemento está habilitado.
    public Boolean isEnabledElement(String locator) {
        return find(locator).isEnabled();
    }

    //Retorna todos los elementos de una lista identificados por el nombre de la calse.
    public List<WebElement> getAllWebElements(String locator) {
        return webBrowserDriver.findElements(By.name(locator));
    }

    //Retorna una lista de elementos identificados por sus atributos y valores CSS.
    public List<WebElement> getWebElementsByCSS(String CSSAtribVal) {
        return webBrowserDriver.findElements(By.cssSelector(CSSAtribVal));
    }

    //Retorna un web element identificado por sus atributos y valores CSS
    private WebElement getWebElementByCSS(String CSSAtribVal) {
        return webBrowserDriver.findElement(By.cssSelector(CSSAtribVal));
    }

    //Hace click a un web element identificado por sus atributos y valores CSS
    public void clickElementByCSS(String CSSAtribVal) {
        getWebElementByCSS(CSSAtribVal).click();
    }

    //Hace click a un elemento que tenga el texto que se le envia.
    public void goToLink(String textOfElement) {
        webBrowserDriver.findElement(By.linkText(textOfElement)).click();
    }
}

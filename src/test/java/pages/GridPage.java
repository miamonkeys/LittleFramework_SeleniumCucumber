package pages;

public class GridPage extends BasePage {

    // Constructor.
    public GridPage() {
        super(webBrowserDriver);
    }

    private String tableXPath = "//*[@id=\"content\"]/article/section[5]/div/div[3]/table";

    public void navigateToGrid() {
        navigateTo("https://developer.mozilla.org/es/docs/Web/HTML/Element/table");
    }

    public String sendRowColumn(
        Integer row, 
        Integer column) {
        return getValueFromCell(tableXPath, row, column);
    }

    public void sendRowColumnToSet(
        Integer row, 
        Integer column, 
        String valueToSet) {
        setValueToCell(tableXPath, row, column, valueToSet);
    }
}

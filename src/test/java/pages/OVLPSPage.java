package pages;

public class OVLPSPage extends BasePage {

    //Constructor
    public OVLPSPage() {
        super(webBrowserDriver);
    }

    private String userTextField = "/html/body/form/table/tbody/tr[2]/td[1]/div/table/tbody/tr[1]/td[3]/input";
    private String passTextField = "/html/body/form/table/tbody/tr[2]/td[1]/div/table/tbody/tr[2]/td[3]/input";
    private String loginButton = "/html/body/form/table/tbody/tr[2]/td[1]/div/table/tbody/tr[3]/td[2]/button";

    public void navigateToOVLPS() {
        navigateTo("https://srvjavapp.lapositiva.com.pe:7781/workflow/");
    }

    public void ignoreAlertBox() {
        dismissAlertBox();
    }

    public void sentUserAndPass(String user, String pass) {
        searchCriteria(userTextField, user);
        searchCriteria(passTextField, pass);
    }

    public void login() {
        clickElementByxpath(loginButton);
    }
}

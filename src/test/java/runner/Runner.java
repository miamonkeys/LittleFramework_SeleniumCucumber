package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
    monochrome = true,
    //Directorio donde estan los features.
    features = "src/test/resources/features",
    //"Pegamento" donde estan los "steps definitions".
    glue = "steps",
    //Menciona que escenarios se van ejecutar.
    tags = "@Amazon"
)

public class Runner {
    @AfterClass
    public static void finishTest() {
        BasePage.closeBrowser();
    }
}

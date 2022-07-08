package steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import pages.BasePage;

public class Hooks extends BasePage {
    public Hooks() {
        super(webBrowserDriver);
    }

    @After
    public void takeAScreentshot(Scenario testedScenario) {
        if(testedScenario.isFailed()) {
        File screenshot = ((TakesScreenshot) webBrowserDriver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshot, new File("CaptureError"+".png"));    
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

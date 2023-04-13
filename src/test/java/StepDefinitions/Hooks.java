package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonMethods {

    @Before // need to be from Cucumber
    public void preCondition(){
        openBrowserAndLaunchApplication();

    }

    @After
    public void postCondition(){
        closeBrowser();
    }


}

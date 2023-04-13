package Utils;

import StepDefinitions.PageInitializer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class CommonMethods extends PageInitializer {

    public static WebDriver driver;// the purpose of declaring it so can be accessible

    public static void openBrowserAndLaunchApplication() {
        ConfigReader.readProperties(); // this will load the property file

        String browserType = ConfigReader.getPropertyValue("browserType");
        switch (browserType) {
            // if my browser type is Chrome it should launch it
            case "Chrome":
                driver = new ChromeDriver();
                break;
            // if my browser type is Firefox it should launch it
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "IE":
                driver = new InternetExplorerDriver();
                break;

            default:
                driver = new EdgeDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Constants.WAIT_TIME));
        initializePageObjects();// This will initialize all the pages we have in our page , PageInitializer class along with the launching of application
    }

    public static void closeBrowser() {

        driver.close();
    }


    public static void doClick(WebElement element) {
        element.click();
    }

    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static Select clickOnDropdown(WebElement element) {

        // select element from WebElement
        Select select = new Select(element);

        // should return select class object
        return select;
    }

    public static void selectByValue(WebElement element, String value) {
        clickOnDropdown(element).selectByValue(value);

    }

    public static void selectByVisibleText(WebElement element, String text) {
        clickOnDropdown(element).selectByVisibleText(text);
    }

    public static void selectByIndex(WebElement element, int index) {
        clickOnDropdown(element).deselectByIndex(index);
    }

    public static void selectByOption(WebElement element, String text) {
        List<WebElement> options = clickOnDropdown(element).getOptions();
        for (WebElement option : options) {
            String ddlOptionText = option.getText();
            if (ddlOptionText.equals(text)) { //ddl means dropDownList
                option.click();
            }
        }
    }

}




package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  LoginPage extends CommonMethods {
    public LoginPage(){
        // means I want to initialize all these elements using driver on this page
        PageFactory.initElements(driver, this);
    }

    // This will maintain the WebElement of Login page
    // this is page factory model approach between brackets we mention the type of locator used can be CSS, xpath etc
    //WebElement usernameTextBox=driver.findElement(By.id("txtUsername"));
    @FindBy(id = "txtUsername")
    public WebElement usernameTextBox;

    @FindBy(id = "txtPassword")
    public WebElement passwordTextBox;

    @FindBy(id = "btnLogin")
    public WebElement loginBtn;


    @FindBy(id="welcome")
    public WebElement welcomeIcon;

    @FindBy(xpath="//a[text()='Logout']")
    public WebElement logoutLink;

    int x;

    //Page Factory Model Approach to write the webElement in Selenium is better
    // use @FindBy over each WebElement
}

package StepDefinitions;

import Pages.AddEmployeePage;
import Pages.LoginPage;

public class PageInitializer {

    // make it global
    public static LoginPage login;
    public static AddEmployeePage addEmployeePage;

    public static void initializePageObjects() {

        // initializing login page
        login = new LoginPage();
        addEmployeePage = new AddEmployeePage();
    }

}

//This class will manage object creation of different Objects in our Framework.
//Instead of calling the page objects again and again, this class will take good care of that step

// I am going to create a method
// Page Object only holds webElements
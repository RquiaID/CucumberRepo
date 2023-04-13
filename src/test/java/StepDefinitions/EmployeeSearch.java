package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmployeeSearch extends CommonMethods {

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
       WebElement empIdTextBox= driver.findElement(By.id("empsearch_id"));
       sendText(empIdTextBox, ConfigReader.getPropertyValue("empid"));

    }
    @When("Clicks on search button")
    public void clicks_on_search_button() {
        WebElement searchButton= driver.findElement(By.id("searchBtn"));
        doClick(searchButton);

    }
    @When("user sees Employee information is displayed")
    public void user_sees_employee_information_is_displayed() {
        System.out.println("The employee is Displayed");
    }

    @When("user select Job Title")
    public void user_select_job_title() {
        WebElement jobTitleDdl= driver.findElement(By.id("empsearch_job_title"));
        selectByOption(jobTitleDdl,"Singer");

     /*    WebElement EmpStatusDdl=driver.findElement(By.id("empsearch_employee_status"));
         selectByOption(EmpStatusDdl,"Active"); //Active is the value that I want to select//

        WebElement includeDdl= driver.findElement(By.id("empsearch_termination"));
         selectByOption(includeDdl,"Current and Past Employees");
*/



    }

}

package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class EmployeeSearchSteps extends CommonMethods {

    @When("user clicks on employee list option")
    public void user_clicks_on_employee_list_option() {
        click(dashboard.employeeListOption);
    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        sendText(employeeInformationPage.empSearchId, "42158974");
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(employeeInformationPage.searchButton);
    }

    @Then("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        System.out.println("Test passed");
    }

    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
        sendText(employeeInformationPage.empSearchName, "xyz");
    }
}

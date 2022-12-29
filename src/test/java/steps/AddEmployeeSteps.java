package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.math3.analysis.function.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelReader;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AddEmployeeSteps extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        //  WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
     //   pimOption.click();
        click(dashboard.pimOption);
    }

    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {
    //    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //   WebElement addEmployee = driver.findElement(By.xpath("(//*[text()='Add Employee'])[1]"));
     //   addEmployee.click();
        click(dashboard.addEmployeeOption);
    }

    @When("user enters firstName , middleName and lastName")
    public void user_enters_first_name_middle_name_and_last_name() {
    //    WebElement firstNameField = driver.findElement(By.id("firstName"));
    //    firstNameField.sendKeys("abc");
    sendText(add.firstNameField, "anu");
    //   WebElement middleNameField = driver.findElement(By.id("middleName"));
    //   middleNameField.sendKeys("ms");
    sendText(add.middleNameField, "ms");

//       WebElement lastNameField = driver.findElement(By.id("lastName"));
  //     lastNameField.sendKeys("xyz");
        sendText(add.lastNameField, "daksh");

    }

    @When("user cliks on save button")
    public void user_cliks_on_save_button() {
     //   WebElement saveButton = driver.findElement(By.id("btnSave"));
      //  saveButton.click();
        click(add.saveButton);
    }

    @Then("employee addedd succesfully")
    public void employee_addedd_succesfully() {
        System.out.println("Employee added successfully");
    }

    @When("user enters {string} and {string} and {string} from feature file")
    public void user_enters_and_and_from_feature_file
            (String firstName, String middleName, String lastName) {
        sendText(add.firstNameField, firstName);
        sendText(add.middleNameField, middleName);
        sendText(add.lastNameField,  lastName);
    }

    @When("user enters {string} and {string} and {string} from examples file")
    public void user_enters_and_and_from_examples_file
            (String firstName, String middleName, String lastName) {
       sendText(add.firstNameField, firstName);
       sendText(add.middleNameField, middleName);
       sendText(add.lastNameField, lastName);
    }

    @When("user adds multiple employees and verify they are added")
    public void user_adds_multiple_employees_and_verify_they_are_added(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> employeeNames = dataTable.asMaps();
        for (Map<String,String> emp :employeeNames
             ) {
            String firstName = emp.get("firstNameValue");
            String middleName = emp.get("middleNameValue");
            String lastName = emp.get("lastNameValue");

            sendText(add.firstNameField, firstName);
            sendText(add.middleNameField, middleName);
            sendText(add.lastNameField, lastName);
            click(add.saveButton);

            //verification is pending
            Thread.sleep(2000);
            click(dashboard.addEmployeeOption);
            Thread.sleep(2000);
        }
    }

    @When("user add multiple employees from excel sheet {string} and verify them")
    public void user_add_multiple_employees_from_excel_sheet_and_verify_them(String sheetName) throws InterruptedException {
      List<Map<String, String>> newEmployees =
              ExcelReader.excelListIntoMap(Constants.TESTDATA_FILEPATH, sheetName);

        Iterator<Map<String, String>> itr = newEmployees.iterator();
        while (itr.hasNext()){
            Map<String, String> mapNewEmp = itr.next();
            sendText(add.firstNameField, mapNewEmp.get("firstName"));
            sendText(add.middleNameField, mapNewEmp.get("middleName"));
            sendText(add.lastNameField, mapNewEmp.get("lastName"));
            sendText(add.photoFileOption, mapNewEmp.get("photograph"));

            if(!add.checkBox.isSelected()){
                click(add.checkBox);
            }

            sendText(add.usernameOption, mapNewEmp.get("username"));
            sendText(add.passwordOption, mapNewEmp.get("password"));
            sendText(add.confirmPasswordOption, mapNewEmp.get("ConfirmPassword"));
            click(add.saveButton);

            Thread.sleep(2000);
            click(dashboard.addEmployeeOption);
            Thread.sleep(2000);
        }
    }
}

package APISteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class APIStepsFlow {

    String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
    RequestSpecification request;
    Response response;
    public static String employee_id;

    @Given("a request is prepared for getting an employee from the db")
    public void a_request_is_prepared_for_getting_an_employee_from_the_db() {
        request = given().header("Content-Type", "application/json")
                .header("Authorization", GenerateTokenSteps.token)
                .queryParam("employee_id", "45655A");
    }
    @When("a GET call is made to retrieve the created employee")
    public void a_get_call_is_made_to_retrieve_the_created_employee() {
        response = request.when().get("/getOneEmployee.php");
    }
    @Then("the status code for creating an employee is {int}")
    public void the_status_code_for_creating_an_employee_is(int statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }

}

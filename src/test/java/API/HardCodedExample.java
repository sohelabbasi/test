package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class HardCodedExample {


    String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
    String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2NzIyMTA3NDIsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY3MjI1Mzk0MiwidXNlcklkIjoiNDcwOSJ9.Bci5MAuFwToZ4ql4Zg0NzKJ0P-9CQJ3p9H5JpxDOzuc";


    @Test
    public void getCreatedEmployee(){
        //preparing the request
        RequestSpecification preparedRequest = given().header("Content-Type","application/json")
                .header("Authorization", token).
                queryParam("employee_id","45655A");

        //hitting the endpoint to get the response
        Response response = preparedRequest.when().get("/getOneEmployee.php");

        //verifying the status code is 200
        response.then().assertThat().statusCode(200);
        //to print the response
        response.prettyPrint();

    }





}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends CommonMethods {

    @Given("user is able to launch HRMS application")
    public void user_is_able_to_launch_hrms_application() {
       // WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
       // driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       // driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openBrowserAndLaunchApplication();
    }


    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(login.loginButton);
      //  WebElement loginButton = driver.findElement(By.id("btnLogin"));
      //  loginButton.click();
    }

    @Then("user is navigated to dashboard page")
    public void user_is_navigated_to_dashboard_page() {
        System.out.println("Test passed");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
       // LoginPage login = new LoginPage();
       // WebElement usernameField = driver.findElement(By.id("txtUsername"));
      //  WebElement passwordField = driver.findElement(By.id("txtPassword"));

      //  usernameField.sendKeys("admin");
      //  passwordField.sendKeys("Hum@nhrm123");
        sendText(login.usernameField, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordField, ConfigReader.getPropertyValue("password"));
    }

}

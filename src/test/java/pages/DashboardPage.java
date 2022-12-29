package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.PageInitializers;
import utils.CommonMethods;

import java.util.List;

public class DashboardPage extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(xpath="(//*[text()='Add Employee'])[1]")
    public WebElement addEmployeeOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement employeeListOption;

    @FindBy(xpath="//*[@class='menu']/ul/li")
    public List<WebElement> dashboardTabs;

    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }


}

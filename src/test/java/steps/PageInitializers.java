package steps;

import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.EmployeeInformationPage;
import pages.LoginPage;

public class PageInitializers {


    public static LoginPage login;
    public static DashboardPage dashboard;
    public static AddEmployeePage add;
    public static EmployeeInformationPage employeeInformationPage;

    public static void initializePageObjects(){
        login = new LoginPage();
        dashboard = new DashboardPage();
        add =  new AddEmployeePage();
        employeeInformationPage = new EmployeeInformationPage();


    }

}

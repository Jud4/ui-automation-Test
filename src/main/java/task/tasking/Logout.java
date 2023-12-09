package task.tasking;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.DashboardUI;

public class Logout {
    public static void as (WebDriver webDriver, String email, String pass){
        Login.as(webDriver,email,pass);
        Click.on(webDriver,DashboardUI.logout);
    }
}

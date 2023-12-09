package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.DashboardUI;

public class AddTask {
    public static void as (WebDriver webDriver, String email, String pass, String text){
        Login.as(webDriver,email,pass);
        Enter.text(webDriver,DashboardUI.inputTask,text);
        Click.on(webDriver,DashboardUI.addTask);
    }
}

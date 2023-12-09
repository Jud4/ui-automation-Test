package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class Login {
    public static void as (WebDriver webDriver, String email, String pass) {
        Click.on(webDriver, HomePageUI.loginButton);
        Enter.text(webDriver,HomePageUI.loginEmailInput,email);
        Enter.text(webDriver,HomePageUI.loginPassInput,pass);
        Click.on(webDriver,HomePageUI.loginConfirm);
    }
}

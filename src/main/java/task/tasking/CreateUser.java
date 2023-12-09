package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class CreateUser {
    public static void as (WebDriver webDriver, String email, String pass, String username){
        Click.on(webDriver, HomePageUI.signUpButton);
        Enter.text(webDriver,HomePageUI.fullnameInput,username);
        Enter.text(webDriver,HomePageUI.emailInput,email);
        Enter.text(webDriver,HomePageUI.passwordInput,pass);
        Click.on(webDriver,HomePageUI.termsCheckbox);
        Click.on(webDriver,HomePageUI.signUpConfirm);
    }
}

package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.DashboardUI;
import ui.HomePageUI;

public class IsLoginVisible {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, HomePageUI.loginButton);
    }
}

package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.DashboardUI;

public class IsLogoutVisible {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, DashboardUI.logout);
    }

}

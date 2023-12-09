package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.DashboardUI;

public class IsAddedTask {
    public static boolean isVisible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver,DashboardUI.lastTask);
    }
    public static String getTextLastTask(WebDriver webDriver){
        WebElement element = webDriver.findElement(DashboardUI.lastTask);
        return element.getText();
    }
}

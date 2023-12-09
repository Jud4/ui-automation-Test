import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.Logout;
import task.validations.IsLoginVisible;
import task.validations.IsLogoutVisible;

public class LogoutTest extends BaseTest {
    @Test
    public void logoutSuccessful() {
        Logout.as(webDriver, "jurcaner@gsdcs.com", "SuperSecretPassword!");
        Assert.assertTrue(IsLoginVisible.visible(webDriver));
    }
}

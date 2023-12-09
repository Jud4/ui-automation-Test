import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.CreateUser;
import task.tasking.Login;
import task.validations.IsLogoutVisible;

public class LoginTest extends BaseTest {
    @Test
    public void loginSuccessful() {
        Login.as(webDriver, "jurcaner@gsdcs.com", "SuperSecretPassword!");
        Assert.assertTrue(IsLogoutVisible.visible(webDriver));
    }
}

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.CreateUser;
import task.validations.IsLogoutVisible;

public class CreateUserTest extends BaseTest {
    @Test
    public void signUpSuccessful() {
        CreateUser.as(webDriver, "jurcaner@gsdcs.com", "SuperSecretPassword!","Jurcad");
        Assert.assertTrue(IsLogoutVisible.visible(webDriver));
    }
}

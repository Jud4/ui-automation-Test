import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddTask;
import task.validations.IsAddedTask;

public class AddTaskTest extends BaseTest {
    @Test
    public void createdTaskSuccessful() {
        String taskName = "Diplomado V5";
        AddTask.as(webDriver, "jurcaner@gsdcs.com", "SuperSecretPassword!",taskName);
        Assert.assertTrue(IsAddedTask.isVisible(webDriver));
        Assert.assertEquals(IsAddedTask.getTextLastTask(webDriver),taskName);
    }
}

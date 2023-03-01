import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.*;

public class CheckboxTest extends BaseTest {


    @Test
    public void checkboxes() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type=checkbox]"));
        boolean isCheckboxSelected = checkboxes.get(0).isSelected();
        assertFalse(isCheckboxSelected, "First checkbox is unchecked");
        checkboxes.get(0).click();
        isCheckboxSelected = checkboxes.get(0).isSelected();
        assertTrue(isCheckboxSelected, "First checkbox is checked");
        isCheckboxSelected = checkboxes.get(1).isSelected();
        assertTrue(isCheckboxSelected, "Second checkbox is checked");
        checkboxes.get(1).click();
        isCheckboxSelected = checkboxes.get(1).isSelected();
        assertFalse(isCheckboxSelected, "Second checkbox is unchecked");
    }
}
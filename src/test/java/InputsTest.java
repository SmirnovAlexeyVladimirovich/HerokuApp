import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
public class InputsTest extends BaseTest {

    @Test
    public void inputArrows() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        String upKeyResult = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(upKeyResult, "1");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
        String downKeyResult = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(downKeyResult, "-1");
    }

    @Test
    public void inputCharacters() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys("abc");
        String characterResult = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(characterResult, "");
    }

    @Test
    public void inputNumbers() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys("123");
        String numberResult = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(numberResult, "123");
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TypoTest extends BaseTest {

    @Test
    public void checkTypos() {
        driver.get("http://the-internet.herokuapp.com/typos");
           String isThereTypoOrNot = driver.findElements(By.tagName("p")).get(1).getText();
            assertEquals(isThereTypoOrNot, "Sometimes you'll see a typo, other times you won't.",
                    "Error: the word 'won,t' is misspelled");
    }
}

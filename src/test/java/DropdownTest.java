import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {
    @Test
    public void dropdown() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement firstElement = driver.findElement(By.xpath("//select[@id='dropdown']//option[@value='1']"));
        firstElement.click();
        Assert.assertEquals(firstElement.isSelected(), true, "Option 1 is selected");
        WebElement secondElement = driver.findElement(By.xpath("//select[@id='dropdown']//option[@value='2']"));
        secondElement.click();
        Assert.assertEquals(secondElement.isSelected(), true, "Option 2 is selected");
    }
}

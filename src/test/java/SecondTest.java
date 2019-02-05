import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class SecondTest {
@Test
    public void driverIsTheKing(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://compendiumdev.co.uk/selenium");
    assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
}
}

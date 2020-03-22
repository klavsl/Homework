package infrastructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverController
{

    private WebDriver driver;

    public WebDriver getDriver()
    {
        return driver;
    }

    public void setupController()
    {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public void teardownController() {
        if (driver != null) {
            driver.quit();
        }
    }
}

package Tust;

import HelpInterfaces.IAllClasses;
import HelpInterfaces.WebDriverProvider;
import Steps.PracticeForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest implements IAllClasses {
    static WebDriver driver;
    PracticeForm practiceForm;
    WebDriverProvider webDriverProvider;
    @BeforeEach
    void setup() {
        options.setHeadless(false);
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver=new ChromeDriver(options);
        practiceForm=new PracticeForm(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/");
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
/*    @After
    public void lasTeardown() {
        driver.quit();
    }*/
}

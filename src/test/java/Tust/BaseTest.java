package Tust;

import HelpInterfaces.IAllClasses;
import org.junit.AfterClass;
import org.junit.jupiter.api.BeforeEach;

import java.util.concurrent.TimeUnit;

public class BaseTest implements IAllClasses {
    @BeforeEach
    void setup() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/");
    }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }
/*    @AfterAll
    public void lasTeardown() {
        driver.quit();
    }*/
}

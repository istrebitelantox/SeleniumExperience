package SeleniumTools;

import HelpInterfaces.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverHelper implements WebDriverProvider {
    WebDriver driver;
    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("browserName","chrome");
        driver=new RemoteWebDriver(desiredCapabilities);
        return driver;
    }
}
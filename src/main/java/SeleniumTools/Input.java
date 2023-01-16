package SeleniumTools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Input {
    private final WebDriver driver;
    private final WebElement input;
    public Input(WebDriver driver, String id){
        this.driver=driver;
        input=driver.findElement(By.cssSelector("input#"+id));
    }
    public void setText(String text){
        input.sendKeys(text);
    }
}

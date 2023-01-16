package SeleniumTools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Calculating {
    private WebElement element;
    private List<WebElement> elements;
    public Calculating(WebDriver driver, String text, String needElementName){
        elements = driver.findElements(By.cssSelector(text));
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals(needElementName)) {
                element = elements.get(i);
            }
        }
        System.out.println(element.getText());
    }


    public void clickOnElement() {
        element.click();
    }
    public void inputText(String text){
        element.sendKeys(text);
    }
}

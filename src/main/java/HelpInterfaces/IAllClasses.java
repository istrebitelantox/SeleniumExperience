package HelpInterfaces;

import Steps.PracticeForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface IAllClasses {
    WebDriver driver = new ChromeDriver();
    PracticeForm practiceForm =new PracticeForm(driver);
}

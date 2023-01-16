package Steps;

import SeleniumTools.Calculating;
import SeleniumTools.Input;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class PracticeForm {
    WebDriver driver;
    public PracticeForm(WebDriver driver){
        this.driver=driver;
    }
    @Step
    public void openWindow(){
        Calculating calculating=new Calculating(driver,"div.category-cards>div","Forms");
        calculating.clickOnElement();
    }
    @Step
    public void openPracticeForm(){
        Calculating calculating=new Calculating(driver,"ul.menu-list li","Practice Form");
        //WebElement element=driver.findElements(By.cssSelector("ul.menu-list li")).get(9);
        calculating.clickOnElement();
    }

    @Step
    public void setFirstName(String name){
        Input firstName=new Input(driver,"firstName");
        firstName.setText(name);
    }
    @Step
    public void setLastName(String name){
        Input lastName=new Input(driver,"lastName");
        lastName.setText(name);
    }
    @Step
    public void setGender(String gender){
        Calculating calculating=new Calculating(driver,"#genterWrapper label",gender);
        calculating.clickOnElement();
    }
    @Step
    public void setHobie(String hobie){
        Calculating calculating=new Calculating(driver,"#hobbiesWrapper label",hobie);
        calculating.clickOnElement();
    }

}

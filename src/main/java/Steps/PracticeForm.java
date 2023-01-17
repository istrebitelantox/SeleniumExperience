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
        Calculating window=new Calculating(driver,"div.category-cards>div","Forms");
        window.clickOnElement();
    }
    @Step
    public void openPracticeForm(){
        Calculating practiceForm=new Calculating(driver,"ul.menu-list li","Practice Form");
        //WebElement element=driver.findElements(By.cssSelector("ul.menu-list li")).get(9);
        practiceForm.clickOnElement();
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
    public void setEmail(String email){
        Input eMail=new Input(driver,"userEmail");
        eMail.setText(email);
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

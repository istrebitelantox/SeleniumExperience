package Tust;

import HelpInterfaces.IPerson;
import org.junit.jupiter.api.Test;

public class PracticeFormTest extends BaseTest implements IPerson {
    @Test
    public void practiceFormTest(){
        practiceForm.openWindow();
        practiceForm.openPracticeForm();
        practiceForm.setFirstName(person.getFirstName());
        practiceForm.setLastName(person.getLastName());
        practiceForm.setEmail(person.getEmail());
        practiceForm.setGender(person.getGender());
        practiceForm.setHobie(person.getHobie());
    }
}

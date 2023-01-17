package Tust;

import HelpInterfaces.IPerson;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModalDialogsTest extends BaseTest implements IPerson {
    @DisplayName("Тест практической формы")
    @Test
    public void practiceFormTest() {
        practiceForm.openWindow();
        practiceForm.openPracticeForm();
        practiceForm.setFirstName(person.getFirstName());
        practiceForm.setLastName(person.getLastName());
        practiceForm.setGender(person.getGender());
        practiceForm.setHobie(person.getHobie());
    }
}

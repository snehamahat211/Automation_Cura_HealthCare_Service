package Login;

import Base.BaseTest;
import Pages.*;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest {
    @Test
    public void loginTest() {
        MakeAppointment makeAppointment = homepage.clickMakeAppointment();
        makeAppointment.setUsername("John Doe");
        makeAppointment.setPassword("ThisIsNotAPassword");

        AppointmentPage appointmentpage = makeAppointment.clickappointmentButton();
        appointmentpage.selectFacility("Hongkong CURA Healthcare Center");
        appointmentpage.setCheckbox(true);
        appointmentpage.setProgram("Medicaid");
        appointmentpage.setDate("15/11/2025");
        appointmentpage.setComment("i need urgent checkup");
        appointmentpage.clickBookAppointmentButton();


    }


}

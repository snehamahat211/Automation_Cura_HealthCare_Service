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
        AppointmentPage appointmentPage =new AppointmentPage();
    }


}

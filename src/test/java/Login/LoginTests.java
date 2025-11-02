package Login;

import Base.BaseTest;
import Pages.*;
import com.beust.jcommander.JCommander;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest {
    @Test
    public void loginTest() {


        MakeAppointment makeAppointment = homepage.clickMakeAppointment();
        makeAppointment.setUsername("John Doe");
        makeAppointment.setPassword("ThisIsNotAPassword");

        String facility = "Hongkong CURA Healthcare Center";
        String readmission = "Yes";
        String program = "Medicare";
        String date = "15/11/2025";
        String comment = "hello";

        AppointmentPage appointmentpage = makeAppointment.clickappointmentButton();
        appointmentpage.selectFacility(facility);
        appointmentpage.setCheckbox(readmission.equals("Yes"));
        appointmentpage.setProgram(program);
        appointmentpage.setDate(date);
        appointmentpage.setComment(comment);
        BookAppointmentPage confirmationPage = appointmentpage.clickBookAppointmentButton();

        confirmationPage.verifyAppointmentDetails(facility, readmission, program, date, comment);




        confirmationPage.clickBookAppointment();
    }




    }



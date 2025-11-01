package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage {
    private WebDriver driver;
    private By facility1= By.id("combo_facility");
    private By checkbox= By.id("chk_hospital_readmission");
    private By program=By.id("radio_program_medicare");
    private By date=By.id("txt_visit_date");
    private By commment=By.id("txt_comment");

    public AppointmentPage(WebDriver driver) {
        this.driver=driver;
    }
    public void selectFacility(String facility)
    {
        Select facilityDropdown =new Select(driver.findElement(facility1));
        facilityDropdown.selectByVisibleText(facility);

    }
    public void setCheckbox(boolean check){
        WebElement checkboxs =(driver.findElement(checkbox));
        if(check!=checkboxs.isSelected())
        {
            checkboxs.click();
        }
        
    }

}

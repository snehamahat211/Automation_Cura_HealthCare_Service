package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage {
    private WebDriver driver;
    private By facility1= By.id("combo_facility");
    private By checkbox= By.id("chk_hospotal_readmission");
    private By program=By.id("radio_program_medicare");
    private By date=By.id("txt_visit_date");
    private By comment=By.id("txt_comment");
    private By book=By.id("btn-book-appointment");

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

    public void setProgram(String programName)
    {
        if(programName.equals("Medicare")){
            driver.findElement(By.id("radio_program_medicare")).click();

        }else if (programName.equals("Medicaid")){
            driver.findElement(program).click();
        }
        else  {
            driver.findElement(program).click();
        }
    }
    public void setDate(String date1)
    {
        driver.findElement(date).sendKeys(date1);
    }
    public void setComment(String comment1)
    {
        driver.findElement(comment).sendKeys(comment1);
    }
    public BookAppointmentPage clickBookAppointmentButton()
    {
        driver.findElement(book).click();
        return new BookAppointmentPage(driver);
    }


}

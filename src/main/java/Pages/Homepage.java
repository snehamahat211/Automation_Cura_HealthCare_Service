package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    public WebDriver driver;
    public Homepage(WebDriver driver) {
        this.driver = driver;
    }
    public MakeAppointment clickMakeAppointment(){
        clickLink("Make Appointment");
        return new MakeAppointment(driver);
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}

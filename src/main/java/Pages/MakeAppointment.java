package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MakeAppointment {
    private WebDriver driver;
    private By usernameField=By.id("txt-username");
    private By passwordField=By.id("txt-password");
    private By LoginField=By.id("btn-login");

    public MakeAppointment(WebDriver driver) {
        this.driver=driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void AppointmentPage (){
        driver.findElement(LoginField).click();
    }
}

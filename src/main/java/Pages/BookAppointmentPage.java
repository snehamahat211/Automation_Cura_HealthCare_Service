package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookAppointmentPage {
    private WebDriver driver;
    private By facility2= By.id("facility");
    private By redeem2= By.id("hospital_readmission");
    private By program1=By.id("program");
    private By date1=By.id("visit_date");
    private By comment1=By.id("comment");
    private By book1=By.xpath("//*[@id=\"summary\"]/div/div/div[7]/p/a");

    public BookAppointmentPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getfacility(){
        return driver.findElement(facility2).getText();
    }
    public String getredeem(){
        return driver.findElement(redeem2).getText();
    }
    public String getprogram(){
        return driver.findElement(program1).getText();
    }
    public String getdate(){
        return driver.findElement(date1).getText();
    }
    public String getcomment(){
        return driver.findElement(comment1).getText();
    }

}

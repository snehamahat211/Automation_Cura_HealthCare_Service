package Base;

import Pages.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private WebDriver driver;
    protected Homepage homepage;
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        homepage = new Homepage(driver);
    }
    public static void main(String[] args){
        BaseTest test = new BaseTest();
        test.setup();
    }
}

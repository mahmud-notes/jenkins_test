import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    public WebDriver webDriver ;
    public FileUploadSteps fileUploadSteps ;

        @BeforeMethod
        public void initializeThings(){
            webDriver = new ChromeDriver();
            fileUploadSteps = new FileUploadSteps();
            webDriver.get("https://the-internet.herokuapp.com/upload");
        }

        @AfterMethod
        public void tearDown(){
            webDriver.quit();
        }
}

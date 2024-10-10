import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {



    @Test
    public void testFileUpload(){
        fileUploadSteps.fileUpload(webDriver, "C:\\Users\\m2.hasan\\Downloads\\upload_image.jpg");

        WebElement uploadMsg = webDriver.findElement(By.xpath("//h3[contains(text(),'File Uploaded!')]"));
        Assert.assertTrue(uploadMsg.isDisplayed(), "Upload Success Message Did Not Displayed");

        webDriver.quit();
    }
}

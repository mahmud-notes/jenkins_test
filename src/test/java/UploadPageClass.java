import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPageClass {

    public void passFileToInput(String location, WebDriver webDriver){
        WebElement inputBtn = webDriver.findElement(By .id("file-upload"));
        inputBtn.sendKeys(location);
    }


    public void clickOnUploadBtn(WebDriver webDriver){
        WebElement uploadBtn = webDriver.findElement(By.id("file-submit"));
        uploadBtn.click();
    }
}

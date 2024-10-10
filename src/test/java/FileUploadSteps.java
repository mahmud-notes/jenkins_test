import org.openqa.selenium.WebDriver;

public class FileUploadSteps {

    private final UploadPageClass uploadPageClass = new UploadPageClass();

    public void fileUpload(WebDriver webDriver, String location){
        uploadPageClass.passFileToInput(location, webDriver);
        uploadPageClass.clickOnUploadBtn(webDriver);
    }
}

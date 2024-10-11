import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class CucumberSteps {
    WebDriver webDriver ;
    private boolean successMsg ;

    @Given("Going To Url")
    public void goToUrl(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        webDriver = new ChromeDriver(options);
        webDriver.get("https://the-internet.herokuapp.com/upload");
    }

    @When("Upload File {string}")
    public void uploadFile(String location) {
        WebElement  inputBtn = webDriver.findElement(By.id("file-upload"));
        inputBtn.sendKeys(location);
        WebElement uploadBtn = webDriver.findElement(By.id("file-submit"));
        uploadBtn.click();
        WebElement uploadMsg = webDriver.findElement(By.xpath("//h3[contains(text(),'File Uploaded!')]"));
        successMsg =  uploadMsg.isDisplayed();
    }

    @Then("Check Message")
    public void checkMessage() {
        Assert.assertTrue(successMsg, "Upload Success Message Did Not Displayed");
    }

}

package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_Objects.Home;

public class LinkSteps {

    private static final Logger LOGGER = LogManager.getLogger(LinkSteps.class);

    WebDriver driver = Hooks.driver;

    @And("click on link")
    public void navigateToLink() {
        LOGGER.info("-------------Start Test Link functionalities---------------");
        new Home(driver)
                .clickOnLink();
    }

    @And("Use click on Facebook")
    public void clickOnFacebook() {
        new Home(driver)
                .clickOnFacebook();
        }

    @Then("user is navigated to link page")
    public void validateFacebookPage() {
        new Home(driver)
                .validateFacebookPage();
        LOGGER.info("-------------End Test Link functionalities---------------");
        }
}
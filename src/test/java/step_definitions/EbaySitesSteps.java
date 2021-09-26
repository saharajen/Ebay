package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_Objects.Home;

public class EbaySitesSteps {

    private static final Logger LOGGER = LogManager.getLogger(EbaySitesSteps.class);

    WebDriver driver = Hooks.driver;

    @And("mouse hover on the country icon")
    public void navigateToCountryIcon() {
        LOGGER.info("-------------Start Test Ebay Sites functionalities--------------");
        new Home(driver)
                .mouseHoverCountryIcon();
    }

    @And("click on the country flags")
    public void navigateToCountryName() {
        new Home(driver)
                .clickCountryName();
    }

    @Then("user is navigated to ebay sites")
    public void navigateToEbaySitesPage() {
        new Home(driver)
                .validateEbaySitesPage();
        LOGGER.info("-------------End Test Ebay Sites functionalities--------------");
    }
}
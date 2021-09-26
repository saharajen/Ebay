package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_Objects.NavigationBar;

public class DailyDealsSteps {

    private static final Logger LOGGER = LogManager.getLogger(DailyDealsSteps.class);

    WebDriver driver = Hooks.driver;

    @And("click on daily deals tab")
    public void navigateDailyDeals() {
        LOGGER.info("-------------Start Test Daily Deals and Brand Outlet functionalities------------");
        new NavigationBar(driver)
                .clickOnDailyDeals();
    }

    @Then("user is navigated to daily deals home page")
    public void navigateDailyDealsPage() {
        new NavigationBar(driver)
                .navigateDailyDealsPage();
    }

    @And("click on brand outlet tab")
    public void navigateToBrandOutlet() {
        new NavigationBar(driver)
                .clickOnBrandOutlet();
    }

    @Then("user is navigated to brand outlet home page")
    public void navigateBrandOutletPage() {
        new NavigationBar(driver)
                .validateBrandOutletPage();
        LOGGER.info("-------------End Test Daily Deals and Brand Outlet functionalities------------");
    }
}

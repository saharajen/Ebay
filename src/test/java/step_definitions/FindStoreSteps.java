package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_Objects.Home;

public class FindStoreSteps {

    private static final Logger LOGGER = LogManager.getLogger(FindStoreSteps.class);

    WebDriver driver = Hooks.driver;

    @And("^click on stores$")
    public void navigateToStores() {
        LOGGER.info("-------------Start Test Find Store functionalities---------------");
        new Home(driver)
                .clickOnStores();
    }

    @And("^click on find stores$")
    public void navigateToFindStores() {
        new Home(driver)
                .clickOnFindStores();
    }

    @When("^user enter the storename \"(.+?)\"$")
    public void userEnterStoreName(String storename){
        new Home(driver)
                .enterStoreName(storename);
    }

    @And("^click on search$")
    public void navigateToSearch() {
        new Home(driver)
                .clickOnSearch();
    }

    @And("^click on store name$")
    public void navigateToStoreName() {
        new Home(driver)
                .clickOnStoreName();
    }

    @Then("^user is navigated to store home page$")
    public void navigateToStoreNamePage() {
        new Home(driver)
                .validateStoreName();
        LOGGER.info("-------------End Test Find Store functionalities---------------");
    }
}

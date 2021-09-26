package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_Objects.Home;

import java.util.List;
import java.util.Map;

public class SearchSteps {

    private static final Logger LOGGER = LogManager.getLogger(SearchSteps.class);

    WebDriver driver = Hooks.driver;


    @When("^user enter the productname \"(.+?)\"$")
    public void userEnterProductName(String productname) {
        LOGGER.info("-------------Start Test Search functionalities---------------");
        new Home(driver)
                .EnterProductName(productname);
    }

    @And("^click search button$")
    public void navigateToSearchButton() {
        new Home(driver)
                .clickSearchButton();
    }

    @Then("^user is navigated to product page$")
    public void ValidateProductPage() {
        new Home(driver)
                .ValidateProductPage();
        LOGGER.info("----------------End Test Search functionalities---------------");
    }

    @When("user click on search button upon entering product name")
    public void userClickSearchUponEnteringProductName(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps(String.class, String.class);
        for (Map<String, String> cells : dataTable) {
            new Home(driver)
                    .userClickSearchUponEnteringProductName(cells.get("productname"))
                    .clickSearchButton();
            LOGGER.info("----------------End Test Search functionalities---------------");
        }
    }
}
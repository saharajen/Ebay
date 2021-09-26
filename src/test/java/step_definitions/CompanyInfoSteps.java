package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_Objects.Home;

public class CompanyInfoSteps {

    private static final Logger LOGGER = LogManager.getLogger(CompanyInfoSteps.class);

    WebDriver driver = Hooks.driver;

    @And("click on the about ebay")
    public void navigateToCompanyInfo() {
        LOGGER.info("----------------Start test company information functionalities---------------");
        new Home(driver)
                .clickOnCompanyInfo();
    }

    @And("click on the company")
    public void navigateToCompany() {
        new Home(driver)
                .clickOnCompany();
    }

    @Then("user is navigated to company info page")
    public void validateOurCompanyPage() {
        new Home(driver)
                .validateCompanyInfoPage();
        LOGGER.info("----------------End test company information functionalities---------------");
    }
}

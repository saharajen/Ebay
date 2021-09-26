package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_Objects.Home;

public class RemoveFromCartSteps {

    private static final Logger LOGGER = LogManager.getLogger(RemoveFromCartSteps.class);

    WebDriver driver = Hooks.driver;

    @When("^user navigate to home by ebay logo$")
    public void clickOnEbayLogo(){
        LOGGER.info("-------------Start Test Remove from cart functionalities---------------");
        new Home(driver)
                .clickOnEbayLogo();
    }

    @And("^user clicked on cart button$")
    public void clickedOnCartButton() {
        new Home(driver)
                .clickedOnCartButton();
    }

    @Then("^user successfully open cart$")
    public void itemOnCart () {
        new Home(driver)
                .itemOnCart();
    }

    @And("^user clicked on remove button$")
    public void clickOnRemove () {
        new Home(driver)
                .clickOnRemove();
    }

    @Then("^remove item validated by a success message$")
    public void removedSuccessfulMsg () {
        new Home(driver)
                .removedSuccessfulMsg();
        LOGGER.info("-------------End Test Remove from cart functionalities---------------");
    }
}

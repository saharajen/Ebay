package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_Objects.Home;

public class ShoppingCartSteps {

    private static final Logger LOGGER = LogManager.getLogger(ShoppingCartSteps.class);

    WebDriver driver = Hooks.driver;

    @And("user click on cart icon")
    public void clickOnCartIcon() {
        LOGGER.info("-------------Start Test Shopping Cart functionalities------------");
        new Home(driver)
                .clickOnCartIcon();
    }

    @Then("user is navigated to shopping cart page")
    public void validateShoppingCartPage() {
        new Home(driver)
                .validateShoppingCartPage();
        LOGGER.info("-------------End Test Shopping Cart functionalities------------");
    }
}

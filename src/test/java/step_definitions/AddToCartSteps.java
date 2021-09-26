package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_Objects.Cart;
import page_Objects.Home;
import utilities.ReadConfigFiles;

public class AddToCartSteps {

    private static final Logger LOGGER = LogManager.getLogger(AddToCartSteps.class);

    WebDriver driver = Hooks.driver;

    @Given("a user on the home page")
    public void navigateToHomePage() {
        String url = ReadConfigFiles.getPropertyValues("EbayUrl");
        ActOn.browser(driver).openBrowser(url);
        LOGGER.info("Browser is successfully initiated with the URL: " + url);
    }

    @When("^user selected to dell precision laptop$")
        public void userSelectDell () {
        LOGGER.info("-------------Start Test Add To Cart functionalities---------------");
        new Home(driver)
                .userSelectDell();
        }

    @And("click on add to cart on dell laptop")
    public void clickOnAddToCartOnDellLaptopPage() {
        new Home(driver)
                .clickOnAddToCartOnDellLaptopPage();
    }

    @Then("^user found message 1 item add to cart$")
    public void itemAddToCart () {
        new Home(driver)
                .itemAddToCart();
    }

    @And("^user clicked on go to button$")
            public void clickedOnGoTo() {
        new Home(driver)
                .clickedOnGoTo();
    }
    @Then("^item added in cart successfully$")
    public void validateAddToCartSuccessfully(){
        new Home(driver)
                .validateAddToCartSuccessfully();
        LOGGER.info("-------------End Test Add To Cart functionalities---------------");
    }
}

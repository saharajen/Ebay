package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_Objects.SignIn;

import java.util.List;
import java.util.Map;

public class SignInSteps {

    private static Logger LOGGER = LogManager.getLogger(SignInSteps.class);

    WebDriver driver = Hooks.driver;

    @And("^click on sign in$")
    public void clickOnSignIn() {
        LOGGER.info("-------------Start Test Sign In functionalities---------------");
        new SignIn(driver)
                .clickOnSignIn();
    }

    @When("^user enter username \"(.+?)\"$")
    public void userEnterUsername(String username) {
        new SignIn(driver)
                .userEnterUsername(username);
    }

    @And("^click on continue button$")
    public void clickOnContinue() {
        new SignIn(driver)
                .clickOnContinue();
    }

    @When("^user enter password \"(.+?)\"$")
    public void userEnterPassword(String password) {
        new SignIn(driver)
                .userEnterPassword(password);
    }

    @And("^click on sing in button$")
    public void clickOnSingInButton() {
        new SignIn(driver)
                .clickOnSingInButton();
    }

    @And("^click on Tired button$")
    public void clickOnTiredButton() {
        new SignIn(driver)
                .clickOnTiredButton();
    }

    @Then("^user is navigated to home page$")
    public void validateUserIsSignInInSuccessfully() {
        new SignIn(driver)
                .validateUserIsSignInInSuccessfully();
        LOGGER.info("-------------End Test Sign In functionalities---------------");
    }

    @Then("^user is failed to sign in$")
    public void invalidUserIsSignInUnsuccessfully() {
        new SignIn(driver)
                .invalidUserIsSignInUnsuccessfully();
        LOGGER.info("-------------End Test Sign In negative functionalities---------------");
    }

    @When("user click on continue button upon entering credentials")
    public void userClickOnContinueButtonUponEnteringCredentials(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps(String.class, String.class);
        for (Map<String, String>cells:dataTable) {
            new SignIn(driver)
                    .userClickOnContinueButtonUponEnteringCredentials(cells.get("username"))
                    .clickOnContinue()
                    .userClickOnSignInButtonUponEnteringCredentials(cells.get("password"))
                    .clickOnSingInButton()
                    .clickOnTiredButton();
        }
    }
}

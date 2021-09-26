package step_definitions;

import command_providers.ActOn;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_Objects.SignIn;

import java.util.List;
import java.util.Map;

public class SignInSteps {

//    private static final By SignIn = By.xpath("//a[text()='Sign in']");
//    private static final By Username = By.id("userid");
//    private static final By Continue = By.id("signin-continue-btn");
//    private static final By Password = By.id("pass");
//    private static final By SignInButton = By.id("sgnBt");
//    private static final By Tired = By.id("webauthn-maybe-later-link");
//    private static final By HiRajen = By.xpath("//*[@id='gh-ug']/b[1]"); //not right one
//    private static final By SignOut = By.xpath("//*[@id='signout-banner-text']/h1"); //not right one
//    private static final By NotMatchPassowrd = By.id("errormsg");

    private static Logger LOGGER = LogManager.getLogger(SignInSteps.class);
    WebDriver driver = Hooks.driver;

//    @Given("^a user on the sign in page$")
//    public void navigateToLoginPage() {
//        LOGGER.info("-------------Start Test Sign In functionalities---------------");
//        ActOn.browser(driver).openBrowser("https://www.ebay.com/");
//        LOGGER.info("user is in the home page");
//    }

    @And("^click on sign in$")
    public void clickOnSignIn() {
        LOGGER.info("-------------Start Test Sign In functionalities---------------");
//        ActOn.element(driver, SignIn).click();
//        LOGGER.info("User is in the Sign in Page");
        new SignIn(driver)
                .clickOnSignIn();
    }

    @When("^user enter username \"(.+?)\"$")
    public void userEnterUsername(String username) {
//        ActOn.element(driver, Username).setValue(username);
//        LOGGER.info("User has entered username");
        new SignIn(driver)
                .userEnterUsername(username);
    }

    @And("^click on continue button$")
    public void clickOnContinue() {
//        ActOn.element(driver, Continue).click();
//        LOGGER.info("User click on continue button");
        new SignIn(driver)
                .clickOnContinue();
    }

    @When("^user enter password \"(.+?)\"$")
    public void userEnterPassword(String password) {
//        ActOn.element(driver, Password).setValue(password);
//        LOGGER.info("User has entered password");
        new SignIn(driver)
                .userEnterPassword(password);
    }

    @And("^click on sing in button$")
    public void clickOnSingInButton() {
//        ActOn.element(driver, SignInButton).click();
//        LOGGER.info("User click on sign in button");
        new SignIn(driver)
                .clickOnSingInButton();
    }

    @And("^click on Tired button$")
    public void clickOnTiredButton() {
//        ActOn.element(driver, Tired).click();
//        LOGGER.info("User click on tired button");
        new SignIn(driver)
                .clickOnTiredButton();
    }

    @Then("^user is navigated to home page$")
    public void validateUserIsSignInInSuccessfully() {
//        boolean hiRajenDisplayed = driver.findElement(HiRajen).isDisplayed();
//        Assert.assertTrue("Hi Rajen is not displayed", hiRajenDisplayed);
//        LOGGER.info("User is in the home page");
        new SignIn(driver)
                .validateUserIsSignInInSuccessfully();
        LOGGER.info("-------------End Test Sign In functionalities---------------");
    }

    @Then("^user is failed to sign in$")
    public void invalidUserIsSignInUnsuccessfully() {
//        boolean notMatch = driver.findElement(NotMatchPassowrd).isDisplayed();
//        Assert.assertTrue("Oops, that's not a match is not displayed", notMatch);
//        LOGGER.info("User is still in the sign in page");
        new SignIn(driver)
                .invalidUserIsSignInUnsuccessfully();
        LOGGER.info("-------------End Test Sign In negative functionalities---------------");
    }

    @When("user click on continue button upon entering credentials")
    public void userClickOnContinueButtonUponEnteringCredentials(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps(String.class, String.class);
        for (Map<String, String>cells:dataTable) {
//            ActOn.element(driver, Username).setValue(cells.get("username"));
//
//            ActOn.element(driver, Continue).click();
//            LOGGER.info("User click on continue button");
//
//            ActOn.element(driver, Password).setValue(cells.get("password"));
//            LOGGER.info("User has entered credentials");
//
//            ActOn.element(driver, SignInButton).click();
//            ActOn.element(driver, Tired).click();
//            LOGGER.info("User click on sign in button");
            new SignIn(driver)
                    .userClickOnContinueButtonUponEnteringCredentials(cells.get("username"))
                    .clickOnContinue()
                    .userClickOnSignInButtonUponEnteringCredentials(cells.get("password"))
                    .clickOnSingInButton()
                    .clickOnTiredButton();
        }
    }
}




//package step_definitions;
//
//        import command_providers.ActOn;
//        import io.cucumber.datatable.DataTable;
//        import io.cucumber.java.en.And;
//        import io.cucumber.java.en.Given;
//        import io.cucumber.java.en.Then;
//        import io.cucumber.java.en.When;
//        import org.apache.logging.log4j.LogManager;
//        import org.apache.logging.log4j.Logger;
//        import org.junit.Assert;
//        import org.openqa.selenium.By;
//        import org.openqa.selenium.WebDriver;
//
//        import java.util.List;
//        import java.util.Map;
//
//    public class SignInSteps {
//
//    private static final By SignIn = By.xpath("//a[text()='Sign in']");
//    private static final By Username = By.id("userid");
//    private static final By Continue = By.id("signin-continue-btn");
//    private static final By Password = By.id("pass");
//    private static final By SignInButton = By.id("sgnBt");
//    private static final By Tired = By.id("webauthn-maybe-later-link");
//    private static final By HiRajen = By.xpath("//*[@id='gh-ug']/b[1]"); //not right one
//    private static final By SignOut = By.xpath("//*[@id='signout-banner-text']/h1"); //not right one
//    private static final By NotMatchPassowrd = By.id("errormsg");
//
//    private static Logger LOGGER = LogManager.getLogger(SignInSteps.class);
//    WebDriver driver = Hooks.driver;
//
////    @Given("^a user on the sign in page$")
////    public void navigateToLoginPage() {
////        LOGGER.info("-------------Start Test Sign In functionalities---------------");
////        ActOn.browser(driver).openBrowser("https://www.ebay.com/");
////        LOGGER.info("user is in the home page");
////    }
//
//    @And("^click on sign in$")
//    public void clickOnSignIn() {
//        LOGGER.info("-------------Start Test Sign In functionalities---------------");
//        ActOn.element(driver, SignIn).click();
//        LOGGER.info("User is in the Sign in Page");
//    }
//
//    @When("^user enter username \"(.+?)\"$")
//    public void userEnterUsername(String username) {
//        ActOn.element(driver, Username).setValue(username);
//        LOGGER.info("User has entered username");
//    }
//
//    @And("^click on continue button$")
//    public void clickOnContinue() {
//        ActOn.element(driver, Continue).click();
//        LOGGER.info("User click on continue button");
//    }
//
//    @When("^user enter password \"(.+?)\"$")
//    public void userEnterPassword(String password) {
//        ActOn.element(driver, Password).setValue(password);
//        LOGGER.info("User has entered password");
//    }
//
//    @And("^click on sing in button$")
//    public void clickOnSingInButton() {
//        ActOn.element(driver, SignInButton).click();
//        ActOn.element(driver, Tired).click();
//        LOGGER.info("User click on sign in button");
//    }
//
//    @Then("^user is navigated to home page$")
//    public void validateUserIsSignInInSuccessfully() {
//        boolean hiRajenDisplayed = driver.findElement(HiRajen).isDisplayed();
//        Assert.assertTrue("Hi Rajen is not displayed", hiRajenDisplayed);
//        LOGGER.info("User is in the home page");
//        LOGGER.info("-------------End Test Sign In functionalities---------------");
//    }
//
//    @Then("^user is failed to sign in$")
//    public void invalidUserIsSignInUnsuccessfully() {
//        boolean notMatch = driver.findElement(NotMatchPassowrd).isDisplayed();
//        Assert.assertTrue("Oops, that's not a match is not displayed", notMatch);
//        LOGGER.info("User is still in the sign in page");
//        LOGGER.info("-------------End Test Sign In negative functionalities---------------");
//    }
//
//    @When("user click on continue button upon entering credentials")
//    public void userClickOnContinueButtonUponEnteringCredentials(DataTable table) {
//        List<Map<String, String>> dataTable = table.asMaps(String.class, String.class);
//        for (Map<String, String>cells:dataTable) {
//            ActOn.element(driver, Username).setValue(cells.get("username"));
//
//            ActOn.element(driver, Continue).click();
//            LOGGER.info("User click on continue button");
//
//            ActOn.element(driver, Password).setValue(cells.get("password"));
//            LOGGER.info("User has entered credentials");
//
//            ActOn.element(driver, SignInButton).click();
//            ActOn.element(driver, Tired).click();
//            LOGGER.info("User click on sign in button");
//        }
//    }
//}


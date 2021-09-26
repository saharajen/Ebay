package page_Objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {

    private static final Logger LOGGER = LogManager.getLogger(Home.class);

    private final By SignIn = By.xpath("//a[text()='Sign in']");
    private final By Username = By.id("userid");
    private final By Continue = By.id("signin-continue-btn");
    private final By Password = By.id("pass");
    private final By SignInButton = By.id("sgnBt");
    private final By Tired = By.id("webauthn-maybe-later-link");
    private final By HiRajen = By.xpath("//*[@id='gh-ug']/b[1]"); //not right one
    private final By SignOut = By.xpath("//*[@id='signout-banner-text']/h1"); //not right one
    private final By NotMatchPassowrd = By.id("errormsg");

    WebDriver driver;

    public SignIn(WebDriver driver) {
        this.driver = driver;
    }

    public SignIn clickOnSignIn() {
        ActOn.element(driver, SignIn).click();
        LOGGER.info("User is in the Sign in Page");
        return this;
    }

    public SignIn userEnterUsername(String username) {
        ActOn.element(driver, Username).setValue(username);
        LOGGER.info("User has entered username");
        return this;
    }

    public SignIn clickOnContinue() {
        ActOn.element(driver, Continue).click();
        LOGGER.info("User click on continue button");
        return this;
    }

    public SignIn userEnterPassword(String password) {
        ActOn.element(driver, Password).setValue(password);
        LOGGER.info("User has entered password");
        return this;
    }

    public SignIn clickOnSingInButton() {
        ActOn.element(driver, SignInButton).click();
        LOGGER.info("User click on sign in button");
        return this;
    }

    public SignIn clickOnTiredButton() {
        ActOn.element(driver, Tired).click();
        LOGGER.info("User click on tired button");
        return this;
    }


    public SignIn validateUserIsSignInInSuccessfully() {
        boolean hiRajenDisplayed = driver.findElement(HiRajen).isDisplayed();
        Assert.assertTrue("Hi Rajen is not displayed", hiRajenDisplayed);
        LOGGER.info("User is in the home page");
        return this;
    }

    public SignIn invalidUserIsSignInUnsuccessfully() {
        boolean notMatch = driver.findElement(NotMatchPassowrd).isDisplayed();
        Assert.assertTrue("Oops, that's not a match is not displayed", notMatch);
        LOGGER.info("User is still in the sign in page");
        return this;
    }

    public SignIn userClickOnContinueButtonUponEnteringCredentials(String value) {
        ActOn.element(driver, Username).setValue(value);
        LOGGER.debug("User entered valid username is " + value);
        return this;
    }

    public SignIn userClickOnSignInButtonUponEnteringCredentials(String value) {
        ActOn.element(driver, Password).setValue(value);
        LOGGER.debug("User entered valid password is " + value);
        return this;
    }
}

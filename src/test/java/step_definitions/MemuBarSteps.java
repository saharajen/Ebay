package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_Objects.NavigationBar;

public class MemuBarSteps {

    private static final Logger LOGGER = LogManager.getLogger(MemuBarSteps.class);

    WebDriver driver = Hooks.driver;

    @And("mouse hover on music")
    public void navigateMusic() {
        LOGGER.info("-------------Start Test Menu Bar functionalities---------------");
        new NavigationBar(driver)
                .mousehoverOnMusic();
    }

    @And("click on Guitars & Basses")
    public void navigateGuitarsBasses() {
        new NavigationBar(driver)
                .clickOnGuitarsBasses();
    }

    @And("click on Acoustic Guitars")
    public void navigateAcousticGuitars() {
        new NavigationBar(driver)
                .clickOnAcousticGuitars();
    }

    @Then("user is navigated to music page")
    public void navigateAcousticGuitarsPage() {
        new NavigationBar(driver)
                .validateMusicPage();
    }

    @And("click on fashion")
    public void navigateFashion() {
        new NavigationBar(driver)
                .clickOnFashion();
    }

    @Then("user is navigated to fashion page")
    public void navigateFashionPage() {
        new NavigationBar(driver)
                .validateFashionPage();
    }

    @And("click on electronics")
    public void clickOnElectronics() {
        new NavigationBar(driver)
                .clickOnElectronics();
    }

    @Then("user is navigated to electronics page")
    public void validateElectronicsPage() {
        new NavigationBar(driver)
                .validateElectronicsPage();
        LOGGER.info("-------------End Test Menu Bar functionalities---------------");
    }
}
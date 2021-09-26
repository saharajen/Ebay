package page_Objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {

    private static final Logger LOGGER = LogManager.getLogger(Home.class);

    //Brand Outlet feature
    private final By BrandOutlet = By.xpath("//a[normalize-space()='Brand Outlet' and @data-sp='m570.l47233']");
    private final By TextBrandOutlet = By.xpath("//span[normalize-space()='The Brand Outlet' and @class='b-pageheader__text']");

    //Daily Deals feature
    private final By DailyDeals = By.xpath("//a[text()=' Daily Deals' and @href='https://www.ebay.com/deals']");
    private final By Deals = By.xpath("//a[text()='Deals']");

    //Fashion feature
    private final By Fashion = By.xpath("//a[text()='Fashion' and @_sp='p2481888.m1380.l3250']");
    private final By TextFashion = By.className("b-pageheader__text");
    private final By Electronics = By.xpath("//a[@_sp='p2481888.m1381.l3250' and @href='https://www.ebay.com/b/Electronics/bn_7000259124']");
    private final By TextElectronics = By.className("b-pageheader__text");

    //Music feature
    private final By Music =By.xpath("//a[normalize-space()='Music' and @_sp='p2481888.m1387.l3250']");
    private final By GuitarsBasses = By.xpath("//a[normalize-space()='Guitars & Basses' and @_sp='p2481888.m1387.l3251']");
    private final By AcousticGuitars = By.xpath("//a[@class='b-textlink b-textlink--sibling'][normalize-space()='Acoustic Guitars']");
    private final By TextAcousticGuitars = By.xpath("//strong[normalize-space()='Acoustic Guitars']");


    WebDriver driver;

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }

    //Brand Outlet feature

    public NavigationBar clickOnBrandOutlet() {
        LOGGER.debug("User click on brand outlet tab");
        ActOn.element(driver, BrandOutlet).click();
        return this;
    }

    public NavigationBar validateBrandOutletPage() {
        LOGGER.debug("User on the brand outlet home page");
        boolean BrandOutletDisplayed = driver.findElement(TextBrandOutlet).isDisplayed();
        Assert.assertTrue("The Brand Outlet is not displayed", BrandOutletDisplayed);
        return this;
    }

    //Daily Deals feature

    public NavigationBar clickOnDailyDeals() {
        LOGGER.debug("User click on daily deals button");
        ActOn.element(driver, DailyDeals).click();
        return this;
    }

    public NavigationBar navigateDailyDealsPage() {
        LOGGER.debug("User on the daily deals home page");
        boolean DealsDisplayed = driver.findElement(Deals).isDisplayed();
        Assert.assertTrue("Deals is not displayed", DealsDisplayed);
        return this;
    }

    //Fashion feature

    public NavigationBar clickOnFashion() {
        LOGGER.debug("User click on fashion");
        ActOn.element(driver, Fashion).click();
        return this;
    }

    public NavigationBar validateFashionPage() {
        LOGGER.debug("Navigation to Fashion page");
        boolean TextFashionDisplayed = driver.findElement(TextFashion).isDisplayed();
        Assert.assertTrue("Fashion is not displayed", TextFashionDisplayed);
        return this;
    }

    public NavigationBar clickOnElectronics() {
        LOGGER.debug("User click on electronics");
        ActOn.element(driver, Electronics).click();
        return this;
    }

    public NavigationBar validateElectronicsPage() {
        LOGGER.debug("Navigation to Electronics page");
        boolean TextElectronicsDisplayed = driver.findElement(TextElectronics).isDisplayed();
        Assert.assertTrue("Electronics is not displayed", TextElectronicsDisplayed);
        return this;
    }
    //Music feature

    public NavigationBar mousehoverOnMusic() {
        LOGGER.debug("User mousehover on music");
        ActOn.element(driver, Music).mouseHover();
        return this;
    }

    public NavigationBar clickOnGuitarsBasses() {
        LOGGER.debug("User click on guitar and basses");
        ActOn.element(driver, GuitarsBasses).click();
        return this;
    }

    public NavigationBar clickOnAcousticGuitars() {
        LOGGER.debug("User click on acoustic guitars");
        ActOn.element(driver, AcousticGuitars).click();
        return this;
    }

    public NavigationBar validateMusicPage() {
        LOGGER.debug("Navigation to acoustic guitars page");
        boolean TextAcousticGuitarsDisplayed = driver.findElement(TextAcousticGuitars).isDisplayed();
        Assert.assertTrue("acoustic guitars is not displayed", TextAcousticGuitarsDisplayed);
        return this;
    }
}

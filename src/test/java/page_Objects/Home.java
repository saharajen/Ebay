package page_Objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends Cart {
    private static final Logger LOGGER = LogManager.getLogger(Home.class);

//Company Information feature

    private final By CompanyInfo = By.xpath("//a[normalize-space()='Company info' and @_sp='m571.l2938']");
    private final By Company = By.xpath("//a[text()='Company' and @class='js-l1-link']");
    private final By OurCompany = By.cssSelector(".line1");

//Ebay Sites feature

    private final By Icon = By.xpath("//a[@id='gf-fbtn' and @class='thrd']");
    private final By Country = By.xpath("//p[text()='Australia']");
    private final By CountrySite = By.xpath("//a[@id='gf-fbtn' and @aria-label='eBay sites,Australia']");

//Find Store feature

    private final By Stores = By.xpath("//a[starts-with(text(),'Stores')]");
    private final By FindStores = By.xpath("//a[normalize-space()='Find Stores' and @class='b-textlink b-textlink--parent']");
    private final By StoreName = By.xpath("//input[@name='store_search' and @type='text']");
    private final By StoreSearch = By.xpath("//span[@class='search-text']");
    private final By Name = By.xpath("//a[normalize-space()='adidas']");
    private final By ValidName = By.xpath("//h1[@class='str-billboard__title']");

//Link feature

    private final By Link = By.xpath("//a[@class='thrd gf-i' and @_exsp='m571.l2942']");
    private final By Facebook = By.xpath("//a[@title='Go to Facebook Home']");
    private final By TextFaceBook = By.xpath("//img[@class='fb_logo _8ilh img' and @alt='Facebook']");

//Search feature

    private final By ProductName = By.xpath("//input[@id='gh-ac' and @id='gh-ac']");
    private final By Search = By.xpath("//input[@id='gh-btn' and @type='submit']");
    private final By Text = By.xpath("//span[text()='tv stand']");


    public Home(WebDriver driver) {
        super(driver);
    }

//Company Information feature

    public Home clickOnCompanyInfo() {
        LOGGER.debug("User click on the Company info");
        ActOn.element(driver, CompanyInfo).click();
        return this;
    }

    public Home clickOnCompany() {
        LOGGER.debug("User click on the Company");
        ActOn.element(driver, Company).click();
        return this;
    }

    public Home validateCompanyInfoPage() {
        LOGGER.debug("User on the Company Info page");
        ActOn.wait(driver, OurCompany).waitForElementToBeVisible();
        boolean OurCountryText = driver.findElement(OurCompany).isDisplayed();
        Assert.assertTrue("Our Company is not displayed", OurCountryText);
        return this;
    }

//Ebay Sites feature

    public Home mouseHoverCountryIcon() {
        LOGGER.debug("User mouse hover on the country icon");
        ActOn.element(driver, Icon).mouseHover();
        return this;
    }

    public Home clickCountryName() {
        LOGGER.debug("User click on the country flags");
        ActOn.element(driver, Country).click();
        return this;
    }

    public Home validateEbaySitesPage() {
        LOGGER.info("User on the ebay sites page");
        boolean textDisplayed = driver.findElement(CountrySite).isDisplayed();
        Assert.assertTrue("Country name is not displayed", textDisplayed);
        return this;
    }

//Find Store feature

    public Home clickOnStores() {
        LOGGER.debug("User click on stores");
        ActOn.element(driver, Stores).click();
        return this;
    }

    public Home clickOnFindStores() {
        LOGGER.debug("User click on find stores");
        ActOn.element(driver, FindStores).click();
        return this;
    }

    public Home enterStoreName(String storename) {
        LOGGER.debug("User enter the store name");
        ActOn.element(driver, StoreName).setValue(storename);
        return this;
    }

    public Home clickOnSearch() {
        LOGGER.debug("User click on search button");
        ActOn.element(driver, StoreSearch).click();
        return this;
    }

    public Home clickOnStoreName() {
        LOGGER.debug("User click on store name");
        ActOn.element(driver, Name).click();
        return this;
    }

    public Home validateStoreName() {
        LOGGER.info("User on the store home page");
        boolean nameDisplayed = driver.findElement(ValidName).isDisplayed();
        Assert.assertTrue("Text is not displayed", nameDisplayed);
        return this;
    }
//Link feature

    public Home clickOnLink() {
        LOGGER.debug("User click on facebook link");
        ActOn.element(driver, Link).click();
        return this;
    }

    public Home clickOnFacebook() {
        LOGGER.debug("User click on facebook");
        ActOn.element(driver, Facebook).click();
        return this;

    }

    public Home validateFacebookPage() {
        LOGGER.debug("user on Facebook page");
        boolean FacebookDisplayed = driver.findElement(TextFaceBook).isDisplayed();
        Assert.assertTrue("Facebook is not displayed", FacebookDisplayed);
        return this;
    }

//Search feature

    public Home EnterProductName(String productname) {
        LOGGER.debug("User entered product name");
        ActOn.element(driver, ProductName).setValue(productname);
        return this;
    }

    public Home clickSearchButton() {
        LOGGER.debug("user click on search button");
        ActOn.element(driver, Search).click();
        return this;
    }

    public Home ValidateProductPage() {
        LOGGER.debug("user on product list page");
        boolean textDisplayed = driver.findElement(Text).isDisplayed();
        Assert.assertTrue("Text is not displayed", textDisplayed);
        return this;
    }

    public Home userClickSearchUponEnteringProductName(String value) {
        ActOn.element(driver, ProductName).setValue(value);
        LOGGER.debug("User entered credentials for search is " + value);
        return this;
    }
}

package page_Objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
    private static final Logger LOGGER = LogManager.getLogger(Home.class);

//Add To Cart feature
    private final By ItemSelected = By.xpath("//h3[contains(text(),'Dell XPS 9700 10th Gen i7-10750H 512GB SSD 32GB Me')]");
    private final By ItemOnCart = By.xpath("//a[@role='button'][contains(text(),'Add to cart')]");
    private final By ItemSelectConfirmation = By.xpath("//div[@class='vi-overlayTitleBar'][normalize-space()='1 item added to cart']");
    private final By GoToCart = By.xpath("//span[contains(text(),'Go to cart')]");
    private final By CartTitle = By.xpath("//h1[@class='main-title'][contains(normalize-space(),'Shopping cart (1 item)')]");

//Remove from cart feature
    private static final By ebayLogo = By.xpath("//a[@id='gh-la']");
    private static final By CartLogo = By.xpath("//a[@aria-label='Your shopping cart contains 1 item']//*[name()='svg']");
    private static final By CartPage = By.xpath("(//h1[normalize-space()='Shopping cart (1 item)'])[1]");
    private static final By Remove = By.xpath("//button[@data-test-id='cart-remove-item']");
    private static final By RemoveMsg = By.xpath("//span[normalize-space()='was removed from your cart.']");

//Shopping Cart feature

    private final By CartIcon = By.className("gh-cart-icon");
    private final By ShoppingCart = By.className("main-title");

    WebDriver driver;

    public Cart(WebDriver driver) {
        this.driver = driver;
    }

//Add To Cart feature

    public Cart userSelectDell () {
        ActOn.element(driver, ItemSelected).click();
        LOGGER.info("user select dell precision laptop");
        return this;
    }

    public Cart clickOnAddToCartOnDellLaptopPage() {
        ActOn.element(driver, ItemOnCart).click();
        LOGGER.info("User click on add to cart");
        return this;
    }

    public Cart itemAddToCart () {
        boolean ItemAddToCart = driver.findElement(ItemSelectConfirmation).isDisplayed();
        Assert.assertTrue("Add item message not displayed", ItemAddToCart);
        LOGGER.info("Item is successfully added on cart");
        return this;
    }

    public Cart clickedOnGoTo() {
        ActOn.element(driver, GoToCart).click();
        LOGGER.info("User navigate to cart");
        return this;
    }

    public Cart validateAddToCartSuccessfully() {
        boolean ItemOnCart = driver.findElement(CartTitle).isDisplayed();
        Assert.assertTrue("Item not showing in cart", ItemOnCart);
        LOGGER.info("Item successfully displayed on cart");
        return this;
    }

//Remove from cart feature

    public Cart clickOnEbayLogo() {
        ActOn.element(driver, ebayLogo).click();
        LOGGER.info("User clicked on ebay Logo");
        return this;
    }

    public Cart clickedOnCartButton() {
        ActOn.element(driver, CartLogo).click();
        LOGGER.info("user clicked on cart Logo");
        return this;
    }

    public Cart itemOnCart () {
        Boolean ItemInCart = driver.findElement(CartPage).isDisplayed();
        Assert.assertTrue("Item is not display in cart", ItemInCart);
        LOGGER.info("Item is successfully displayed on cart");
        return this;
    }

    public Cart clickOnRemove () {
        ActOn.element(driver, Remove).click();
        LOGGER.info("User click on Remove button");
        return this;
    }

    public Cart removedSuccessfulMsg () {
        boolean EmptyCartDisplayed = driver.findElement(RemoveMsg).isDisplayed();
        Assert.assertTrue("Remove item is not successful", EmptyCartDisplayed);
        LOGGER.info("Item is successfully removed");
        return this;
    }

//Shopping Cart feature

    public Cart clickOnCartIcon() {
        LOGGER.debug("User click on cart icon button");
        ActOn.element(driver, CartIcon).click();
        return this;
    }

    public Cart validateShoppingCartPage() {
        LOGGER.debug("User on the Shopping Cart home page");
        boolean ShoppingCartDisplayed = driver.findElement(ShoppingCart).isDisplayed();
        Assert.assertTrue("Shopping Cart is not displayed", ShoppingCartDisplayed);
        return this;
    }
}

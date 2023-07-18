package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Overnight Duffle']")
    WebElement dufflebagProduct;
    @CacheLookup
    @FindBy(xpath ="//span[@class='base']")
    WebElement verifyBagName;
    @CacheLookup
    @FindBy(xpath ="//input[@id='qty']")
    WebElement changeBagQuantity;
    @CacheLookup
    @FindBy(xpath ="//button[@id='product-addtocart-button']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath ="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement productAddedInShoppingCart;
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath ="//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath ="//input[@title='Qty']")

    WebElement verifyProductQuantity;
    @CacheLookup
    @FindBy(xpath ="(//span[@class='cart-price']//span)[2]")

    WebElement verifyProductPrice;
    @CacheLookup
    @FindBy(xpath ="(//input[@class='input-text qty'])[1]")

    WebElement changeQuantityInShoppingCart;
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Update Shopping Cart']")

    WebElement clickOnUpdateShoppingCart;
    // Click on Product Name ‘Overnight Duffle’
    public void clickOnDuffleBag()
    {
        clickOnElement(dufflebagProduct);
        CustomListeners.test.log(Status.PASS, "Click on Overnight Duffle bag");
    }
    // Verify the text ‘Overnight Duffle’
    public String productName()
    {
        return getTextFromElement(verifyBagName);
    }
    // Change Qty 3
    public void changeQuantitytoThree()
    {
        sendTextToElement(changeBagQuantity,"3");
        CustomListeners.test.log(Status.PASS, "Change Quantity" + "3");
    }
    // Click on ‘Add to Cart’ Button.
    public void addToCart()
    {
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click on Add to Cart");
    }
    public String verifyShoppingCart()
    {
        return getTextFromElement(productAddedInShoppingCart);
    }
    // Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCart()
    {
        clickOnElement(shoppingCartLink);
        CustomListeners.test.log(Status.PASS, "Click on shopping cart");
    }
    // Verify the product name ‘Overnight Duffle’
    public String verifyProductName()
    {
        return getTextFromElement(productName);
    }
    //Verify the Qty is ‘3’
    public String verifyProductQuantity()
    {
        return getTextFromElement(verifyProductQuantity);
    }
    // Verify the product price ‘$135.00’
    public String verifyProductPrice()
    {
        return getTextFromElement(verifyProductPrice);
    }
    // Change Qty to ‘5’
    public void changeQuantity()
    {
        sendTextToElement(changeQuantityInShoppingCart,"5");
        CustomListeners.test.log(Status.PASS, "Change Qantity to" + "5");
    }
    // Click on ‘Update Shopping Cart’ button
    public void clickOnUpdateButton()
    {
        clickOnElement(clickOnUpdateShoppingCart);CustomListeners.test.log(Status.PASS, "Click on Update Shopping Cart");
    }
    public String verifyProductPriceAfterUpdate()
    {
        return getTextFromElement(verifyProductPrice);
    }

}

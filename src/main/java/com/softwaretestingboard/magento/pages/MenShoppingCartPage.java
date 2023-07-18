package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenShoppingCartPage extends Utility {
    // Verify the text You added Cronus Yoga Pant to your shopping cart.
    @CacheLookup
    @FindBy(xpath ="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyTextHeading;
    public String verifyTextHeading()
    {
        return getTextFromElement(verifyTextHeading);
    }


    // Click on ‘shopping cart’ Link into message
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='shopping cart']")
    WebElement clickOnShoppingCartLink;
    public void clickOnShoppingCartLink()
    {
        clickOnElement(clickOnShoppingCartLink);
        CustomListeners.test.log(Status.PASS, "Click on shopping cart link");
    }

    // Verify the text ‘Shopping Cart.'
    @CacheLookup
    @FindBy(xpath ="//span[@class='base']")
    WebElement verifyShoppingCartText;
    public String verifyShoppingCartText()
    {
        return getTextFromElement(verifyShoppingCartText);
    }


    // Verify the product name ‘Cronus Yoga Pant’
    @CacheLookup
    @FindBy(xpath ="//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyProductNameCronus;
    public String verifyProductNameCronus()
    {
        return  getTextFromElement(verifyProductNameCronus);
    }
    // Verify the product size ‘32’
    @CacheLookup
    @FindBy(xpath ="//dd[contains(text(),'32')]")
    WebElement verifySizeOfProduct;
    public String verifySizeOfProduct()
    {
        return getTextFromElement(verifySizeOfProduct);
    }


    // Verify the product colour ‘Black’
    @CacheLookup
    @FindBy(xpath ="//dd[contains(text(),'Black')]")
    WebElement verifycolorOfProduct;
    public String verifycolorOfProduct()
    {
        return getTextFromElement(verifycolorOfProduct);
    }
}

package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenProductPage extends Utility {
    // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHoverToCronus;
    public void mouseHoverToCronus()
    {
        mouseHoverToElement(mouseHoverToCronus);
        CustomListeners.test.log(Status.PASS, "Mouse hover on Cronus product");
    }
    @CacheLookup
    @FindBy(xpath ="(//div[@class='swatch-option text'])[1]")
    WebElement clickOnPantSize;
    public void clickOnPantSize()
    {
        mouseHoverToElementAndClick(clickOnPantSize);
        CustomListeners.test.log(Status.PASS, "Click on pant size");

    }

    // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    @CacheLookup
    @FindBy(xpath ="(//div[@class='swatch-option color'])[1]")
    WebElement clickOnBlackColour;
    public void clickOnBlackColour()
    {
        mouseHoverToElementAndClick(clickOnBlackColour);
        CustomListeners.test.log(Status.PASS, "Click on Black colour");
    }

    // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    @CacheLookup
    @FindBy(xpath ="(//span[contains(text(),'Add to Cart')])[1]")

    WebElement mouseHoverAndClickToAddCart;
    public void mouseHoverAndClickToAddCart()
    {
        mouseHoverToElementAndClick(mouseHoverAndClickToAddCart);
        CustomListeners.test.log(Status.PASS, "Mouse hover and click Add Cart button");
    }



}

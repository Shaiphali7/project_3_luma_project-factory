package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility
{
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-6']//span[text()='Gear']")

    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Bags']")
    WebElement clickOnBag;
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Men']")
    // Mouse Hover on Men Menu
    WebElement menMenu;
    public void mouseHoverOnMenMenu()
    {
        mouseHoverToElement(menMenu);
    }


    // Mouse Hover on Bottoms
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-18']")
    WebElement mouseHoverOnBottom;

    public void mouseHoverOnBottom()
    {
        mouseHoverToElement(mouseHoverOnBottom);
        CustomListeners.test.log(Status.PASS, "Mouse hover on bottom");
    }

    // Click on Pants
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement mouseHoverandClickOnPants;
    public void mouseHoverAndClickOnPants()
    {
        mouseHoverToElementAndClick(mouseHoverandClickOnPants);
        CustomListeners.test.log(Status.PASS, "Mouse hover and click on product Pants");
    }


    // Mouse Hover on Gear Menu
    public void mouseHoverToGearMenu()
    {
        mouseHoverToElement(gearMenu);
        CustomListeners.test.log(Status.PASS, "Mouse hover on Gear menu");
    }
    // Click on Bags
    public void mouseHoverAndClickOnBag()
    {
        mouseHoverToElementAndClick(clickOnBag);
        CustomListeners.test.log(Status.PASS, "Mouse hover and click on product Bags");
    }
    //For women Menu
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Women']")
    WebElement womenMenu;
   public void mouseHoverOnWomenMenu()
   {
       mouseHoverToElement(womenMenu);
       CustomListeners.test.log(Status.PASS, "Mouse hover on Women menu");
   }
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement womenMenuTops;
   public void mouseHoverOnTops()
   {
       mouseHoverToElement(womenMenuTops);
       CustomListeners.test.log(Status.PASS, "Mouse hover on Tops");
   }
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")

    WebElement womenMenuJackets;
    public void mouseHoverAndClickOnJacket()
    {
        mouseHoverToElementAndClick(womenMenuJackets);
        CustomListeners.test.log(Status.PASS, "Mouse hover and click on product Jackets");
    }

}

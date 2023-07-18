package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WomenProduct extends Utility {

    By jacketElements =By.xpath("//span[normalize-space()='Women']");
    @CacheLookup
    @FindBy(xpath ="(//select[@id='sorter'])[1]")
    WebElement dropDown;
    public List<String> getJacketElements() {
        List<WebElement> jacketsElementsList = driver.findElements(jacketElements);
        List<String> jacketsNameList = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameList.add(value.getText());
        }
        return jacketsNameList;
    }
    public void selectSortByFilter()
    {
        selectByVisibleTextFromDropDown(dropDown,"Product Name");
    }
    @CacheLookup
    @FindBy(xpath ="(//select[@id='sorter'])[1]")
    WebElement sortByPrice;


    By priceElements = By.xpath("//span[@class='price-wrapper ']//span");

    public void sortByPrice() {

        selectByVisibleTextFromDropDown(sortByPrice, "Price");
        CustomListeners.test.log(Status.PASS, "Select sort by price filter " + "Price");
    }
    public List<String> getPriceElements() {
        List<WebElement> priceElementsList = driver.findElements(priceElements);
        List<String> priceList = new ArrayList<>();
        for (WebElement price : priceElementsList) {
            priceList.add(price.getText());
        }
        return priceList;
    }


}

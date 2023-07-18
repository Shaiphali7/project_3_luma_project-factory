package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenProduct;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;
@Listeners(CustomListeners.class)

public class WomenPageTest extends BaseTest {
    HomePage home;
    WomenProduct jacketPage;
    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void inIt()
    {
         home=new HomePage();
        jacketPage=new WomenProduct();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        Thread.sleep(1000);
        // Mouse Hover on Women Menu
        home.mouseHoverOnWomenMenu();

        // Mouse Hover on Tops
        home.mouseHoverOnTops();

        // Click on Jackets
        home.mouseHoverAndClickOnJacket();
        List<String> jacketNameBefore=jacketPage.getJacketElements();
        Thread.sleep(1000);
        jacketPage.selectSortByFilter();
        List<String> jacketNameAfter=jacketPage.getJacketElements();

        jacketNameBefore.sort(String.CASE_INSENSITIVE_ORDER);
        Assert.assertEquals(jacketNameBefore,jacketNameAfter);
       // List<String> jacketListNameAfter=jacketPage.
    }
    @Test(groups = {"smoke","regression"})
    public void  verifyTheSortByPriceFilter() throws InterruptedException
    {
        Thread.sleep(1000);
        // Mouse Hover on Women Menu
        home.mouseHoverOnWomenMenu();

        // Mouse Hover on Tops
        home.mouseHoverOnTops();

        // Click on Jackets
        home.mouseHoverAndClickOnJacket();
        List <String> jacketPriceBefore=jacketPage.getPriceElements();
        jacketPage.sortByPrice();
        List <String> jacketPriceAfter=jacketPage.getPriceElements();
        Collections.sort(jacketPriceBefore);
        Assert.assertEquals(jacketPriceBefore,jacketPriceAfter,"Wrong price");


    }
}
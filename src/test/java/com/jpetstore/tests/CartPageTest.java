package com.jpetstore.tests;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import com.jpetstore.pages.CartPage;
import com.jpetstore.pages.CategoryPage;
import com.jpetstore.pages.HeaderPage;
import com.jpetstore.pages.ItemPage;
import com.jpetstore.pages.ProductPage;
import com.jpetstore.pages.SignInPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartPageTest extends TestBase {

    public CartPageTest() throws IOException {
        super();
    }

    CartPage cartPage;
    HeaderPage headerPage;
    CategoryPage categoryPage;
    ProductPage productPage;
    ItemPage itemPage;
    SignInPage signInPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        cartPage = new CartPage();
        headerPage = new HeaderPage();
        categoryPage = new CategoryPage();
        productPage = new ProductPage();
        itemPage = new ItemPage();
        signInPage = new SignInPage();
    }

    @Test
    public void Cart() {
        headerPage.imgCart();
        boolean actualResult = cartPage.cartDivIsDisplayed();
        Assert.assertTrue(actualResult, "Test Cart Failed");
    }

    @Test
    public void AddToCart() {
        headerPage.signInLink();
        signInPage.signIn();
        headerPage.dogsLink();
        categoryPage.catalogChihuahuaLink();
        productPage.adultMaleChihuahuaLink();
        itemPage.addToCart();
    }

    @AfterMethod
    public void tearDown() {
    }

}

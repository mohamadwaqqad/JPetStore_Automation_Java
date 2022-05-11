package com.jpetstore.tests;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import com.jpetstore.pages.HeaderPage;
import com.jpetstore.pages.HomePage;
import com.jpetstore.pages.CategoryPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CategoryPageTest extends TestBase {

    public CategoryPageTest() throws IOException {
        super();
    }

    CategoryPage categoryPage;
    HeaderPage headerPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        categoryPage = new CategoryPage();
        headerPage = new HeaderPage();
        homePage = new HomePage();
    }

    @Test
    public void ReturnToMainMenuLink() {
        headerPage.fishLink();
        categoryPage.returnToMainMenuLink();
        boolean actualResult = homePage.mainIsDisplayed();
        Assert.assertTrue(actualResult, "return link test failed");
    }

    @AfterMethod
    public void tearDown() {
    }

}

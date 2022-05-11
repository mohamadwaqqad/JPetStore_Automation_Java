package com.jpetstore.tests;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import com.jpetstore.pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    public HomePageTest() throws IOException {
        super();
    }

    HomePage homePage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        homePage = new HomePage();
    }

    @Test(priority = 1)
    public void GetTitle() {
        String expectedResult = prop.getProperty("title");
        String actualResult = homePage.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Title is Different");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
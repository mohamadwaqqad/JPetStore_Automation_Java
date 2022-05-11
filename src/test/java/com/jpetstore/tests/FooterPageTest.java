package com.jpetstore.tests;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import com.jpetstore.pages.FooterPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterPageTest extends TestBase {

    public FooterPageTest() throws IOException {
        super();
    }

    FooterPage footerPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        footerPage = new FooterPage();
    }

    @Test
    public void PoweredBy() {
        String expectedResult = "https://blog.mybatis.org/";
        String actualResult = footerPage.poweredByLink();
        Assert.assertEquals(actualResult, expectedResult, "PoweredBy Test link Failed");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}

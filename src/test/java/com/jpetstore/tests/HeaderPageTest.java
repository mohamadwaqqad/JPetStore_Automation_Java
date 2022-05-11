package com.jpetstore.tests;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import com.jpetstore.pages.HeaderPage;
import com.jpetstore.util.TestUtils;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HeaderPageTest extends TestBase {

    public HeaderPageTest() throws IOException {
        super();
    }

    HeaderPage headerPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        headerPage = new HeaderPage();
    }

    @Test
    public void LogoImg() {
        Boolean actual = headerPage.logoImg();
        Assert.assertTrue(actual, "Logo Test failed");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider
    public Object[][] searchData() throws Throwable {
        Object data[][] = TestUtils.getDataFromExcel("SearchData");
        return data;
    }

}

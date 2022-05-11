package com.jpetstore.tests;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import com.jpetstore.pages.HeaderPage;
import com.jpetstore.pages.SearchPage;
import com.jpetstore.util.TestUtils;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchPageTest extends TestBase {

    public SearchPageTest() throws IOException {
        super();
    }

    SearchPage searchPage;
    HeaderPage headerPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        searchPage = new SearchPage();
        headerPage = new HeaderPage();
    }

    @Test(dataProvider = "searchData")
    public void Search(String wordSearch) {
        headerPage.search(wordSearch);
        boolean actualResult = searchPage.catalogIsDisplayed();
        Assert.assertTrue(actualResult, "Search fiald");
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

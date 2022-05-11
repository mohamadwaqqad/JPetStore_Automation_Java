package com.jpetstore.tests;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import com.jpetstore.pages.HeaderPage;
import com.jpetstore.pages.ProductPage;
import com.jpetstore.pages.CategoryPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductPageTest extends TestBase {

    public ProductPageTest() throws IOException {
        super();
    }

    CategoryPage categoryPage;
    ProductPage productPage;
    HeaderPage headerPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        categoryPage = new CategoryPage();
        productPage = new ProductPage();
        headerPage = new HeaderPage();
    }

    @Test
    public void ReturnToCategory() {
        headerPage.fishLink();
        categoryPage.catalog1Link();
        productPage.returnto();
    }

}

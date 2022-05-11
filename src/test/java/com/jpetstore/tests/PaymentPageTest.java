package com.jpetstore.tests;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import com.jpetstore.pages.CartPage;
import com.jpetstore.pages.CategoryPage;
import com.jpetstore.pages.ConfirmPage;
import com.jpetstore.pages.HeaderPage;
import com.jpetstore.pages.ItemPage;
import com.jpetstore.pages.PaymentPage;
import com.jpetstore.pages.ProductPage;
import com.jpetstore.pages.SignInPage;
import com.jpetstore.util.TestUtils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PaymentPageTest extends TestBase {

    public PaymentPageTest() throws IOException {
        super();
    }

    PaymentPage paymentPage;
    CartPage cartPage;
    HeaderPage headerPage;
    CategoryPage categoryPage;
    ProductPage productPage;
    ItemPage itemPage;
    SignInPage signInPage;
    ConfirmPage confirmPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        paymentPage = new PaymentPage();
        cartPage = new CartPage();
        headerPage = new HeaderPage();
        categoryPage = new CategoryPage();
        productPage = new ProductPage();
        itemPage = new ItemPage();
        signInPage = new SignInPage();
        confirmPage = new ConfirmPage();
    }

    @Test(dataProvider = "paymentData")
    public void Payment(String cardTypeData, String creditCardData, String expiryDateData, String firstNameData,
            String lastNameData, String address1Data, String address2Data, String cityData,
            String statedData, String zipData, String countryData, String shippingAddressData) {
        headerPage.signInLink();
        signInPage.signIn();
        headerPage.dogsLink();
        categoryPage.catalogChihuahuaLink();
        productPage.adultMaleChihuahuaLink();
        itemPage.addToCart();
        cartPage.proceedToCheckoutLink();
        paymentPage.payment(cardTypeData, creditCardData, expiryDateData, firstNameData, lastNameData, address1Data,
                address2Data, cityData, statedData, zipData, countryData, shippingAddressData);
        paymentPage.newOrderBut();
        confirmPage.confirmLink();
        categoryPage.returnToMainMenuLink();
    }

    @DataProvider
    public Object[][] paymentData() throws Throwable {
        Object data[][] = TestUtils.getDataFromExcel("PaymentData");
        return data;
    }

}

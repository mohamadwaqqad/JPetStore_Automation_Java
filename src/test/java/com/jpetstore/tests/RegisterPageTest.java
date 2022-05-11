package com.jpetstore.tests;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import com.jpetstore.pages.HeaderPage;
import com.jpetstore.pages.HomePage;
import com.jpetstore.pages.RegisterPage;
import com.jpetstore.pages.SignInPage;
import com.jpetstore.util.TestUtils;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    public RegisterPageTest() throws IOException {
        super();
    }

    RegisterPage registerPage;
    HeaderPage headerPage;
    SignInPage signInPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        registerPage = new RegisterPage();
        homePage = new HomePage();
        headerPage = new HeaderPage();
        signInPage = new SignInPage();
    }

    @Test(dataProvider = "registerData")
    public void Register(String userID, String newPass, String rePass, String fName, String lName, String email,
            String phone, String address_1, String address_2, String city, String state, String zip, String country,
            String lang, String favCategory, String MyList, String MyBanner) {
        headerPage.signInLink();
        signInPage.registerLink();
        registerPage.register(userID, newPass, rePass, fName, lName, email, phone, address_1, address_2, city, state,
                zip, country, lang, favCategory, MyList, MyBanner);
        boolean actualResult = homePage.mainIsDisplayed();
        Assert.assertTrue(actualResult, "Register Failed");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider
    public Object[][] registerData() throws Throwable {
        Object data[][] = TestUtils.getDataFromExcel("RegisterData");
        return data;
    }
}

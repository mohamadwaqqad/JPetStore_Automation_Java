package com.jpetstore.tests;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import com.jpetstore.pages.HeaderPage;
import com.jpetstore.pages.SignInPage;
import com.jpetstore.util.TestUtils;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignInPageTest extends TestBase {

    public SignInPageTest() throws IOException {
        super();
    }

    SignInPage signInPage;
    HeaderPage headerPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        signInPage = new SignInPage();
        headerPage = new HeaderPage();
    }

    @Test
    public void SignIn() {
        headerPage.signInLink();
        signInPage.signIn();
        boolean actualResult = signInPage.myAccount();
        Assert.assertTrue(actualResult, "Sign In Failed");
    }

    @Test(dataProvider = "signInData")
    public void SignInTests(String uName, String pass) {
        headerPage.signInLink();
        signInPage.signInTests(uName, pass);
        boolean actualResult = signInPage.myAccount();
        Assert.assertTrue(actualResult, "Sign In Test Failed");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider
    public Object[][] signInData() throws Throwable {
        Object data[][] = TestUtils.getDataFromExcel("SignInData");
        return data;
    }

}

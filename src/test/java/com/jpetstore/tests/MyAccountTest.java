package com.jpetstore.tests;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import com.jpetstore.pages.HeaderPage;
import com.jpetstore.pages.MyAccount;
import com.jpetstore.pages.SignInPage;
import com.jpetstore.util.TestUtils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyAccountTest extends TestBase {

    public MyAccountTest() throws IOException {
        super();
    }

    MyAccount myAccount;
    HeaderPage headerPage;
    SignInPage signInPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        myAccount = new MyAccount();
        headerPage = new HeaderPage();
        signInPage = new SignInPage();
    }

    @Test(dataProvider = "myAccountData")
    public void editAccount(String newPass, String rePass, String fName, String lName, String email,
            String phone, String address_1, String address_2, String city, String state, String zip, String country,
            String lang, String favCategory, String MyList, String MyBanner) {
        headerPage.signInLink();
        signInPage.signIn();
        headerPage.myAccountLink();
        myAccount.editAccount(newPass, rePass, fName, lName, email, phone, address_1, address_2, city, state, zip,
                country, lang, favCategory, MyList, MyBanner);
        myAccount.editAccountBut();
    }

    @DataProvider
    public Object[][] myAccountData() throws Throwable {
        Object data[][] = TestUtils.getDataFromExcel("MyAccountData");
        return data;
    }

}

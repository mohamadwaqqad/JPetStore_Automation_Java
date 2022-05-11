package com.jpetstore.tests;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import com.jpetstore.pages.HeaderPage;
import com.jpetstore.pages.MyAccount;
import com.jpetstore.pages.MyOrderPage;
import com.jpetstore.pages.SignInPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyOrderPageTest extends TestBase {

    public MyOrderPageTest() throws IOException {
        super();
    }

    MyOrderPage myOrderPage;
    MyAccount myAccount;
    HeaderPage headerPage;
    SignInPage signInPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        myOrderPage = new MyOrderPage();
        myAccount = new MyAccount();
        headerPage = new HeaderPage();
        signInPage = new SignInPage();
    }

    @Test
    public void MyOrders() {
        headerPage.signInLink();
        signInPage.signIn();
        headerPage.myAccountLink();
        myAccount.myOrdersLink();
    }

}

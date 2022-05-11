package com.jpetstore.tests;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import com.jpetstore.pages.ConfirmPage;

import org.testng.annotations.BeforeMethod;

public class ComfirmPageTest extends TestBase {

    public ComfirmPageTest() throws IOException {
        super();
    }

    ConfirmPage confirmPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        confirmPage = new ConfirmPage();
    }

}

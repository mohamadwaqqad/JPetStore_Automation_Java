package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class MyOrderPage extends TestBase {

    public MyOrderPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

}

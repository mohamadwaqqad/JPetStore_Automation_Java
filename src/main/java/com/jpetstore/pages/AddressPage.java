package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends TestBase {

    public AddressPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "order.shipToFirstName")
    WebElement shipToFirstName;

    @FindBy(name = "order.shipToLastName")
    WebElement shipToLastName;

    @FindBy(name = "order.shipAddress1")
    WebElement shipAddress1;

    @FindBy(name = "order.shipAddress2")
    WebElement shipAddress2;

    @FindBy(name = "order.shipCity")
    WebElement shipCity;

    @FindBy(name = "order.shipState")
    WebElement shipState;

    @FindBy(name = "order.shipZip")
    WebElement shipZip;

    @FindBy(name = "order.shipCountry")
    WebElement shipCountry;

}

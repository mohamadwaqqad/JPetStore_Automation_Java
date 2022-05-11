package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage extends TestBase {

    public PaymentPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "order.cardType")
    WebElement cardType;

    @FindBy(name = "order.creditCard")
    WebElement creditCard;

    @FindBy(name = "order.expiryDate")
    WebElement expiryDate;

    @FindBy(name = "order.billToFirstName")
    WebElement billToFirstName;

    @FindBy(name = "order.billToLastName")
    WebElement billToLastName;

    @FindBy(name = "order.billAddress1")
    WebElement billAddress1;

    @FindBy(name = "order.billAddress2")
    WebElement billAddress2;

    @FindBy(name = "order.billCity")
    WebElement billCity;

    @FindBy(name = "order.billState")
    WebElement billState;

    @FindBy(name = "order.billZip")
    WebElement billZip;

    @FindBy(name = "order.billCountry")
    WebElement billCountry;

    @FindBy(name = "shippingAddressRequired")
    WebElement shippingAddressCheckbox;

    @FindBy(name = "newOrder")
    WebElement newOrderBut;

    public void newOrderBut() {
        newOrderBut.click();
    }

    public void payment(String cardTypeData, String creditCardData, String expiryDateData, String firstNameData,
            String lastNameData, String address1Data, String address2Data, String cityData,
            String statedData, String zipData, String countryData, String shippingAddressData) {
        Select selectCardType = new Select(cardType);
        selectCardType.selectByValue(cardTypeData);
        creditCard.clear();
        creditCard.sendKeys(creditCardData);
        expiryDate.clear();
        expiryDate.sendKeys(expiryDateData);
        billToFirstName.clear();
        billToFirstName.sendKeys(firstNameData);
        billToLastName.clear();
        billToLastName.sendKeys(lastNameData);
        billAddress1.clear();
        billAddress1.sendKeys(address1Data);
        billAddress2.clear();
        billAddress2.sendKeys(address2Data);
        billCity.clear();
        billCity.sendKeys(cityData);
        billState.clear();
        billState.sendKeys(statedData);
        billZip.clear();
        billZip.sendKeys(zipData);
        billCountry.clear();
        billCountry.sendKeys(countryData);
        if (shippingAddressData == "TRUE") {
            shippingAddressCheckbox.click();
        }

    }

}

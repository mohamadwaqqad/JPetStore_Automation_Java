package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends TestBase {

    public CartPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Cart")
    WebElement cartDiv;

    @FindBy(name = "updateCartQuantities")
    WebElement updateCart;

    @FindBy(linkText = "Proceed to Checkout")
    WebElement proceedToCheckout;

    public boolean cartDivIsDisplayed() {
        return cartDiv.isDisplayed();
    }

    public void proceedToCheckoutLink() {
        proceedToCheckout.click();
    }

}

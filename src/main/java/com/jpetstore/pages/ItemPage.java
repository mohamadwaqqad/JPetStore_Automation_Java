package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage extends TestBase {

    public ItemPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Add to Cart")
    WebElement addToCart;

    public void addToCart() {
        addToCart.click();
    }

}

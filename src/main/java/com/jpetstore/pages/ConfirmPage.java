package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPage extends TestBase {

    public ConfirmPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Confirm")
    WebElement confirmLink;

    public void confirmLink() {
        confirmLink.click();
    }

}

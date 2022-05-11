package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends TestBase {

    public SearchPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Catalog")
    WebElement catalogDiv;

    public boolean catalogIsDisplayed() {
        return catalogDiv.isDisplayed();
    }

}

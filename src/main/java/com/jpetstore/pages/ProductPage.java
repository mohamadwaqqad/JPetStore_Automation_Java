package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestBase {

    public ProductPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Return to")
    WebElement returnToCategory;

    @FindBy(linkText = "EST-26")
    WebElement AdultMaleChihuahuaLink;

    public void returnto() {
        returnToCategory.click();
    }

    public void adultMaleChihuahuaLink() {
        AdultMaleChihuahuaLink.click();
    }

}

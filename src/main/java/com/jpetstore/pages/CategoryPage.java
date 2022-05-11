package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage extends TestBase {

    public CategoryPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Return to Main Menu")
    WebElement returnLink;

    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a")
    WebElement catalog1;

    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[7]/td[1]/a")
    WebElement catalogChihuahua;

    public void returnToMainMenuLink() {
        returnLink.click();
    }

    public void catalog1Link() {
        catalog1.click();
    }

    public void catalogChihuahuaLink() {
        catalogChihuahua.click();
    }
}

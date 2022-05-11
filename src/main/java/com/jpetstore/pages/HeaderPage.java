package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends TestBase {

    public HeaderPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='LogoContent']/a/img")
    WebElement logo;

    @FindBy(linkText = "Sign In")
    WebElement signInLink;

    @FindBy(name = "img_cart")
    WebElement imgCart;

    @FindBy(linkText = "?")
    WebElement helpLink;

    @FindBy(name = "keyword")
    WebElement searchBox;

    @FindBy(name = "searchProducts")
    WebElement searchButton;

    @FindBy(linkText = "My Account")
    WebElement myAccountLink;

    @FindBy(xpath = "//img[@src='../images/sm_fish.gif']")
    WebElement fishLink;

    @FindBy(xpath = "//img[@src='../images/sm_dogs.gif']")
    WebElement dogsLink;

    @FindBy(xpath = "//img[@src='../images/sm_reptiles.gif']")
    WebElement reptilesLink;

    @FindBy(xpath = "//img[@src='../images/sm_cats.gif']")
    WebElement catsLink;

    @FindBy(xpath = "//img[@src='../images/sm_birds.gif']")
    WebElement birdsLink;

    public void search(String wordSearch) {
        searchBox.sendKeys(wordSearch);
        searchButton.click();
    }

    public void imgCart() {
        imgCart.click();
    }

    public void signInLink() {
        signInLink.click();
    }

    public void helpLink() {
        helpLink.click();
    }

    public boolean logoImg() {
        return logo.isDisplayed();
    }

    public void fishLink() {
        fishLink.click();
    }

    public void dogsLink() {
        dogsLink.click();
    }

    public void reptilesLink() {
        reptilesLink.click();
    }

    public void catsLink() {
        catsLink.click();
    }

    public void birdsLink() {
        birdsLink.click();
    }

    public void myAccountLink() {
        myAccountLink.click();
    }
}

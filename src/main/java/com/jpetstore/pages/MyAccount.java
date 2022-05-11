package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyAccount extends TestBase {

    public MyAccount() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "password")
    WebElement newPassword;

    @FindBy(name = "repeatedPassword")
    WebElement repeatedPassword;

    @FindBy(name = "account.firstName")
    WebElement firstName;

    @FindBy(name = "account.lastName")
    WebElement lastName;

    @FindBy(name = "account.email")
    WebElement acEmail;

    @FindBy(name = "account.phone")
    WebElement acPhone;

    @FindBy(name = "account.address1")
    WebElement acAdress1;

    @FindBy(name = "account.address2")
    WebElement acAdress2;

    @FindBy(name = "account.city")
    WebElement acCity;

    @FindBy(name = "account.state")
    WebElement acState;

    @FindBy(name = "account.zip")
    WebElement acZip;

    @FindBy(name = "account.country")
    WebElement acCountry;

    @FindBy(name = "account.languagePreference")
    WebElement languagePreference;

    @FindBy(name = "account.favouriteCategoryId")
    WebElement favoriteCategory;

    @FindBy(name = "account.listOption")
    WebElement enableMyList;

    @FindBy(name = "account.bannerOption")
    WebElement enableMyBanner;

    @FindBy(name = "editAccount")
    WebElement editAccountBut;

    @FindBy(linkText = "My Orders")
    WebElement myOrdersLink;

    public void editAccountBut() {
        editAccountBut.click();
    }

    public void myOrdersLink() {
        myOrdersLink.click();
    }

    public void editAccount(String newPass, String rePass, String fName, String lName, String email,
            String phone, String address_1, String address_2, String city, String state, String zip, String country,
            String lang, String favCategory, String MyList, String MyBanner) {
        newPassword.sendKeys(newPass);
        repeatedPassword.sendKeys(rePass);
        firstName.clear();
        firstName.sendKeys(fName);
        lastName.clear();
        lastName.sendKeys(lName);
        acEmail.clear();
        acEmail.sendKeys(email);
        acPhone.clear();
        acPhone.sendKeys(phone);
        acAdress1.clear();
        acAdress1.sendKeys(address_1);
        acAdress2.clear();
        acAdress2.sendKeys(address_2);
        acCity.clear();
        acCity.sendKeys(city);
        acState.clear();
        acState.sendKeys(state);
        acZip.clear();
        acZip.sendKeys(zip);
        acCountry.clear();
        acCountry.sendKeys(country);
        Select selectLanguage = new Select(languagePreference);
        selectLanguage.selectByValue(lang);
        Select favoriteC = new Select(favoriteCategory);
        favoriteC.selectByValue(favCategory);
        boolean enableMyListckd = enableMyList.isSelected();
        boolean enableMyBannerckd = enableMyBanner.isSelected();
        if ((enableMyListckd == false & MyList == "TRUE") || (enableMyListckd == true & MyList == "FALSE")) {
            enableMyList.click();
        }
        if ((enableMyBannerckd == false & MyBanner == "TRUE")
                || (enableMyBannerckd == true & MyBanner == "FALSE")) {
            enableMyBanner.click();
        }
    }

}

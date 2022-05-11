package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends TestBase {

    public RegisterPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement userId;

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

    @FindBy(name = "newAccount")
    WebElement newAccount;

    @FindBy(name = "account.languagePreference")
    WebElement languagePreference;

    @FindBy(name = "account.favouriteCategoryId")
    WebElement favoriteCategory;

    @FindBy(name = "account.listOption")
    WebElement enableMyList;

    @FindBy(name = "account.bannerOption")
    WebElement enableMyBanner;

    public void register(String userID, String newPass, String rePass, String fName, String lName, String email,
            String phone, String address_1, String address_2, String city, String state, String zip, String country,
            String lang, String favCategory, String MyList, String MyBanner) {
        userId.sendKeys(userID);
        newPassword.sendKeys(newPass);
        repeatedPassword.sendKeys(rePass);
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        acEmail.sendKeys(email);
        acPhone.sendKeys(phone);
        acAdress1.sendKeys(address_1);
        acAdress2.sendKeys(address_2);
        acCity.sendKeys(city);
        acState.sendKeys(state);
        acZip.sendKeys(zip);
        acCountry.sendKeys(country);
        Select selectLanguage = new Select(languagePreference);
        selectLanguage.selectByValue(lang);
        Select favoriteC = new Select(favoriteCategory);
        favoriteC.selectByValue(favCategory);
        if (MyList == "TRUE") {
            enableMyList.click();
        }
        if (MyBanner == "TRUE") {
            enableMyBanner.click();
        }
        newAccount.click();
    }
}

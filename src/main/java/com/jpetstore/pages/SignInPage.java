package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends TestBase {

    public SignInPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement userName;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "signon")
    WebElement signOn;

    @FindBy(linkText = "Register Now!")
    WebElement registerLink;

    @FindBy(linkText = "My Account")
    WebElement myAccount;

    public void signIn() {
        userName.sendKeys(prop.getProperty("userName"));
        password.clear();
        password.sendKeys(prop.getProperty("password"));
        signOn.click();
    }

    public void signInTests(String uName, String pass) {
        userName.sendKeys(uName);
        password.clear();
        password.sendKeys(pass);
        signOn.click();
    }

    public boolean myAccount() {
        return myAccount.isDisplayed();
    }

    public void registerLink() {
        registerLink.click();
    }

}

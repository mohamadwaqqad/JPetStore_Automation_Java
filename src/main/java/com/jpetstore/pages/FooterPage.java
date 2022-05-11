package com.jpetstore.pages;

import java.io.IOException;

import com.jpetstore.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage extends TestBase {

    public FooterPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "www.mybatis.org")
    WebElement poweredBy;

    public String poweredByLink() {
        poweredBy.click();
        return driver.getCurrentUrl();
    }

}

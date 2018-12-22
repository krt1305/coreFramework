package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//https://wrappixel.com/demos/admin-templates/admin-pro/main/ui-notification.html
public class NotificationSamplePage {

    private final WebDriver driver;

    @FindBy(className = "tst1 btn btn-info")
    WebElement infoMessageBtn;

    @FindBy(className = "tst1 btn btn-info")
    WebElement warningMessageBtn;

    @FindBy(className = "tst1 btn btn-info")
    WebElement successMessageBtn;

    @FindBy(className = "tst1 btn btn-info")
    WebElement dangerMessageBtn;

    @FindBy(className = "jq-toast-single jq-has-icon jq-icon-info")
    WebElement infoPopUp;

    @FindBy(className = "jq-toast-single jq-has-icon jq-icon-warning")
    WebElement warningPopUp;

    @FindBy(className = "jq-toast-single jq-has-icon jq-icon-success")
    WebElement successPopUp;

    @FindBy(className = "jq-toast-single jq-has-icon jq-icon-danger")
    WebElement dangerPopUp;


    public NotificationSamplePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void goTo()
    {

    }
}

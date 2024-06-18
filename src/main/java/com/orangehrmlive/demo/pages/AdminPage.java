package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;

/**
 * 4.AdminPage - UserManagement, Job, Organization Tabs Locators and it's actions
 */
public class AdminPage extends Utility {
 @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUsersText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;


    public String getSystemUsersText() {
        Reporter.log("get " + systemUsersText);
        CustomListeners.test.log(Status.PASS, "get " + systemUsersText);
        return getTextFromElement(systemUsersText);
    }

    public void clickOnAddButton() {
        clickOnElement(addButton);
        Reporter.log("click " + addButton);
        CustomListeners.test.log(Status.PASS, "click " + addButton);
    }

}

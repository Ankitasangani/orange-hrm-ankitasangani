package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;

/**
 * 3.DashboardPage - Dashboard text Locator
 * and create appropriate methods for it.
 */
public class DashboardPage extends Utility {
 @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
    WebElement userProfileLogo;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutButton;

    public void clickOnUserProfileLogo() {
        clickOnElement(userProfileLogo);
        Reporter.log("click on " + userProfileLogo);
        CustomListeners.test.log(Status.PASS, "click on " + userProfileLogo);
    }

    public void clickOnLogoutButton() {
        clickOnElement(logoutButton);
        Reporter.log("click on " + logoutButton);
        CustomListeners.test.log(Status.PASS, "click on " + logoutButton);
    }

}

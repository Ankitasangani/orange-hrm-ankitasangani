package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;

/**
 * 2. HomePage - Store OrangeHRM logo, Admin, PIM, Leave,Dashboard, Welcome Text locatores
 * and create appropriate methods for it.
 */
public class HomePage extends Utility {
 @CacheLookup
    @FindBy(xpath = "//li[1]//a[1]//span[1]")
    WebElement adminTab;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement logo;


    public void clickOnAdminTab() {
        clickOnElement(adminTab);
        Reporter.log("click on " + adminTab);
        CustomListeners.test.log(Status.PASS, "click on " + adminTab);
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

}

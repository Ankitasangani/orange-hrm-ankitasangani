package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customelisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

/**
 * 5.ViewSystemUsersPage - System Users Text, Username Field, User Roll dropDown,
 * Employee Name Field,
 * Status Drop Down, Search Button, Reset Button, Add Button and Delete Button locators and it's
 * actions
 */
public class ViewSystemUsersPage extends Utility {


    @CacheLookup
    @FindBy(tagName = "h5")
    WebElement systemUser;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement userRoll;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement adminInUserDropDown;

    @CacheLookup
    @FindBy(xpath = "(//div[@class = 'oxd-select-wrapper'])[1]")
    WebElement userRoleDropDown;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement statusDropDown;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]")
    WebElement resetButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")
    WebElement addButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]/i[1]")
    WebElement deleteButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'rajesh')]")
    WebElement verify;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[8]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]")
    WebElement checkBox;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[3]/div[1]/div[1]/div[1]/div[3]/button[2]")
    WebElement yesDelete;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[@id='oxd-toaster_1']/div[1]")
    WebElement verifyMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'oxd-select-wrapper'][1]")
    WebElement userRoleDropdown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement selectAdminRoleDropdown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'ESS')]")
    WebElement selectESSRoleDropdown;

    @CacheLookup
    @FindBy(xpath = "(//div[@class = 'oxd-select-wrapper'])[2]")
    WebElement statusDropdown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Enabled')]")
    WebElement selectEnabledDropdown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Disabled')]")
    WebElement selectDisabledDropdown;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton1;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card']//div[@role='row']//div[@role='cell']")
    List<WebElement> userDetailsRow;

    @CacheLookup
    @FindBy(xpath = "//div[@role='table']//div[1]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]//i[1]")
    WebElement selectUserCheckbox;

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-container']//button[1]")
    WebElement deleteUserButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement yesDeleteButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement toasterSuccessDelete;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='(1) Record Found']")
    WebElement recordFoundText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-paper-container']/div[@class='orangehrm-container']/div[@role='table']/div[@role='rowgroup']/div[@class='oxd-table-card']/div[@role='row']/div[2]")
    WebElement usernameText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton1;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement empNameField;




    public String verifySystemUserSText() {
        String message = getTextFromElement(systemUser);
        Reporter.log("System Users" +systemUser.toString());
        CustomListeners.test.log(Status.PASS, "Get error message");
        return message;
    }

    public void enterUserName(String employeeUserName) {
        sendTextToElement(userName, employeeUserName);
        Reporter.log("Username" + userName.toString());
        CustomListeners.test.log(Status.PASS, "Enter user name" + employeeUserName);
    }

    public void clickOnUserRoleDropDown() {
        mouseHoverToElementAndClick(userRoleDropDown);
        Reporter.log("Click on user role " + userRoleDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Click on user role " + userRoleDropDown.toString());
    }

    public void cLickOnAdminRole() {
        clickOnElement(adminInUserDropDown);
        Reporter.log("Click on admin role " + adminInUserDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Click on admin role " + adminInUserDropDown.toString());
    }

    public void selectStatusEnabled() {
        selectByValueFromDropDown(statusDropDown, "Enabled");
        Reporter.log("Select Enabled" + statusDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select Enabled");
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
        Reporter.log("Search" + searchButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on search button");
    }

    public String verifyUserShouldBeInResultList() {
        String message = getTextFromElement(verify);
        Reporter.log("Result List" + verify.toString());
        CustomListeners.test.log(Status.PASS, "Get error message");
        return message;
    }


    public void clickOnAddButton() {
        clickOnElement(addButton);
        Reporter.log("Add" +addButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on Add Button");
    }

    public void clickOnCheckBox() {
        clickOnElement(checkBox);
        Reporter.log("Add" +checkBox.toString());
        CustomListeners.test.log(Status.PASS, "Click on Check Box");
    }

    public void clickOnDeleteButton() {
        clickOnElement(deleteButton);
        Reporter.log("Add" +deleteButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on delete Button");
    }

    public void clickOnOkButtonOnPopUp() {
        clickOnElement(yesDelete);
        Reporter.log("Add" +yesDelete.toString());
        CustomListeners.test.log(Status.PASS, "Click on Ok Button on popup");
    }

    public String verifySuccessfullyDeleted() {
        String message = getTextFromElement(verifyMessage);
        Reporter.log("Result List" + verifyMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get error message");
        return message;
    }




    public void enterUsername(String val) {
        sendTextToElement(usernameField, val);
        Reporter.log("enter " + val);
        CustomListeners.test.log(Status.PASS, "enter " + val);
    }

    public void clickOnRoleDropdown() {
        clickOnElement(userRoleDropdown);
        Reporter.log("click " + userRoleDropdown);
        CustomListeners.test.log(Status.PASS, "get " + userRoleDropdown);
    }

    public void selectRoleFromDropdown(String role) {
        if (role == "Admin")
            clickOnElement(selectAdminRoleDropdown);
        if (role == "ESS")
            clickOnElement(selectESSRoleDropdown);
        Reporter.log("click " + role);
        CustomListeners.test.log(Status.PASS, "click " + role);
    }

    public void selectStatusFromDropdown(String status) {
        if (status == "Enabled")
            clickOnElement(selectEnabledDropdown);
        if (status == "Disabled")
            clickOnElement(selectDisabledDropdown);
        Reporter.log("click " + status);
        CustomListeners.test.log(Status.PASS, "click " + status);
    }

    public void selectStatusDropdown() {
        clickOnElement(statusDropdown);
        Reporter.log("select " + statusDropdown);
        CustomListeners.test.log(Status.PASS, "select " + statusDropdown);
    }

    public void clickOnSearchButton1() {
        clickOnElement(searchButton);
        Reporter.log("click " + searchButton);
        CustomListeners.test.log(Status.PASS, "click " + searchButton);
    }

    public void clickOnResetButton() {
        clickOnElement(resetButton);
        Reporter.log("click " + resetButton);
        CustomListeners.test.log(Status.PASS, "click " + resetButton);
    }

    public List<String> getUserDetails() {
        List<String> userDetails = new ArrayList<>();
        List<WebElement> userDetails1 = userDetailsRow;
        for (WebElement e : userDetails1)
            userDetails.add(e.getText());
        return userDetails;
    }

    public void clickOnSelectUserCheckbox() {
        clickOnElement(selectUserCheckbox);
        Reporter.log("click " + selectUserCheckbox);
        CustomListeners.test.log(Status.PASS, "click " + selectUserCheckbox);
    }

    public void clickOnDeleteUserButton() {
        clickOnElement(deleteUserButton);
        Reporter.log("click " + deleteUserButton);
        CustomListeners.test.log(Status.PASS, "click " + deleteUserButton);
    }

    public void clickOnYesDeleteButton() {
        clickOnElement(yesDeleteButton);
        Reporter.log("click " + yesDeleteButton);
        CustomListeners.test.log(Status.PASS, "click " + yesDeleteButton);
    }

    public String getSuccessDeleteToasterMsg() {
        Reporter.log("click " + toasterSuccessDelete);
        CustomListeners.test.log(Status.PASS, "click " + toasterSuccessDelete);
        return getTextFromElement(toasterSuccessDelete);
    }

    public String getRecordFoundText() {
        Reporter.log("get " + recordFoundText);
        CustomListeners.test.log(Status.PASS, "get " + recordFoundText);
        return getTextFromElement(recordFoundText);
    }

    public String getUsernameText() {
        Reporter.log("get " + usernameText);
        CustomListeners.test.log(Status.PASS, "get " + usernameText);
        return getTextFromElement(usernameText);
    }

    public void enterEmpName(String val) {
        sendTextToElement(empNameField, val);
        Reporter.log("enter " + empNameField);
        CustomListeners.test.log(Status.PASS, "enter " + empNameField);
    }


}

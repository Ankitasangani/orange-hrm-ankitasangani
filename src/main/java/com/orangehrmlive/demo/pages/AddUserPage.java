package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customelisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * 6.AddUserPage - User Role Drop Down, Employee Name, Username, Status Drop Down,
 * Password, Confirm Password,
 * Save and Cancle Button Locators and it's actions
 */
public class AddUserPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
    WebElement adminTab;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/h6[1]")
    WebElement addUser;

    @CacheLookup
    @FindBy(xpath = "(//div[@class = 'oxd-select-wrapper'])[1]")
    WebElement userRoleDropdown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement selectAdminRoleDropdown;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement name;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Enabled')]")
    WebElement selectEnabledDropdown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Disabled')]")
    WebElement selectDisabledDropdown;

    @CacheLookup
    @FindBy(xpath = "(//div[@class = 'oxd-select-wrapper'])[2]")
    WebElement userStatusDropdown;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Disabled')]")
    WebElement selectAbleDropdown;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")
    WebElement saveButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement verify;


    public void clickOnAdminTab() {
        clickOnElement(adminTab);
        Reporter.log("Admin" + adminTab.toString());
        CustomListeners.test.log(Status.PASS, "Click on Admin Tab");
    }

    public String verifyAddUserText() {
        String message = getTextFromElement(addUser);
        Reporter.log("Add User" + addUser.toString());
        CustomListeners.test.log(Status.PASS, "Get error message");
        return message;
    }

    public void clickOnRoleDropdown() {
        clickOnElement(userRoleDropdown);
        Reporter.log("click " + userRoleDropdown);
        CustomListeners.test.log(Status.PASS, "get " + userRoleDropdown);
    }

    public void selectAdminRoleFromDropdown() {
        clickOnElement(selectAdminRoleDropdown);
        Reporter.log("click " + selectAdminRoleDropdown);
        CustomListeners.test.log(Status.PASS, "click " + selectAdminRoleDropdown);
    }

    public void enterEmployeeName(String employeeName) {
        sendTextToElement(name, employeeName);   // Ranga  Akunuri
        Reporter.log("Enter Employee Name" + name.toString());
        CustomListeners.test.log(Status.PASS, "Enter employee name" + employeeName);
    }

    public void enterUserName(String employeeUserName) {
        sendTextToElement(userName, employeeUserName);
        Reporter.log("Username" + userName.toString());
        CustomListeners.test.log(Status.PASS, "Enter user name" + employeeUserName);
    }

    public void clickOnStatusDropdown() {
        clickOnElement(userStatusDropdown);
        Reporter.log("click " + userStatusDropdown);
        CustomListeners.test.log(Status.PASS, "get " + userStatusDropdown);
    }


    public void selectStatusFromDropdown(String status) {
        if (status == "Enabled")
            clickOnElement(selectEnabledDropdown);
        if (status == "Disabled")
            clickOnElement(selectDisabledDropdown);
        Reporter.log("click " + status);
        CustomListeners.test.log(Status.PASS, "click " + status);
    }

//    public void selectStatusDisabled() {
//        clickOnElement(selectAbleDropdown);
//        Reporter.log("Select disabled" +selectAbleDropdown.toString());
//        CustomListeners.test.log(Status.PASS, "Select Disabled");
//    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        Reporter.log("Password" + passwordField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
        Reporter.log("Confirm Password" + confirmPasswordField.toString());
        CustomListeners.test.log(Status.PASS, "Enter confirm Password " + confirmPassword);
    }

    public void clickOnSaveButton() {
        clickOnElement(saveButton);
        Reporter.log("Save" + saveButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on save button");
    }

    public String verifySuccessfullySaved() {
        String message = getTextFromElement(verify);
        Reporter.log("Successfully Saved" + verify.toString());
        CustomListeners.test.log(Status.PASS, "Get error message");
        return message;
    }

}

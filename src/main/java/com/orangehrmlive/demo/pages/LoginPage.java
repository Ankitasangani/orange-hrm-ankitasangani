package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customelisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * 1.LoginPage - Store username, password, Login Button and LOGIN Panel text Locators
 * and create appropriate methods for it.
 */
public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[8]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]")
    WebElement logo;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'manda user')]")
    WebElement profile;

    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")
    WebElement dropdown;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logout;

    @CacheLookup
    @FindBy(tagName = "h5")
    WebElement loginText;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement loginErrorMessage;

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
        Reporter.log("Username" + usernameField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Username " + username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        Reporter.log("Password" + passwordField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        Reporter.log("Login button" + loginButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on loginButton");
    }

    // Method to verify if the image is displayed
    public boolean logoIsDisplayed() {
        boolean message = logo.isDisplayed();
        Reporter.log("logo" + logo.toString());
        CustomListeners.test.log(Status.PASS, "Get error message");
        return message;
    }

    //  Method to verify if the image has the correct source URL
    public boolean isImageSourceCorrect(String expectedSrc) {
        String actualSrc = logo.getAttribute("src");
        Reporter.log("logo" + logo.toString());
        CustomListeners.test.log(Status.PASS, "Get error message");
        return actualSrc.equals(expectedSrc);
    }

    public void clickOnUserProfileLogo() {
        clickOnElement(profile);
        Reporter.log("user profile" + profile.toString());
        CustomListeners.test.log(Status.PASS, "Click on user profile logo");
    }

    public void mouseHoverAndClickOnLogOut() {
        clickOnElement(dropdown);
        mouseHoverToElementAndClick(logout);
        Reporter.log("Logout" + logout.toString());
        CustomListeners.test.log(Status.PASS, "Click on user profile logo");
    }

    public String verifyLoginPanel() {
        String message = getTextFromElement(loginText);
        Reporter.log("Login" + loginText.toString());
        CustomListeners.test.log(Status.PASS, "Get error message");
        return message;
    }


    public void loginToApp(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickOnLoginButton();
    }

    public String getLoginErrorMsg() {
        Reporter.log("get " + loginErrorMessage);
        CustomListeners.test.log(Status.PASS, "get " + loginErrorMessage);
        return getTextFromElement(loginErrorMessage);
    }

}

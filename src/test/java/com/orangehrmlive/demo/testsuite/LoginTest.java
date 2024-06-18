package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customelisteners.CustomListeners;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;


@Listeners(CustomListeners.class)
public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
    }


    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.enterUsername("Admin"); // Enter username
        loginPage.enterPassword("admin123"); // Enter password
        loginPage.clickOnLoginButton(); // Click on Login Button
    }


    @Test(groups = {"smoke", "regression"})
    public void verifyThatTheLogoDisplayOnHomePage() {
        // Login to Application
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();

        // Verify if the logo is displayed
        Assert.assertTrue(loginPage.logoIsDisplayed(), "Logo is not displayed");

        // Verify Logo is Displayed
        String expectedSrc = "/web/images/orangehrm-logo.png?v=1711595107870";
        Assert.assertTrue(loginPage.isImageSourceCorrect(expectedSrc), "Logo didn't match!");

    }


    @Test(groups = {"regression"})
    public void verifyUserShouldLogOutSuccessFully() throws InterruptedException {
        // Login to Application
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);
        loginPage.clickOnUserProfileLogo();
        loginPage.mouseHoverAndClickOnLogOut();
        // Verify the text "Login Panel" is displayed
        String expectedMessage = "Login";
        String actualMessage = loginPage.verifyLoginPanel();
        Assert.assertEquals(expectedMessage, actualMessage, "Text didn't match!");

    }

    @Test(groups = {"regression"})
    public void verifyErrorMessageWithInvalidCredentials() {
        loginPage.enterUsername(""); // Enter username
        loginPage.enterPassword(""); // Enter password
        loginPage.clickOnLoginButton(); // Click on Login Button



    }

    @Test(groups = {"regression"}, dataProvider = "loginData", dataProviderClass = TestData.class)
    public void verifyErrorMessageWithInvalidCredentials(String username, String pwd, String errorMsg) {
        loginPage.loginToApp(username,pwd);          //login
        Assert.assertEquals(loginPage.getLoginErrorMsg(), errorMsg);
    }

}

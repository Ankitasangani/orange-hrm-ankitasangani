package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customelisteners.CustomListeners;
import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

/**
 * 1.UsersTest
 * Inside UsersTest class create following testmethods
 * 1.adminShouldAddUserSuccessFully().
 * Login to Application
 * click On "Admin" Tab
 * Verify "System Users" Text
 * click On "Add" button
 * Verify "Add User" Text
 * Select User Role "Admin"
 * enter Employee Name "Ananya Dash"
 * <p>
 * enter Username
 * Select status "Disable"
 * enter psaaword
 * enter Confirm Password
 * click On "Save" Button
 * verify message "Successfully Saved"
 * 2. searchTheUserCreatedAndVerifyIt().
 * Login to Application
 * click On "Admin" Tab
 * Verify "System Users" Text
 * Enter Username
 * Select User Role
 * Select Satatus
 * Click on "Search" Button
 * Verify the User should be in Result list.
 * 3. verifyThatAdminShouldDeleteTheUserSuccessFully().
 * Login to Application
 * click On "Admin" Tab
 * Verify "System Users" Text
 * Enter Username
 * Select User Role
 * Select Satatus
 * Click on "Search" Button
 * Verify the User should be in Result list.
 * Click on Check box
 * Click on Delete Button
 * Popup will display
 * Click on Ok Button on Popup
 * verify message "Successfully Deleted"
 * 4. searchTheUserAndVerifyTheMessageRecordFound().
 * Login to Application
 * click On "Admin" Tab
 * Verify "System Users" Text
 * Enter Username <username>
 * Select User Role <userRole>
 * Enter EmployeeName <employeeName>
 * Select Satatus <status>
 * Click on "Search" Button
 * verify message "(1) Record Found"
 * Verify username <username>
 * Click on Reset Tab
 */

@Listeners(CustomListeners.class)
public class UsersTest extends BaseTest {

    ViewSystemUsersPage viewSystemUsersPage;
    AddUserPage addUserPage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        viewSystemUsersPage = new ViewSystemUsersPage();
        addUserPage = new AddUserPage();
        loginPage = new LoginPage();
    }


    @Test(groups = {"sanity", "smoke", "regression"})
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        // Login to Application
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        addUserPage.clickOnAdminTab(); // click On "Admin" Tab

        // Verify "System Users" Text
        String expectedMessage = "System Users";
        String actualMessage = viewSystemUsersPage.verifySystemUserSText();
        Assert.assertEquals(expectedMessage, actualMessage, "Text didn't match!");
        // click On "Add" button
        viewSystemUsersPage.clickOnAddButton();
        // Verify "Add User" Text
        String expectedText = "Add User";
        String actualText = addUserPage.verifyAddUserText();
        Assert.assertEquals(expectedText, actualText, "Text didn't match!");
        addUserPage.clickOnRoleDropdown();
        addUserPage.selectAdminRoleFromDropdown(); // Select User Role "Admin"
        addUserPage.enterEmployeeName("Ranga Akunuri");  // enter Employee Name "Ranga  Akunuri"
        addUserPage.enterUserName("Ranga");  // enter Username
        Thread.sleep(2000);
        viewSystemUsersPage.selectStatusDropdown();
        viewSystemUsersPage.selectStatusFromDropdown("Enabled"); // Select Status
        addUserPage.enterPassword("ranga12345"); // enter password
        addUserPage.enterConfirmPassword("ranga12345"); // enter Confirm Password
        addUserPage.clickOnSaveButton(); // click On "Save" Button
        Thread.sleep(2000);
        // verify message "Successfully Saved"
        String expectedText1 = "Successfully Saved";
        String actualText1 = addUserPage.verifySuccessfullySaved();
        Assert.assertEquals(expectedText1, actualText1, "Text didn't match!");

    }


    @Test(groups = {"smoke", "regression"})
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        // Login to Application
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        addUserPage.clickOnAdminTab();  // click On "Admin" Tab
        // Verify "System Users" Text
        String expectedMessage = "System Users";
        String actualMessage = viewSystemUsersPage.verifySystemUserSText();
        Assert.assertEquals(expectedMessage, actualMessage, "Text didn't match!");
        //viewSystemUsersPage.enterUserName("uvylfqeYRO"); // Enter Username
        viewSystemUsersPage.clickOnUserRoleDropDown();
        viewSystemUsersPage.cLickOnAdminRole(); // Select User Role
        viewSystemUsersPage.selectStatusDropdown();
        Thread.sleep(2000);
        viewSystemUsersPage.selectStatusDropdown();
        viewSystemUsersPage.selectStatusFromDropdown("Enabled");// select status
        viewSystemUsersPage.clickOnSearchButton(); // Click on "Search" Button
        Thread.sleep(2000);
        // Verify the User should be in Result list
        String expectedText1 = "uvylfqeYRO";
        String actualText1 = viewSystemUsersPage.verifyUserShouldBeInResultList();
        Assert.assertEquals(expectedText1, actualText1, "Text didn't match!");
    }


    @Test(groups = {"regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        // Login to Application
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        addUserPage.clickOnAdminTab();  // click On "Admin" Tab
        // Verify "System Users" Text
        String expectedMessage = "System Users";
        String actualMessage = viewSystemUsersPage.verifySystemUserSText();
        Assert.assertEquals(expectedMessage, actualMessage, "Text didn't match!");
        viewSystemUsersPage.enterUserName("rajesh"); // Enter Username
        viewSystemUsersPage.clickOnUserRoleDropDown();
        viewSystemUsersPage.cLickOnAdminRole(); // Select User Role
        viewSystemUsersPage.selectStatusEnabled(); // Select Status
        viewSystemUsersPage.clickOnSearchButton(); // Click on "Search" Button
        Thread.sleep(2000);
        // Verify the User should be in Result list
        String expectedText1 = "rajesh";
        String actualText1 = viewSystemUsersPage.verifyUserShouldBeInResultList();
        Assert.assertEquals(expectedText1, actualText1, "Text didn't match!");
        viewSystemUsersPage.clickOnCheckBox(); // Click on Check box
        viewSystemUsersPage.clickOnDeleteButton();  // Click on Delete Button
        viewSystemUsersPage.clickOnOkButtonOnPopUp(); // Click on Ok Button on Popup
        // verify message "Successfully Deleted"
        String expectedText2 = "Successfully Deleted";
        String actualText2 = viewSystemUsersPage.verifySuccessfullyDeleted();
        Assert.assertEquals(expectedText2, actualText2, "Text didn't match!");

    }


    @Test(groups = {"regression"}, dataProvider = "searchUserData", dataProviderClass = TestData.class)
    public void searchTheUserAndVerifyTheMessageRecordFound(String username, String role, String empName, String status) throws InterruptedException {
        // Login to Application
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        addUserPage.clickOnAdminTab();  // click On "Admin" Tab
        // Verify "System Users" Text
        String expectedMessage = "System Users";
        String actualMessage = viewSystemUsersPage.verifySystemUserSText();
        Assert.assertEquals(expectedMessage, actualMessage, "Text didn't match!");

        //enter details and click on search
        viewSystemUsersPage.enterUsername(username); // Enter Username <username>
        //viewSystemUsersPage.enterEmpName(empName); // Enter EmployeeName <employeeName>
        viewSystemUsersPage.clickOnRoleDropdown();
        viewSystemUsersPage.selectRoleFromDropdown(role);// Select User Role <userRole>
        viewSystemUsersPage.selectStatusDropdown();
        viewSystemUsersPage.selectStatusFromDropdown(status); // Select Status <status>

        Thread.sleep(2000);
        viewSystemUsersPage.clickOnSearchButton(); // Click on "Search" Button
        // verify message "(1) Record Found"
        Assert.assertEquals(viewSystemUsersPage.getRecordFoundText(), "(1) Record Found");
        Assert.assertEquals(viewSystemUsersPage.getUsernameText(), username);         //verify username
        viewSystemUsersPage.clickOnResetButton();           //reset all data
    }

}

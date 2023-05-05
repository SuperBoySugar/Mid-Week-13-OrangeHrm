package com.orangehrm.demo.testsuite;

import com.orangehrm.demo.pages.AddUserPage;
import com.orangehrm.demo.pages.AdminPage;
import com.orangehrm.demo.pages.DashBoardpage;
import com.orangehrm.demo.pages.LoginPage;
import com.orangehrm.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    DashBoardpage dashBoardpage = new DashBoardpage();
    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage = new AdminPage();

    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        //Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginBtn();
        //click On "Admin" Tab
        dashBoardpage.clickOnAdminTab();
        //Verify "System Users" Text
        dashBoardpage.verifyTextSystemUser();
        //click On "Add" button
        dashBoardpage.clickOnAddBtn();
        //Verify "Add User" Text
        addUserPage.verifyTextAddUser();
        //Select User Role "Admin"
        addUserPage.clickOnUserRole();
        //enter Employee Name "Ananya Dash"
        addUserPage.inputEmployeeName("Lisa Andrews");
        //enter Username
        addUserPage.inputUserName(getRandomString());
        //Select status "Disable"
        addUserPage.selectStatusDisable();
        //enter psaaword
        addUserPage.inputPasswordField("Sweetpickle99*");
        //enter Confirm Password
        addUserPage.inputConfirmPasswordField("Sweetpickle99*");
        //click On "Save" Button
        addUserPage.clickOnSaveBtn();
        //verify message "Successfully Saved"
        addUserPage.verifySuccessMessage();
    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        Thread.sleep(1000);
        //Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginBtn();
        //click On "Admin" Tab
        dashBoardpage.clickOnAdminTab();
        //Verify "System Users" Text
        adminPage.verifyTextSystemUsers();
        //Enter Username
        adminPage.inputUserNameField("Ananya Das");
        //Select User Role
        adminPage.clickOnUserRole();
        adminPage.inputEmployeeName("Lisa Andrews");
        //Select Status
        adminPage.selectStatus();
        //Click on "Search" Button
        adminPage.clickOnSearchBtn();
        //Verify the User should be in Result list.
        adminPage.verifyTextRecordFound();
    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {

        //Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginBtn();
        //click On "Admin" Tab
        dashBoardpage.clickOnAdminTab();
        //Verify Text System Users
        adminPage.verifyTextSystemUsers();
        //Enter Username
        adminPage.inputUserNameField("Ananya Das");
        //Select User Role
        adminPage.clickOnUserRole();
        adminPage.inputEmployeeName("Lisa Andrews");
        //Select Status
        adminPage.selectStatus();
        //Click on "Search" Button
        adminPage.clickOnSearchBtn();
        //Verify the User should be in Result list.
        adminPage.verifyTextRecordFound();
        //Click on Check box
        adminPage.clickOnCheckbox();
        //Click on Delete Button
        adminPage.clickOnDeleteBtn();
        //Popup will display

        //Click on Ok Button on Popup
        adminPage.clickOnPopup();
        //verify message "Successfully Deleted"
        adminPage.verifyDeleteMessage();
    }

    @Test
    public void searchTheDelectedAndVerifyTheMessageNoRecordFound() throws InterruptedException {

        //Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginBtn();
        //click On "Admin" Tab
        dashBoardpage.clickOnAdminTab();
        //Enter Username
        adminPage.inputUserNameField("Ananya Das");
        //Select User Role
        adminPage.clickOnUserRole();
        //Select Status
        adminPage.selectStatus();
        //Click on "Search" Button
        adminPage.clickOnSearchBtn();
        //verify message "No Records Found"

    }


}

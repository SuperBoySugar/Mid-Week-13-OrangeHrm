package com.orangehrm.demo.testsuite;

import com.orangehrm.demo.pages.AddUserPage;
import com.orangehrm.demo.pages.DashBoardpage;
import com.orangehrm.demo.pages.LoginPage;
import com.orangehrm.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    DashBoardpage dashBoardpage = new DashBoardpage();
    AddUserPage addUserPage = new AddUserPage();


    @Test
    public void verifyUserShouldLoginSuccessfully() {
        // Enter username
        loginPage.enterUserName("Admin");
        //Enter password
        loginPage.enterPassword("admin123");
        //Click on Login Button
        loginPage.clickOnLoginBtn();
        // Verify "Dashboard" Message
        dashBoardpage.verifyTextDashboard();
    }

    @Test
    public void verifyThatTheLogoDisplayOnLoginPage() {
        // Launch the application
        //Verify Logo is Displayed
//        dashBoardpage.verifyTextCompanyLogo();

    }

    @Test
    public void VerifyUserShouldLogOutSuccessFully() {
        // Enter username
        loginPage.enterUserName("Admin");
        //Enter password
        loginPage.enterPassword("admin123");
        //Click on Login Button
        loginPage.clickOnLoginBtn();
        // Click on User Profile logo
        addUserPage.clickOnUserProfileLogo();
        // Mouse hover on "Logout" and click
        addUserPage.mouseHoverAndClickOnLogoutButton();
        //  Verify the text "Login Panel" is displayed
        loginPage.verifyLoginText();
    }

}

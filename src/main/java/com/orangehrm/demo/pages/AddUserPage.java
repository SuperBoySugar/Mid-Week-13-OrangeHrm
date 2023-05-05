package com.orangehrm.demo.pages;

import com.orangehrm.demo.utility.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {

    By addUser = By.xpath("//h6[text()='Add User']");
    By userRole = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By admin = By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']/div[2]");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By dropDown = By.xpath("//div[@role='listbox']");
    By userName = By.cssSelector(".oxd-form .oxd-form-row:nth-of-type(1) [autocomplete]");
    By status = By.cssSelector(".oxd-form .oxd-grid-item--gutters:nth-of-type(3) [tabindex]");
    By disabled = By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']/div[3]");
    By password = By.cssSelector(".user-password-row .user-password-cell input.oxd-input[type='password']");
    By confirmPassword = By.cssSelector("div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[type='password']");
    By saveBtn = By.cssSelector("button[type='submit']");
    By successMessage = By.xpath("//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']");
    By userProfileLogo = By.xpath("//span[@class='oxd-userdropdown-tab']");
    By logoutBtn = By.xpath("//a[text()='Logout']");



    public void verifyTextAddUser() {
        verifyText("Add User", addUser, "Page is not displayed");
    }

    public void clickOnUserRole() throws InterruptedException {
        pmClickOnElement(userRole);
        Thread.sleep(1000);
        pmClickOnElement(admin);
    }

    public void inputEmployeeName(String employeeName1) throws InterruptedException {
        sendTextToElement(employeeName, employeeName1);
        Thread.sleep(1000);
        doMouseHoverAndClick(dropDown);
    }

    public void inputUserName(String userName1) {
        sendTextToElement(userName, userName1);
    }

    public void selectStatusDisable() {
        pmClickOnElement(status);
        pmClickOnElement(disabled);
    }

    public void inputPasswordField(String password1) {
        sendTextToElement(password, password1);
    }

    public void inputConfirmPasswordField(String confirmPassword1) {
        sendTextToElement(confirmPassword, confirmPassword1);
    }

    public void clickOnSaveBtn() throws InterruptedException {
        Thread.sleep(1000);
        pmClickOnElement(saveBtn);
    }

    public void verifySuccessMessage(){
        verifyText("Success\nSuccessfully Saved\n×", successMessage, "Error");
    }

    public void clickOnUserProfileLogo(){
        pmClickOnElement(userProfileLogo);
    }

    public void mouseHoverAndClickOnLogoutButton(){
        doMouseHoverAndClick(logoutBtn);
    }

}

package com.orangehrm.demo.pages;

import com.orangehrm.demo.utility.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By systemUsers = By.xpath("//h5[text()='System Users']");
    By userName = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By userRole = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]");
    By admin = By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']/div[2]");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By dropDown = By.xpath("//div[@role='listbox']");
    By status = By.cssSelector("[class] .oxd-grid-item--gutters:nth-of-type(4)[tabindex]");
    By disabled = By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']/div[3]");
    By searchBtn = By.cssSelector("button[type='submit']");
    By recordFound = By.xpath("//span[normalize-space()='(1) Record Found']");
    By checkbox = By.xpath("//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    By deleteSelected = By.xpath("//button[text()='Delete Selected']");
    By popup = By.xpath("");
    By deleteMessage = By.xpath("");


    public void verifyTextSystemUsers() {
        verifyText("System Users", systemUsers, "Text is not displayed");
    }

    public void inputUserNameField(String userName2) {
        sendTextToElement(userName, userName2);
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

    public void selectStatus() {
        pmClickOnElement(status);
        pmClickOnElement(disabled);
    }

    public void clickOnSearchBtn() {
        pmClickOnElement(searchBtn);
    }

    public void verifyTextRecordFound() {
        verifyText("(1) Record Found", recordFound, "Record not found");
    }

    public void clickOnCheckbox() {
        pmClickOnElement(checkbox);
    }

    public void clickOnDeleteBtn() {
        pmClickOnElement(deleteSelected);
    }

    public void clickOnPopup() {
        pmClickOnElement(popup);
    }

    public void verifyDeleteMessage() {
        verifyText("Successfully Deleted", deleteSelected, "User is not deleted");
    }

}

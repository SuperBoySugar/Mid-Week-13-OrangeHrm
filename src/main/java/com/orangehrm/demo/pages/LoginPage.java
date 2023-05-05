package com.orangehrm.demo.pages;

import com.orangehrm.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By username = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");
    By loginBtn = By.xpath("//button[@type='submit']");
    By logo = By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");
    By loginText = By.xpath("//h5[contains(.,'Login')]");


    public void enterUserName(String username1) {
        sendTextToElement(username, username1);
    }

    public void enterPassword(String pass) {
        sendTextToElement(password, pass);
    }

    public void clickOnLoginBtn() {
        pmClickOnElement(loginBtn);
    }

    public void verifyLogoIsDisplayed(){

    }

    public void verifyLoginText(){
        verifyText("Login", loginText, "Login text not displayed");
    }



}

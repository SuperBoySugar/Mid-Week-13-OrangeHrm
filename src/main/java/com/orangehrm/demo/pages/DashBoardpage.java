package com.orangehrm.demo.pages;

import com.orangehrm.demo.utility.Utility;
import org.openqa.selenium.By;

public class DashBoardpage extends Utility {

    By admin = By.cssSelector("li:nth-child(1) > a:nth-child(1) > span:nth-child(2)");
    By systemUser = By.xpath("//h5[text()='System Users']");
    By addBtn = By.xpath("//button[text()=' Add ']");
    By dashBoard = By.xpath("//h6[text()='Dashboard']");
    By companyLogo = By.xpath("//img[@alt='OrangeHRM']");




    public void clickOnAdminTab(){
        pmClickOnElement(admin);
    }

    public void verifyTextSystemUser(){
        verifyText("System Users",systemUser,"Text is incorrect");
    }

    public void clickOnAddBtn(){
        pmClickOnElement(addBtn);
    }

    public void verifyTextDashboard(){
        verifyText("Dashboard",dashBoard,"Page is not displayed");
    }

    public void verifyTextCompanyLogo(){
        verifyText("OrangeHRM",companyLogo,"Logo is not correct");
    }




}

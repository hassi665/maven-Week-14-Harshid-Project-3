package com.herokuapp.pages;

import com.herokuapp.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//i[contains(text(),'Login')]");
    By getSuccessfullyLoginMessage = By.xpath("//h2[contains(text(),'Secure Area')]");
    By errorMessageForInvalidUser = By.xpath("//div[contains(text(),\"Your username is invalid!\")]");
    By errorMessageForInvalidPass = By.xpath("//div[contains(text(),\"Your password is invalid!\")]");



    public void enterUserName(String username) {
        sendTextToElement(userNameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getSuccefullyScreenMessage(){
        return getTextFromElement(getSuccessfullyLoginMessage);
    }

    public String getErrorMessageForInvalidUserName() {
        return getTextFromElement(errorMessageForInvalidUser);
    }

    public String getErrorMessageForInvalidPassword(){
        return getTextFromElement(errorMessageForInvalidPass);
    }

}

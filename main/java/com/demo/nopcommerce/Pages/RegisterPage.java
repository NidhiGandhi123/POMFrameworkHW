package com.demo.nopcommerce.Pages;

import com.demo.nopcommerce.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;
    Utils utils;

    By RegisterLink = By.className("ico-register");
    By sex = By.id("gender-female");
    By FName = By.id("FirstName");
    By LName = By.id("LastName");
    By DOB = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
    By MOB = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
    By YOB = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
    By EmailADD = By.id("Email");
    By ComName = By.id("Company");
    By Pwd = By.id("Password");
    By ConfirmPWD = By.id("ConfirmPassword");
    By RegisterButton = By.xpath("//*[@id=\"register-button\"]");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        utils = new Utils(driver);

    }

    public void clickRegisterLink() {
        utils.doClick(RegisterLink);
    }

    public void clickRegisterBTN() {
        utils.doClick(RegisterButton);
    }

    public void clickGender() {
        // select gender
        utils.doClick(sex);
    }

    public void doRegister(String gender, String FirstName, String LastName, String Day, String Month, String Year, String Email, String CompanyName, String Password, String ConfirmPassword) {
       // set values
        utils.doSendkey(sex, gender);
        utils.doSendkey(FName, FirstName);
        utils.doSendkey(LName, LastName);
        utils.doSendkey(DOB, Day);
        utils.doSendkey(MOB, Month);
        utils.doSendkey(YOB, Year);
        utils.doSendkey(EmailADD, Email);
        utils.doSendkey(ComName, CompanyName);
        utils.doSendkey(Pwd, Password);
        utils.doSendkey(ConfirmPWD, ConfirmPassword);
        // Click on register
        utils.doClick(RegisterButton);

    }
}
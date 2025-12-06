package com.gartner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GartnerPulseSurveysPage {

    private WebDriver driver;

    public GartnerPulseSurveysPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void checkRememberMe(boolean check) {
        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));

        if (check && !checkbox.isSelected()) {
            checkbox.click();
        } else if (!check && checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public void clickLogin() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public void clickForgotPassword() {
        driver.findElement(By.cssSelector("a[href]")).click();
    }
}

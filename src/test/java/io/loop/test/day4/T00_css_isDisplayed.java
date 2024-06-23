package io.loop.test.day4;

import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T00_css_isDisplayed {

    /*
    https://the-internet.herokuapp.com/forgot_password
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/forgot_password");

        WebElement forgotPasswordHeading = driver.findElement(By.cssSelector("div[class='example']>h2"));

        System.out.println("forgotPasswordHeading.getText() = " + forgotPasswordHeading.getText());

        System.out.println("forgotPasswordHeading.isDisplayed() = " + forgotPasswordHeading.isDisplayed());

        if(forgotPasswordHeading.isDisplayed()){
            System.out.println("Test pass");
        } else {
            System.out.println("Test fail");
        }
    }
}